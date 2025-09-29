package com.tnsif.day2;


public class Switch {
	public static void main(String[] args) {

		char var = 'b';
		
		switch (var) {
		
		case 'a' : 
		case 'A' : 
			System.out.println(var + " is a Vowel");
			break;
			
		case 'e':
		case 'E' :
			System.out.println(var + " is a Vowel");
			break;
			
		case 'i':
		case 'I' :	
			System.out.println(var + " is a Vowel");
			break;
		case 'o':
		case 'O':
			System.out.println(var + " is a Vowel");
			break;
		case 'u':
		case 'U' :	
			System.out.println(var + " is a Vowel");
			break;
		default:
			System.out.println(var + " is not a Vowel");
			break;
		}
	}
}
