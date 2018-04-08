package com.mkyong;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.HashMap;

import org.springframework.stereotype.Component;

@Component
public class DataProcessor {
	
	private static final String FILE_NAME = "C:\\Users\\arya.chaudhary\\Downloads\\testData.csv";
	
	public void process(){ 
   
		BufferedReader br = null;
	    String line = "";
	    String cvsSplitBy = ",";
	
	    try {
	        br = new BufferedReader(new FileReader(FILE_NAME));
	        while ((line = br.readLine()) != null) {
	            // use comma as separator
	            String[] data = line.split(cvsSplitBy);
	            System.out.println("Country [code= " + data[0] + " , name=" + data[1] + "]");
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if (br != null) {
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
   }
	
	public Map<String,BubbleDetail> processBubble(){
		BufferedReader br = null;
	    String line = "";
	    String cvsSplitBy = ",";
	    Map<String,BubbleDetail> details = new HashMap<String,BubbleDetail>();
	    try {
	        br = new BufferedReader(new FileReader(FILE_NAME));
	        br.readLine();
	        while ((line = br.readLine()) != null) {
	            // use comma as separator
	            String[] data = line.split(cvsSplitBy);
	            //pin index = 39
	            String key = data[39];
	            int isFraud = "TRUE".equals(data[57]) ? 1: 0;
	            BubbleDetail bubble = details.get(key);
	            if(bubble != null){
	            	if("TRUE".equals(data[57])){
	            		bubble.increaseFraud();
	            	}else{
	            		bubble.increaseGenuine();
	            	}
	            }else{
	            	 bubble = new BubbleDetail();
	            	 if("TRUE".equals(data[57])){
		            		bubble.increaseFraud();
		            	}else{
		            		bubble.increaseGenuine();
		            	}
	            	details.put(key,bubble);
	            }
	            System.out.println("Country [code= " + data[0] + " , name=" + data[1] + "]");
	        }
	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    } finally {
	        if (br != null) {
	            try {
	                br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    return details;
	}
}
