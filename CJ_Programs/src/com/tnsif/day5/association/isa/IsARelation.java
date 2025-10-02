package com.tnsif.day5.association.isa;

public class IsARelation {
	public static void main(String[] args) {

		Employee employee = new Employee("Sagar Pawar", 101, "IT");
		Manager manager = new Manager("Ankit Kale", 201, "Hr", 8);

		System.out.println(employee);
		System.out.println("------------------------");
		System.out.println(manager);
//		System.out.println(employee.getDepartment());
//		System.out.println(manager.getDepartment());
	}
}
