package StringProblems;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String actual= input.nextLine();
		
		//Using CharArray
		String rev= "";
		String rev2="";
		
		char[] conv = actual.toCharArray();
		
        for(int i=conv.length-1; i>=0 ;i--)
        {
        	rev=rev+conv[i];
        }
        
		System.out.println(rev);
        
		if(rev.equals(actual))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		//Using Char at simple way
		
		for(int j=actual.length()-1; j>=0; j--)
		{
			rev2=rev2+actual.charAt(j);
		}
		if(rev2.equals(actual))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		//using String builder - efficient way
		
		String s = new StringBuilder(actual).reverse().toString();
		
		if(s.equals(actual))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		
		

	}

}
