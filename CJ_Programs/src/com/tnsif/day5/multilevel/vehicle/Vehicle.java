package com.tnsif.day5.multilevel.vehicle;

public class Vehicle {

	public static void main(String[] args) {
		Car c = new Car();
		c.vehicleType();
		
		Maruti m = new Maruti();
		m.vehicleType();
		m.brand();
		m.speed();
		
		MarutiEightHundred M800 = new MarutiEightHundred();
		M800.vehicleType();
		M800.brand();
		M800.speed();
		
	}

}
