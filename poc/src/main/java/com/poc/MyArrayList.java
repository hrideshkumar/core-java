package com.poc;



public class MyArrayList {
	private int capacity = 2;
	private Object[] array;
	
	public MyArrayList(){
		array = new Object[capacity];
	}
	
	public boolean add(Object var){
		
		if(this.size() >= array.length){
			growArray();
			array[size()] = var;
		}else{
			array[this.size()] = var;
		}
		return false;
		
	}
	private void growArray(){
		Object[] temp = new Object[capacity];
		temp = array;
		capacity = array.length*2;
		array = new Object[capacity];
		for (int i = 0; i < temp.length; i++) {
			array[i] = temp[i];
		}
		
	}
	public int size(){
		int count = 0;
		for (Object object : array) {
			if(object != null){
				count++;
			}
		}
		return count;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Object object : array) {
			if(object != null){
				sb.append(object.toString()+ " ");
			}
		}
		return sb.toString();
	}
	
	

}
