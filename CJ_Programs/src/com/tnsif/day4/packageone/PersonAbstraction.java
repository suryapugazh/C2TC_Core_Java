package com.tnsif.day4.packageone;

public class PersonAbstraction {
	
	// Data Abstraction
	private String personName;
	private int personAge;
	private String personCity;
	
	// Getters and Setters
	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonCity() {
		return personCity;
	}

	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}

	// Default Constructor
	public PersonAbstraction() {
		System.out.println("Default Constructor");
	}
	
	// Parameterized Constructor
	public PersonAbstraction(String personName, int personAge, String personCity) {
		System.out.println("Parameterized Constructor");
		this.personName = personName;
		this.personAge = personAge;
		this.personCity = personCity;
	}

	@Override
	public String toString() {
		return "PersonAbstraction [personName=" + personName + ", personAge=" + personAge + ", personCity=" + personCity
				+ "]";
	}
	
}
