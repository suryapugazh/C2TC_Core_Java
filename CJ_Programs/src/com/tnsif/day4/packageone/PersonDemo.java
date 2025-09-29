package com.tnsif.day4.packageone;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String args[]) {
		
		PersonAbstraction p1 = new PersonAbstraction();

		Scanner sc = new Scanner(System.in);
		String name, city;
		int age;
		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		// p1.personName=name ->  Private member, can't be accessible
		p1.setPersonName(name);
		p1.setPersonAge(age);
		p1.setPersonCity(city);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonCity());

		System.out.println("Enter Person details : Name, age and city");
		name = sc.nextLine();
		age = sc.nextInt();
		sc.nextLine();
		city = sc.nextLine();
		// Parameterized Constructor Call
		p1 = new PersonAbstraction(name, age, city);
		System.out.println("Person Details Name : " + p1.getPersonName() + "\tAge : " + p1.getPersonAge() + "\tCity : "
				+ p1.getPersonCity());
		sc.close();

		// Automatically call by toString() method to represent an object as String
		System.out.println(p1);
	}
}
