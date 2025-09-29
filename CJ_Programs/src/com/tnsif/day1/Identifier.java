package com.tnsif.day1;

public class Identifier {

	public static void main(String[] args) {
		
		// for is a keyword not an identifier
		// int for = 10;
		// System.out.println("value of the number variable is : "+ for);
		
		// there should not be space between a variable
		//  int number s = 8;
		//  System.out.println("value of the number variable is : "+ number 2);
		 
		
		// throws error because it starts with symbol
		// float @number3 = 10.5;
		
		// valid identifiers -> can start with '$'
		int $var1 = 20; //starts with $
		System.out.println("Var1 value is : "+ $var1);
	
		// best practice - Camel Case. Others:  Pascal Case, Snake Case
		String studentName="Vignesh";
		System.out.println("Name is : "+ studentName);
		
	
	}

}