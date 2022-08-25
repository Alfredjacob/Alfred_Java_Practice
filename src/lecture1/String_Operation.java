package lecture1;

public class String_Operation {

	public static void main(String[] args) {
		//Practice set 
		//Question 1
		
		String name = "AlfRed RobErt JacOB";
		name = name.toLowerCase();
		System.out.println(name);
		
		name = name.toUpperCase();
		System.out.println(name);
		
		//Questions
		
		String text = "I am Alfred Jacob             basically from Nanded";
		text = text.replace("   ","_");
		System.out.println(text);
		text = text.replace("basically from","born and brought in");
		System.out.println(text);
		
		//question 3
		
		String letter = "Dear <|name|>,Thanks alot!";
		letter = letter.replace("<|name|>", "Alfred");
		System.out.println(letter);
		
		//Question 4
		String myString = "This alfred   jacob  from nanded   and im an   enginner";
		
//		myString = myString.indexOf(("   "));
		
		System.out.println(myString.indexOf("  "));
		
		  String myLetter = "Dear Jacob,\n\tThis Java Course is Nice.\nThanks!";
	      System.out.println(myLetter);
		
	}

}
