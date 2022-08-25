package lecture1;

import java.util.Scanner;

class Subject {
	float max = 100;
	float obtd;
}
public class Alfred_project5 {

	public static void main(String[] args) {

		Scanner scn = new Scanner (System.in);
		System.out.println("ak");
		
		Subject s1 = new Subject();
		System.out.println("enter maths marks");
		s1.obtd = scn.nextInt();
		
		Subject s2 = new Subject ();
		System.out.println("enter science marks");
		s2.obtd = scn.nextInt();
		
		Subject s3 = new Subject ();
		System.out.println("enter english marks");
		s3.obtd = scn.nextInt();
		
		Subject s4 = new Subject ();
		System.out.println("enter histroy marks");
		s4.obtd = scn.nextInt();
		
		Subject s5 = new Subject ();
		System.out.println("enter geography");
		s5.obtd = scn.nextInt();
		
		Subject s6 = new Subject ();
		System.out.println("eneter marathi marks");
		s6.obtd = scn.nextInt();
		
		Subject s7 = new Subject ();
		System.out.println("eneter hindi marks");
		s7.obtd =scn.nextInt();
		
		float total = (s1.obtd)+(s2.obtd)+(s3.obtd)+(s4.obtd)+(s5.obtd)+(s6.obtd)+(s7.obtd);
		
		float per = (total*100/700);
		
		System.out.println("Percentage obtained:"+per);
		}

}
