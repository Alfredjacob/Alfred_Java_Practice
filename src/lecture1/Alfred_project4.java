package lecture1;

import java.util.Scanner;


public class Alfred_project4 {

	private static int i;

	public static void main(String[] args) {
		
		int n, total = 0,percentage;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Subjects");
		
		n = sc.nextInt();
		
		int marks[] = new int[n];
		
		System.out.println("Enter Marks Out of 500");
		
		for (int i = 0; i<n; i++);
		{
			marks [i] = sc.nextInt();
			total = total + marks[i];
		}
		percentage = total/n;
		System.out.println("sum:"+ total);
		System.out.println("percentage:"+percentage);
			
		}
		
	}

