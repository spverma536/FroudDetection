package com.iris.insuranceFraudDetection;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.storage.StorageLevel;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaReceiverInputDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.receiver.Receiver;

public class GenerateInsuranceData extends Receiver<String> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(GenerateInsuranceData.class);
	public static SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
	static JavaDStream<String> records;
	static JavaRDD<String> recordsNew;
	static List<String> record;
	static Iterator<String> recordItr;
	static List<String> finalRecord;
	static int weightage = 0;
	static int score = 0;
	static boolean fraud = false;
	static JavaSparkContext sc;
	static JavaRDD<String> qqw;
	static JavaRDD<String> fin;
	static JavaRDD<String> weightageRDD;
	static String recordArr[];
	static JavaRDD<String> joinRDD;
	static JavaRDD<String> joinRDD1;
	static JavaPairRDD<String, String> weightageRDD1;
	static List<JavaRDD<String>> dStreamRDDList;
	static JavaRDD<String> input;
	static JavaRDD<String> t;

	public static void main(String[] args) throws Exception {

		SparkConf sparkConf = new SparkConf().setAppName("GenerateInsuranceData");

		@SuppressWarnings("resource")
		JavaStreamingContext ssc = new JavaStreamingContext(sparkConf, Durations.seconds(15));
		GenerateInsuranceData jcr = new GenerateInsuranceData("localhost", 9971);
		JavaReceiverInputDStream<String> lines = ssc.receiverStream(jcr);

		records = lines.flatMap(new FlatMapFunction<String, String>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public Iterator<String> call(String t) throws Exception {
				return Arrays.asList(t.split("\\n")).iterator();
			}
		}).cache();

		records.foreachRDD(new VoidFunction<JavaRDD<String>>() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void call(JavaRDD<String> t) throws Exception {
				if (!(t.partitions().isEmpty())) {

					t.foreach(new VoidFunction<String>() {
						/**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						public void call(String t) throws Exception {
							recordArr = t.split(",");
							record = Arrays.asList(recordArr);
						}
					});

					weightageRDD = t.map(new Function<String, String>() {
						/**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						public String call(String v1) throws Exception {
							int score = processing();
							if (score > 18) {
								fraud = true;
							} else {
								fraud = false;
							}
							return v1 + "," + score + "," + fraud;
						}
					}).cache();

					// weightageRDD.saveAsTextFile("hdfs://localhost:54310/fraud/trytosavenew24.txt");
					weightageRDD.saveAsTextFile("/fraud/Test1");
					// weightageRDD.zipWithUniqueId().saveAsTextFile("dictionary/trytosave5.txt");

				} else {
					System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
				}
			}
		});

		ssc.start();
		ssc.awaitTermination();

	}

	public static int processing() throws ParseException {

		weightage = 0;

		// Rule 1
		if (record.get(0) == "true") {
			weightage = weightage + 3;
		}

		// Rule 6 and 16
		if (Integer.parseInt(record.get(23)) > 300000) {
			weightage += 4;
		} else if (Integer.parseInt(record.get(23)) > 500000) {
			weightage += 4;
		}

		// Rule7
		if ((record.get(26) == "null" && record.get(27) == "null" && record.get(28) == "null")
				&& (record.get(32) == "null" || record.get(33) == "null" || record.get(34) == "null")) {
			weightage += 2;
		}

		// Rule 8
		if (record.get(39).equals("221301") || record.get(39).equals("201301") || record.get(39).equals("110092")) {
			weightage += 4;
		}

		// Rule 9
		if (record.get(2).equals("null"))
			weightage += 1;

		// Rule 10
		SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		Calendar c = Calendar.getInstance();
		c.setTime(formatter.parse(record.get(2)));
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		if (dayOfWeek == 1 || dayOfWeek == 7)
			weightage += 3;

		// Rule 11
		int docCharge = Integer.parseInt(record.get(12));
		int totalBill = Integer.parseInt(record.get(23));
		int percentage = (docCharge * 100) / totalBill;
		if (percentage >= 50) {
			weightage += 3;
		}

		// Rule 13
		if (record.get(26).equals("ICD-10")) {
			weightage = weightage + 1;
		}

		// Rule 14
		if (record.get(27).equals("Dental Claims")) {
			weightage = weightage + 1;
		}

		// Rule 15
		if (record.get(28).equals("Opthamology")) {
			weightage = weightage + 1;
		}

		// Rule 17
		if ((record.get(12) == "0") || (record.get(13) == "0") || (record.get(14) == "0") || (record.get(15) == "0")
				|| (record.get(16) == "0") || (record.get(20) == "0") || (record.get(22) == "0")) {
			weightage += 2;
		}

		// Rule 18
		if ((record.get(27).equals("Infectious Origin")) && (Integer.parseInt(record.get(23)) > 500000)) {
			weightage += 4;
		}

		// Rule 19
		if (record.get(26) == "null" || record.get(27) == "null" || record.get(28) == "null") {
			weightage = weightage + 1;
		}

		// Rule 20
		if (record.get(32) == "null" && record.get(33) == "null" && record.get(34) == "null") {
			weightage = weightage + 1;
		}

		// Rule 21
		long end = formatter.parse(record.get(2)).getTime();
		// long start = formatter.parse(record.get(5)).getTime();
		// int a = (int) TimeUnit.MILLISECONDS.toDays(Math.abs(end - start));
		// if (a == 0)
		// weightage += 5;

		c.setTime(formatter.parse(record.get(2)));
		c.add(Calendar.DATE, 1);
		if (formatter.parse(record.get(5)) == c.getTime())
			weightage += 5;

		// Rule 22
		long start1 = formatter.parse(record.get(3)).getTime();
		int b = (int) TimeUnit.MILLISECONDS.toDays(Math.abs(end - start1));
		if (b > 2)
			weightage += 5;

		// Rule 23
		c.setTime(formatter.parse(record.get(8)));
		c.add(Calendar.DATE, 31);
		if (formatter.parse(record.get(2)).before(c.getTime()))
			weightage += 5;

		return weightage;
	}

	String host = null;
	int port = -1;

	public GenerateInsuranceData(String host_, int port_) {
		super(StorageLevel.MEMORY_AND_DISK_2());
		host = host_;
		port = port_;
	}

	public void onStart() {
		// Start the thread that receives data over a connection
		new Thread() {
			@Override
			public void run() {
				try {
					receive();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
	}

	public void onStop() {
		// There is nothing much to do as the thread calling receive()
		// is designed to stop by itself isStopped() returns false
	}

	/**
	 * Create a socket connection and receive data until receiver is stopped
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private void receive() throws IOException, ClassNotFoundException {

		ServerSocket server = null;
		Socket socket = null;
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		try {
			server = new ServerSocket(port);

			while (true) {
				socket = server.accept();
				ois = new ObjectInputStream(socket.getInputStream());
				String message = (String) ois.readObject();
				oos = new ObjectOutputStream(socket.getOutputStream());
				oos.writeObject(message);
				store(message);
			}
		} finally {
			ois.close();
			oos.close();
			socket.close();
			server.close();
		}
	}
}