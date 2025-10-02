package com.tnsif.day5.hierarchical;

public class Student extends Person{
	
	private String classs;
	private float per;
	
	public Student() {
		System.out.println("Student class default constructor");
		classs="FY";
		per=83;
	}
	
	public Student(String clas, float per) {
		this.classs = clas;
		this.per = per;
	}
	
	public String getClas() {
		return classs;
	}
	
	public void setClas(String classs) {
		this.classs = classs;
	}
	
	public float getPer() {
		return per;
	}
	
	public void setPer(float per) {
		this.per = per;
	}
	
	public Student(String name, String city,String classs, float per ){
		
		 // private members can't inherited into child class
		 // only inherit using -> super.name=name; super.city=city;
		 // or passing, attributes to parent class using -> super(arg1, arg2);
		
		super(name,city);
		this.classs = classs;
		this.per = per;
	}
	
	@Override
	public String toString() {
		return "Student [class=" + classs + ", per=" + per + ", name=" + getName() + ", city=" + getCity() + "]";
	}
	
	
}
