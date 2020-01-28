package extra;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


public class StringMethods2 {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it with
		//    random upper and lower case characters.
 String Boo="Nioh is pretty hard when you play the first it trust me i know i've been there";
		// 2. Print your String to the console in upper case.
		System.out.println(Boo.charAt(0));
		// 3. Print your String to the console in lower case.
System.out.println(Boo.charAt(1));
		// 4. Print the first 3 char's of your String
		//    HINT: .substring(start,end)
		Boo.substring(0,59);
	
		// 5. Print a single char somewhere in the middle of your String
		//    REMINDER: char's in string start at index 0
		System.out.println(Boo.charAt(2));
		// 6. BONUS -- print the LAST 3 char's of your string using
		//        .length() to determine WHERE the last 3 char's are located.
		System.out.println(Boo.charAt(Boo.length()-3));
		System.out.println(Boo.charAt(Boo.length()-2));
		System.out.println(Boo.charAt(Boo.length()-1
));
	}
}
