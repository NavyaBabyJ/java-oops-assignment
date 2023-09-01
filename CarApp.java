package com.nissan.app;

import com.nissan.model.Car;
import com.nissan.model.Vehicle;

public class CarApp {

	public static void main(String[] args) {
		Car a=new Car("Nissan","black");
		a.brandname();
		a.color();
		
		Vehicle b=new Vehicle("Nissan");
		b.brandname();
	}

}
