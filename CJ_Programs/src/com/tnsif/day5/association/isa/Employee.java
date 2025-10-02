package com.tnsif.day5.association.isa;

public class Employee {
	private String name;
	private int employeeId;
	private String department;

	public Employee() {
		super(); // calls Object class
	}
	
	public Employee(String name, int employeeId, String department) {
		this.name = name;
		this.employeeId = employeeId;
		this.department = department;

	}

	// Getters and Setters Methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [Name=" + name + ", EmployeeId=" + employeeId + ", Department=" + department + "]";
	}

}
