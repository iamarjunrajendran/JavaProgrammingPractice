package StringProblems;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the text: ");
		
        String sentence= sc.nextLine().toLowerCase();
        
        HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        
        for(int i=0;i<sentence.length();i++)
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
        
       /* for(Object c: h.keySet())
        {
        	System.out.println(c+""+h.get(c));
        	
        }*/
        
       boolean frequency = false;
        
       for(int i=0;i<sentence.length();i++)
        {
        	char a = sentence.charAt(i);
        	
        	if(h.get(a)==1)
        	{
        		
        		System.out.println(a +" is the first non-repeated character");
        		frequency=true;
        		break;
        		
        	}
        	
        	
        }
        
       if(frequency==false) {
   		System.out.println("There's no non repeated character");
   	}
        
		

	}

}
