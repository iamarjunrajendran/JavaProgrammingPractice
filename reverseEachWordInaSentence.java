package StringProblems;

import java.util.Scanner;

public class reverseWordsinSentence {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Sentence:");
		
		String[] input = sc.nextLine().split(" ");
		System.out.println("Length:"+ input.length);
		
		//String test = "Testing is scary";
		
		
		for(int i=0; i<input.length;i++)
		{
			String place = input[i];
			for(int j=place.length()-1;j>=0;j--)
			{
				System.out.print(place.charAt(j));
			}
			
			if(i!=input.length-1)
			{
			System.out.print(" ");
			}

		}
		
		
		
		
		
		

	}

}
