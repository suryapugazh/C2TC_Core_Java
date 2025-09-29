package com.tnsif.day4.packagetwo;

import com.tnsif.day4.packageone.Base;

public class Executor {
	public static void main(String[] args) {
		
		// Accessing Different Class
		Base b1 = new Base();

		b1.methodPublic();
		b1.varPublic = 41;
		b1.methodPublic();
	}
}
