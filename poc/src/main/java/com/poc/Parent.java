package com.poc;

public class Parent {
	
	Common common;
	
	public Parent(){}

	 void reCheck(Parent pr){
			System.out.println(this == pr);

		}
	

	public void setA() {
		System.out.println("Parant - setA()");
		common = new Common();
		
		try {
			common.setList("Parant");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
