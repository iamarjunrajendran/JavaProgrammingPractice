package ArrayProblems;

import java.util.Scanner;

public class Finding_missingNumber {

	public static void main(String[] args) {
		
		int[] test = new int[5];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Provide the values: ");
		
		
		for(int i=0;i<=test.length-1;i++)
		{
			test[i]= sc.nextInt();
		}
		
		int n = test.length+1;
		
		int expectedSum = (n*(n+1))/2;
		
		int actualSum=0;
		
		for(int i=0; i<=test.length-1;i++)
		{
			actualSum=actualSum+test[i];
		}
		
		int missing = expectedSum - actualSum;
		
		System.out.println("Missing Element: "+ missing);
		
		

	}

}
