package com.tnsif.day4.packagethree;

public class PrivateConstructor {
	public static void main(String s[]) {
		
		// Can't create object with private constructor
		
		MyClass m = MyClass.getObject();
		m.setId(10);
		
		MyClass m1=MyClass.getObject();
		
		System.out.println(m);
		System.out.println(m1);
		
	}
}
