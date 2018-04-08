package com.iris.insuranceFraudDetection;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;

import com.iris.Insurance.App;

public class SocketClient implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// byte[] ipAddr = new byte[] { (byte) 192, (byte) 168, 10, (byte) 174
		// };
		// byte[] ipAddr=new byte[]{(byte) 172,(byte) 16,(byte) 15,(byte) 33};
		// byte[] ipAddr = new byte[] { (byte) 192, (byte) 168, 10, (byte) 201
		// };
		byte[] ipAddr = new byte[] { (byte) 127, (byte) 0, 0, (byte) 1 };
		InetAddress host = InetAddress.getByAddress(ipAddr);

		if (args.length != 1) {
			System.out.println("Please pass the port number ...................");
			System.exit(1);
		}
		int port = Integer.parseInt(args[0]);

		Socket socket = null;
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		String contentFile = null;

		while (true) {

			// write to socket using ObjectOutputStream
			ArrayList<InsuranceData> arrnew = new ArrayList<InsuranceData>();
			arrnew = App.writeDataToSocket();

			String hostIPAddress = "";
			try {
				InetAddress localhost = InetAddress.getLocalHost();
				hostIPAddress = (localhost.getHostAddress()).trim();
				hostIPAddress = hostIPAddress.replaceAll("\\.", "\\-");
			} catch (IOException e) {
				e.printStackTrace();
			}
			// Status.updateStatus(hostIPAddress.replaceAll("\\-", "\\."),
			// "STARTED");

			for (InsuranceData insuranceData : arrnew) {
				socket = new Socket(host.getHostName(), port);
				oos = new ObjectOutputStream(socket.getOutputStream());
				App.writeFields(oos, insuranceData);
				ois = new ObjectInputStream(socket.getInputStream());
				contentFile = (String) ois.readObject();

			}
			System.out.println(contentFile);

			// Status.updateStatus(hostIPAddress.replaceAll("\\-", "\\."),
			// "COMPLETED");

			oos.close();
			ois.close();

		}
	}
}
