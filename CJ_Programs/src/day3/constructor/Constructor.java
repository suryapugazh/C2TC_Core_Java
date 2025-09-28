package day3.constructor;

import java.util.Scanner;

public class Constructor {
public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	String name, city;
	int id;
	System.out.print("Enter Customer Id : ");
	id=sc.nextInt();
	
	sc.nextLine();
	System.out.print("Enter Customer Name : ");
	name=sc.nextLine();
	
	System.out.print("Enter Customer City : ");
	city=sc.nextLine();

	
	System.out.println(" ");
	
	// Default Constructor
	Customer c1 = new Customer();
	c1.setCustomerName(name);
	c1.setCustomerId(id);
	c1.setCustomerCity(city);
	System.out.println(c1);
	
	System.out.print("Enter Customer Id : ");
	id=sc.nextInt();
	
	sc.nextLine();
	System.out.print("Enter Customer Name : ");
	name=sc.nextLine();
	
	System.out.print("Enter Customer City : ");
	city=sc.nextLine();
	
	// Parameterized Constructor
	Customer c2=new Customer(name, id, city);
	System.out.println(c2);
	
	sc.close();
	

}
}
