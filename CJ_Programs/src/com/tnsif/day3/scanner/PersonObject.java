package com.tnsif.day3.scanner;

import java.util.Scanner;

public class PersonObject {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("Enter person name: ");
		name = sc.next();
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		System.out.println("Enter gender: ");
		String gender = sc.next();
		System.out.println("Enter taxable income: ");
		int income = sc.nextInt();
		
		PersonAbstraction person = new PersonAbstraction();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		System.out.println(person);
		
		TaxCalculation cal = new TaxCalculation();
		cal.calculateTax(person);
		System.out.println("Tax Calculation:  ");
		System.out.println(person);

		sc.close();
	}

}
