package String_Problems;

import java.util.HashMap;
import java.util.Scanner;

public class characterOccurenceCount {

	public static void main(String[] args) {
		
		System.out.println("Enter the text:");
		Scanner s = new Scanner(System.in);
		String sentence = s.nextLine().toLowerCase();
		
		
		//System.out.println(sentence);
		
		// Counting the occurrence of the characters in the string
		HashMap<Character, Integer>  h = new HashMap<Character, Integer>();
		
		
		
		for(int i=0; i<=sentence.length()-1; i++)
		{
			char c = sentence.charAt(i);
			
			if(h.containsKey(c))
			{
				h.put(c, h.get(c)+1);
				
			}
			else
			{
				h.put(c, 1);
			}
		}
		
for( Object x : h.keySet())
{
	System.out.println(x+" "+h.get(x));
}

//Counting the specified character as specified

System.out.println("Enter the character to count from the string");

char a = s.next().charAt(0);

int count=0;

for(int i=0;i<sentence.length();i++)
{
	if(a==sentence.charAt(i))
	{
		count=count+1;

	}
	
}

System.out.println("Occurence of the"+a+": "+count);

		
	}

}
