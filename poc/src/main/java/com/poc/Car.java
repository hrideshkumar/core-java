package com.poc;

public class Car {
	private String brand;
	private String doors;
	
	public Car(String brand, String doors) {
		super();
		this.brand = brand;
		this.doors = doors;
	}
	public Car() {
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	
	
}
