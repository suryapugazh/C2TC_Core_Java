package com.tnsif.day8.abstraction;

public abstract class Shape {
     protected float area;
     
     //	Abstract method 
	 abstract void calArea();
	 
	 //	Concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }
}
	 