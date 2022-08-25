package lecture1;

import java.util.Scanner;

public class Alfred_Project15 {

	public static void main(String[] args) {
		//Practice set 2(Conditional & switch cases)
		
		//Question 1
int a = 10;
		if(a==11) {
			System.out.println("I am 11");
		}
		else {
			System.out.println("I am not 11");
		}	
		//Question 2
		
	/*	byte s1,s2,s3;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter marks of physics");
		

		
		s1= sc.nextByte();
		
		System.out.println("Enter marks of Mathmatics");
		
		s2=sc.nextByte();
		
		System.out.println("Enter marks of Science");

		s3=sc.nextByte();
		
		float avg = (s1+s2+s3)/3f;
		
		System.out.println("Overall percentage "+avg);
		
	//	if(avg>=40 && s1>=33 && s2>=33 && s3>=33) 
		if (avg>=40)
		{
			System.out.println("Congratulations,You have pass the exam!");
		}
		else {
			System.out.println("Sorry,you have not cleard the exam.");    
		}                                                                     */
		
		//Question 3
		
/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter your income in lakhs per annum");
		
		float tax = 0;
		float income = sc.nextFloat();
		
		if (income<=2.5) {
			tax = tax + 0;
	//System.out.println("No IT return required");
			
		}	
		else if (income>2.5f && income <=5f) {
			tax = tax + 0.05f * (income - 2.5f);
		//ystem.out.println("IT return required");
		}
		else if (income>5f && income <=10f) {
			tax = tax + 0.05f* (5f-2.5f);
			tax = tax + 0.2f * (income - 5f);
//	System.out.println("IT return required");
		}
		else if (income > 10f) {
			tax = tax + 0.05f* (5f-2.5f);
			tax = tax + 0.2f * (10f-5f);
			tax = tax + 0.3f * (income - 10f);
	//System.out.println("IT return required");
	 System.out.println("The total tax paid by the employee is: " + tax);
	 
	 

		}*/
		
		
		//Question 4
		
		Scanner sc =  new Scanner (System.in);
		int day = sc.nextInt();
		
		switch(day) {
		case 1 : System.out.println("Monday");
		case 2: System.out.println("Tuesday");
		case 3: System.out.println("wednsday");
		case 4: System.out.println("Thursday");
		case 5: System.out.println("Friday");
		case 6: System.out.println("Saturday");
		case 7: System.out.println("Sunday");
		
		}
		
		
		
	}

}





