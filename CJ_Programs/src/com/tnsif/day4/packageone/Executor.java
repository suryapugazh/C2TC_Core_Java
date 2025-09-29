package com.tnsif.day4.packageone;


public class Executor {
	public static void main(String[] args) {
		
		// Same Package
		Base b1=new Base();
		b1.methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		b1.varDefault=11;
		b1.methodDefault();
		
		
		b1.varProtected=31;
		b1.methodProtected();
		
		b1.varPublic=41;
		b1.methodPublic();
		
		// instanceof -> operator that check the created object is an instance of given class.
		System.out.println(b1 instanceof Base);
		
	}

}
