package com.tnsif.day7.override.covari;

public class CovariantOverridingImp {
	public static void main(String arg[]) throws CloneNotSupportedException{
			
		Student student1 = new Student(1, "MBA", "Arun");
		student1.printData();

		Student student2 = (Student) student1.clone();
		student2.printData();
	}
}