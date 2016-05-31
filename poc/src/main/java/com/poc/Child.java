package com.poc;

public class Child extends Parent{

	Common common;
	
	public Child(){
		
	}
	public void setB(){
		System.out.println("Child - setB()");
		common = new Common();
		
		try {
			common.setList("child");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
