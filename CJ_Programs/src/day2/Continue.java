package day2;

public class Continue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++){
			// Skip -> Odd
			if (i%2 != 0)
				continue;
			// Print -> Even
			System.out.print(i + " ");
		}
	}
}
