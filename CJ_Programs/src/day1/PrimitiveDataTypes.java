package day1;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		
		byte byteMax = 127;
		byte byteMin = -128;
		
		System.out.println("Minimum range of bytes is " +
				byteMin+"\nMaximum range of bytes is "+byteMax);
		
		short shortMax = 32767;
		short shortMin = -32768;
		System.out.println("\nMinimum short range of bytes is " +
				shortMin+"\nMaximum short range of bytes is "+shortMax);
		
		int maxInt = 2147483647;
		int minInt = -2147483648;
		System.out.println("\nMinimum int range of bytes is " +
				minInt+"\nMaximum int range of bytes is "+maxInt);
		
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		
		System.out.println("\nMinimum long range of bytes is" +
				minLong+"\nMaximum long range of bytes is "+maxLong);
		
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("\n Value of float is "+f+" \n Value of Double is "+d);
		
		boolean flag=false;
		System.out.println("\n Value of Boolean is: "+flag);
	}
}