package String_Problems;

import java.util.HashSet;
import java.util.Scanner;

public class removeDuplicateCharacters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence");
		String sentence = sc.nextLine();
		
		StringBuilder input = new StringBuilder();
		
		HashSet<Character> hs = new HashSet<Character>();
		
		for(int i =0; i<sentence.length(); i++)
		{
			char c = sentence.charAt(i);
			
			if(hs.add(c))
			{
				input.append(c);
			}
		}
		
		System.out.println(input);

	}

}
