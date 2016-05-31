package com.poc;

import java.util.ArrayList;

public class App {

	public static void main(String[] args){
		/*SerializeAndDeserialize seri = new SerializeAndDeserialize();
		Singletone s1 = Singletone.getInstance();
		Singletone s2 = null;
		Singletone s3 = null;
		Singletone s4 = null;
		try {
			s2 = (Singletone) s1.clone();
			seri.writeobj(s2);
			//s2.setA(10);
			s3 = seri.readobj();
			//s4 = (Singletone) Class.forName("com.poc.Singletone").newInstance();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("s1 as new "+s1);
		System.out.println("s2 as clone "+s2);
		System.out.println("s3 as seri by s2 "+ s3);
		System.out.println("s4 as Class.forName "+ s4);*/
	ArrayList<String> arr = new ArrayList<String>(10);
	arr.add(null);
	arr.add(null);
	
	for (String string : arr) {
		System.out.println(string);
	}
	}
}
