package com.tnsif.day7.overload.v1;

public class Operations {
	
	public static boolean isPalindrome(int number)
	{
		int rev=0;
		int temp = number;
		
		while(number!=0){
			rev = rev * 10 + number % 10;
			number /= 10;
		}
		return temp == rev;
	}
	
	public static boolean isPalindrome(String str){
		String rev;
		rev = new StringBuffer(str).reverse().toString();
		return str.equals(rev);
	}
}
