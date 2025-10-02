package com.tnsif.day6.finale;

final class FinalClasss {
	
	void show() {
		System.out.println("Final class cannot be inherited");
	}
}

// We Can't inherit a class defined with 'final' keyword
// class FinalChildClass extends FinalClass {}

public class FinalClass {
	public static void main(String[] args) {
		FinalClasss f1 = new FinalClasss();
		f1.show();
	}
}