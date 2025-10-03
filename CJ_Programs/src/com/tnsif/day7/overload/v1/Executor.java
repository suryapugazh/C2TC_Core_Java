package com.tnsif.day7.overload.v1;

public class Executor {

	public static void main(String[] args) {

		System.out.println("Is 252 Palindrome? " + Operations.isPalindrome(252));
		System.out.println("Is 159 Palindrome? " + Operations.isPalindrome(159));
		
		System.out.println("Is DSA Palindrome? " + Operations.isPalindrome("DSA"));
		System.out.println("Is MADAM Palindrome? " + Operations.isPalindrome("MADAM"));

	}

}
