package Day1;

public class TypeCasting {

	public static void main(String[] args) {
		// Widening | Implicit TC
		
		byte bite = 10; 
		int ynt = bite;
		System.out.println(ynt);
		
		float flot = 22.14f;
		double dabul = flot;
		System.out.println(dabul);
		
		char car = 'A';
		int yntiger = car;
		System.out.println(yntiger);
		
		char var1 = '\u00A7';
		int intyger = var1;
		System.out.println(intyger);
		
		// Narrowing | Explicit TC

		double flot1 = 10.52f;	
		long lang = (long) flot1;
		System.out.println(lang);

		long lang1 = 923372036854775806l;
		int inty = (int) lang1;
		System.out.println(inty);

		float flot2 = 34.56f;
		int intyg = (int) flot2;
		System.out.println(intyg);

		byte bite1 = 90;
		char car1 = (char) bite1;
		System.out.println(car1);
	}
}

