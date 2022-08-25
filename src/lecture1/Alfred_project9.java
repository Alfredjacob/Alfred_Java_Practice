package lecture1;

import java.util.Scanner;

public class Alfred_project9 {

	public static void main(String[] args) {
		// Strings
		
     	String A = "Alfred";
     	String B = "Alfred";
     	
	 	System.out.println(A==B);  
		
		String C = new String("Alfred");
		String D = new String("Alfred");
		
		System.out.println(C==D);
		
		//different ways of print in java
		
		int a = 5;
		float b = 6.655f;
		System.out.printf("The value of a is %d and value of b is %1.2f",a,b); 
		
		Scanner sc = new Scanner (System.in);
	//	String st = sc.next();
		String st = sc.nextLine();
		System.out.println(st);
		
		
		

	}

}
