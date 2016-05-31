package com.poc;

import java.io.Serializable;

public class Singletone implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private static Singletone instance = new Singletone();
	
	private Singletone(){
		System.out.println("constructor called.");
		
	}
	public static Singletone getInstance(){
		
		return instance;
	}

	public Object clone()throws CloneNotSupportedException{  
		return instance;  
		}
	
	
}
