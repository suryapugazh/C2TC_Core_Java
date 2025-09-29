package com.tnsif.day4.packagethree;

public class MyClass {
	
	// Data Abstraction
	private static MyClass obj = new MyClass();
	private int id;
	
	// Getters and Setters
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	// Default Constructor
	private MyClass() {
		System.out.println("MyClass object created");		
	}
	
	// Factory Method
	
	public static MyClass getObject()
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
}
