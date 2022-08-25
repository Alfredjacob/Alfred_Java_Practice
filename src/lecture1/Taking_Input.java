package lecture1;

import java.util.Scanner;


public class Taking_Input {

	public static void main(String[] args) {
		
		System.out.println("Taking input from the user");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1");
		int a = sc.nextInt();
		float a1 = sc.nextFloat();
		
		System.out.println("Enter number 2");
		int b= sc.nextInt();
		float b1 = sc.nextFloat();
	
		float  sum = a+a1;
		float sum1 = b+b1;
		
		System.out.println("The sum of these program is");
		System.out.println(sum);
		System.out.println(sum1);                                      
		
	    boolean c = sc.hasNextInt();
		System.out.println(b1);
		
		String str = sc.next();
		System.out.println(str);      
		
		int z = sc.nextInt();
		float y = sc.nextFloat();
		float x = z*y;
		System.out.println(x);                        
		

	}

}
