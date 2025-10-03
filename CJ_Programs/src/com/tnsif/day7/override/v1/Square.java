package com.tnsif.day7.override.v1;

public class Square extends Shape {
	
	private double side;
	public Square(double side) {
		this.side = side;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a square with side " + side);
	}

	@Override
	public void erase() {
		System.out.println("Erasing a square with side " + side);
	}
}
