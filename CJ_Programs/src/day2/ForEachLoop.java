package day2;

public class ForEachLoop {
	public static void main(String[] args) {
		
		int arr[]= {100, 200, 500, 600, 800};	

		// Enhanced For loop
		for(int i:arr){
			System.out.println(i);	
		}
		
		char ch[]= {'a', 'b', 'c','d', 'e', 'f'};
		
		for(char c:ch){
			System.out.print(c);		
		}
		
		System.out.println(" ");
		
		String str[]= {"Java", "Full-stack", "by", "TNSIF"};
		
		for(String s:str){
			System.out.print(s+" ");		
		}
	}
}