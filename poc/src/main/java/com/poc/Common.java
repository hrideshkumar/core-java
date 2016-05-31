package com.poc;

import java.util.ArrayList;
import java.util.List;

public class Common {

	public List<String> list = new ArrayList<String>();
	
	public void setList(String a) throws InterruptedException{
		System.out.println("List add - call");
		Thread.sleep(10000);
		this.list.add(a);
	}
}
