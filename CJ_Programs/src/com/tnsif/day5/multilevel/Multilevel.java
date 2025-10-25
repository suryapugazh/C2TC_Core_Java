package com.tnsif.day5.multilevel;

import java.util.Date;

public class Multilevel {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		Person p1;
		p1 = new Person("Arun", 987562426, new Date(2000, 12, 2));
		System.out.println(p1);

		p1 = new Employee("B Arun", 856425362, new Date(1995, 05, 07), "Sales", 45000);
		System.out.println(p1);

		p1 = new LevelOneEmployee("Arun B", 754869536, new Date(1988, 15, 02), "Account", 85000, 200, "Signing Authority");
		System.out.println(p1);
	}
}
