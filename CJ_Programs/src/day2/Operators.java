package day2;

public class Operators {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		System.out.println("Before: " + a + " " + b);

		++a;
		int c = ++a + b + a--;
		System.out.println("C, After: " + c);

		int d = c++ + a + b--;
		System.out.println("D, After: " + d);

		System.out.println("A, B, C and D: " + a + " " + b + " " + c + " " + d);
				
		  int x = (c == 45) ? 1 : 0;	
		  System.out.println(x);
	}
}