package lecture1;

public class String_Operations {
 
	public static void main(String[] args) { 
		//String Menthods
		
		String Name = "ALFRRRED";
		String name = "alfred robert jacob";
		System.out.println(Name);
		
		// 1) Name.length
		int value = Name.length();
		System.out.println(value);
		
		// 2) toLowerCase
	 	
	   String stringl = Name.toLowerCase();
	   System.out.println(stringl);
	   
	   //3) toUpperCase
	   
	   String stringm =name.toUpperCase();
	   System.out.println(stringm);
		
	   //4) Trim
	 String Name1 = "ALFRED ROBERT JACOB";
	   System.out.println(Name1.trim());            
	   
	   //5) Substring
	   System.out.println(Name1.substring(4));
	   System.out.println(Name1.substring(1,4));          
	   
	   //6) Name.Replace
	   
	   System.out.println(Name.replace('A','K'));
	   System.out.println(Name.replace("ALF","alfred"));
	   
	   //7) StartWith
	   System.out.println(Name.startsWith("APF"));
	   
	   //8) Endwith
	   System.out.println(Name.endsWith("RED"));
	   
	   //9) CharAt
	   
	  System.out.println(Name.charAt(3));
	   
	  //10) Indexof
	  
	  System.out.println(Name.indexOf(5));
	  
	  //11) Split
	  
	  
	  //12) Equals
	  
	  String Surname = "JAcob";
	  
	  System.out.println(Name.equals("jacob"));
	  System.out.println(Name.equalsIgnoreCase("jacob"));
	   

	}

}
