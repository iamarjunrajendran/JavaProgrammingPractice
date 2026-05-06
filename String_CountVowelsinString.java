package StringProblems;

import java.util.Scanner;

public class CountVowelsinString {

	public static void main(String[] args) {
		
		System.out.println("Enter the text");
		Scanner input = new Scanner(System.in);
		String s =  input.nextLine();
	    s=	s.toLowerCase();
		char[] sentence = s.toCharArray();
		int count=0;
		
		//System.out.println(sentence);
		
		//a,e,i,o,u
		
		for(char c : sentence)
		{
			if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u')
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		//Optimized approach for interview
		int count1=0;
		String vowels = "aeiou";
  for (char c : sentence) {
    if (vowels.indexOf(c) != -1) {
        count1++;
    }
}
System.out.println(count1);

	}

}
