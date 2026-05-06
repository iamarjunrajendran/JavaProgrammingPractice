package StringProblems;

import java.util.Scanner;

public class package StringProblems;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		System.out.println("Enter the text");
		Scanner input = new Scanner(System.in);
		String s =  input.nextLine();
		//to reverse as it is
		/*StringBuilder rev = new StringBuilder(s).reverse();
		System.out.println(rev);
		
		to reverse as a sentence and reversing the word*/
		
		String[] split= s.split(" ");
	    
		
		StringBuilder newWord = new StringBuilder();
		
		for(int i = split.length-1;i>=0;i--)
		{
			newWord.append(split[i]).append(" ");		}
		
		System.out.println(newWord);
		
	}

}
 {

	public static void main(String[] args) {
		
		System.out.println("Enter the text");
		Scanner input = new Scanner(System.in);
		String s =  input.nextLine();
		//to reverse as it is
		/*StringBuilder rev = new StringBuilder(s).reverse();
		System.out.println(rev);
		
		to reverse as a sentence and reversing the word*/
		
		String[] split= s.split(" ");
	    
		
		StringBuilder newWord = new StringBuilder();
		
		for(int i = split.length-1;i>=0;i--)
		{
			newWord.append(split[i]).append(" ");		}
		
		System.out.println(newWord);
		
	}

}
