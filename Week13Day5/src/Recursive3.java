
//a static recursive function that determines 
//whether or not a string of characters is a 
//palindrome by returning a boolean value, where
//a reference to a String object is provided as the parameter.
 import java.util.Scanner;
 public class Recursive3 {	
	 
	 
	 public static boolean isPal(String s)
	                   {
	 if(s.length() == 0 || s.length() == 1)
	                           return true; 
	                       if(s.charAt(0) == s.charAt(s.length()-1))
	 return isPal(s.substring(1, s.length()-1));
	 return false;
	                   }

	                   public static void main(String[]args)
	                   {
	 Scanner scanner = new Scanner(System.in);
	                       System.out.println("Enter the String for check:");
	                       String string = scanner.nextLine();
	   if(isPal(string))
	                           System.out.println(string + " is a palindrome");
	                       else
	                           System.out.println(string + " is not a palindrome");
	                   }
	               }
