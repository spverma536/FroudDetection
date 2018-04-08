package com.mkyong;

public class BubbleDetail {
	private int fraud;
	private int genuine;
	public int getFraud() {
		return fraud;
	}
	public void setFraud(int fraud) {
		this.fraud = fraud;
	}
	public int getGenuine() {
		return genuine;
	}
	public void setGenuine(int genuine) {
		this.genuine = genuine;
	}
	
	public  void increaseFraud(){
		this.fraud++;
	}
	public void increaseGenuine(){
		this.genuine++;
	}
	
	
}
