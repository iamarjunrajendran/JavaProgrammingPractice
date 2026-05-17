package StringProblems;

import java.util.HashSet;
import java.util.Scanner;

public class FirstRepeatingCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the sentence:");
		String sentence = sc.nextLine().toLowerCase().trim();
		
		HashSet<Character> h = new HashSet<Character>();
		boolean frequency=false;
		for(int i=0;i<sentence.length();i++)
		{
		   char c = sentence.charAt(i);
		   
		   if(h.contains(c))
		   {
			   System.out.println(c + " is the first repeating character");
			   frequency=true;
			   break;
		   }
		   
		   else 
		   {
			   h.add(c);
			   
		   }
		}
		
		if(frequency==false)
		{
			System.out.println("There is no first repeating character found");
		}
		
		
		

	}

}
