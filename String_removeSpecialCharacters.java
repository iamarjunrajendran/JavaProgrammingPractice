package String_Problems;

import java.util.Scanner;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the text: ");
		String s=sc.nextLine();
		StringBuilder sb = new StringBuilder();
		for(int i =0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if((c>='a'&& c<='z')||(c>='A'&& c<='Z')||(c>='0'&& c<='9')||c == ' ')
			{
				sb=sb.append(c);
			}
			
		}
		
		System.out.println("Filtered outcome:"+sb );

	

	
	// using the ReplaceAll method
	
	
	
	s=s.replaceAll("[^a-zA-Z0-9 ]", "");
	System.out.println("Using the replace all method: "+s);
	
	
	}
	
}
