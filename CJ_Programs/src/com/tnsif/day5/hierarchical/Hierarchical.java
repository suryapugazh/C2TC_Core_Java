package com.tnsif.day5.hierarchical;

public class Hierarchical {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		System.out.println("_____Person Details_____");
		System.out.println(p1);

		Person p;
		p = new Person("Arun", "Dubai");
		if (p instanceof Object)
			System.out.println("Person Details " + p);
		
		p = new Employee("Arun B", "Bombay", 101, 53000, "Sales");
		if (p instanceof Employee)
		System.out.println("Employee Details " + p);

		p = new Student("B Arun", "Delhi", "FE", 88);
		if (p instanceof Student)
			System.out.println("Student Details " + p);

	}

}
