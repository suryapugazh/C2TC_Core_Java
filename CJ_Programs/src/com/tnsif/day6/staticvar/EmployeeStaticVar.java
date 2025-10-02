package com.tnsif.day6.staticvar;

public class EmployeeStaticVar {

	public static void main(String[] args) {
		
		// Create the first object of the class and pass the two arguments with type
		System.out.println(Employee.companyName);
		Employee e = new Employee("Arun", 321);
		System.out.println(e);
		
		e = new Employee("Balaji", 147);
		System.out.println(e);
	}
}