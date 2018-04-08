package com.mkyong;

import java.util.*;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class WelcomeController {
	
	@Autowired
	private DataProcessor dataProcessor;
	
	// inject via application.properties
	@Value("${welcome.message:test}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}
	
	@RequestMapping("/search/api/getResult")
	@ResponseBody
	public String getSearchResult(){
		//dataProcessor.process();
		return "Hello";
	}
	
	@RequestMapping("/search/api/bubble")
	public String getBubble(){
		return "bubble2";
	}
	
	@RequestMapping("/search/api/scatter")
	public String getScatter(){
		return "scatter";
	}
	
	@RequestMapping("/search/api/bubble/data")
	@ResponseBody
	public List<String> getBubbleDetails(){
		Map<String,BubbleDetail> details = dataProcessor.processBubble();
		List<String> result = new ArrayList<>();
		//String header = "Location Pin,Total Claim,Genuine Claim,Fraud Claim";
		//result.add(header);
		for(String  key :  details.keySet()){
			String pin = key;
			BubbleDetail data = details.get(key);
			int fraud = data.getFraud();
			int genuine = data.getGenuine();
			int total = fraud + genuine;
			String str = key+","+total+","+genuine+","+fraud;
			result.add(str);
		}
		return result;
	}

}