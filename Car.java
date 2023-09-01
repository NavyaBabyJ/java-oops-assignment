package com.nissan.model;

public class Car extends Vehicle{

	public String color;

	public Car(String brandName, String color) {
		super(brandName);
		this.color = color;
	}

	public void color() {
		System.out.println("Color: "+this.color);
	}
	
}
