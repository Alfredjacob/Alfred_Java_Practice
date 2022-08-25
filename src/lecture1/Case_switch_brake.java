package lecture1;
import java.util.Scanner;
public class Case_switch_brake {

	public static void main(String[] args) {
		//Switch Condition
		
		Scanner sc = new Scanner (System.in);
		int age;
		System.out.println("Enter your age");
		age = sc.nextInt();
		
		switch(age) {
		case 18:
			System.out.println("You can attent colleage");
			break;
		
		case 23:
			System.out.println("You can attend University");
			break;
			
		case 60:
			System.out.println("You will become senior porffessor");
			break;
			
			default:
				System.out.println("Enjoy your life!");
				
			
		}
		
		
	}

}
