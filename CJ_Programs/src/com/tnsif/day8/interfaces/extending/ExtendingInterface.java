package com.tnsif.day8.interfaces.extending;

public class ExtendingInterface implements ChildInterface {
	
	// Override ChildInterface method
	public void print() {
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
}

