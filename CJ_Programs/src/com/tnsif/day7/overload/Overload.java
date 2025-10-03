package com.tnsif.day7.overload;

public class Overload {

	public static void main(String[] args) {

		System.out.println("_____Constructor Overload_____");
		
		Point p = new Point();
		System.out.println(p);

		Point p1 = new Point(14.5f);
		System.out.println(p1);

		Point p2 = new Point(12.5f, 20.50f);
		System.out.println(p2);

		System.out.println("_____Method Overload_____");
		System.out.println("Addition of two integers : " + MethodOverload.addition(10, 20));
		System.out.println("Addition of two floating numbers: " + MethodOverload.addition(10.0f, 20.f));
		System.out.println("Addition of one integer and one float: " + MethodOverload.addition(10, 20.0f));
		System.out.println("Addition of one float and one integer: " + MethodOverload.addition(10.0f, 20));
		System.out.println("Addition of two Strings: " + MethodOverload.addition("Hello ", "World"));
	}
}