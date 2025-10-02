package com.tnsif.day5.association.isa;

//Sub-class inheriting from Employee
public class Manager extends Employee {
	private int teamSize;

	public Manager() {
		super(); // calls Employee Class's Default Constructor. Is-A relationship

	}

	public Manager(String name, int employeeId, String department, int teamSize) {
		super(name, employeeId, department); // Is-A relationship
		this.teamSize = teamSize;
	}

	// Getters and Setters Methods
	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
		return "Manager [TeamSize=" + teamSize + ", Name=" + getName() + ", EmployeeId=" + getEmployeeId() + ", Department=" + getDepartment() + "]";
	}

}