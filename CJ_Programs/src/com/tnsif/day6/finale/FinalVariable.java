package com.tnsif.day6.finale;

public class FinalVariable {

	// final attributes must be initialized
	// final int x;

	final int x = 100;

	// Declare a static blank final attribute.
	final static int Y;

	// Declare & initialize static final attribute.
	final static int Z = 10;

	void change() {
		// x = 30; // final variables can't be reassigned
		// Y = 200; // final static variables can't be reassigned
	}

	@Override
	public String toString() {
		return "FinalVariable [x = " + x + ", Y " + Y + "]";
	}

	// Declare a static block to initialize the final static variable.
	static {
		Y = 20;
		//  Z = 100; // Once initialized can't be reassigned
		System.out.println("Value of Y: " + Y);
	}

	
}
