package com.tnsif.day8.interfaces.functional;

public class FunctionalInterfaces {

	public static void main(String[] args) {
		
		GreetClass g = new GreetClass();
		System.out.println(g.greet());

		//	Functional Interface with Lambda Expression
		GreetInterface g1 = () -> {
			return "Good Afternoon";
		};

		System.out.println(g1.greet());

	}
}
