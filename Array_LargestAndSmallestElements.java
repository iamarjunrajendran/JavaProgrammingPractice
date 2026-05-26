package ArrayProblems;

import java.util.Scanner;

public class Array_FindLowestAndLargest {

	public static void main(String[] args) {
		
		int source[] = new int[5];
		
		Scanner sc = new Scanner (System.in);
		
		for(int i=0;i<5;i++)
		{
			source[i]= sc.nextInt();
			
		}
		int min=source[0];
		int max=source[0];
		
		
		for(int i=0;i<5;i++)
		{
			
			
			if(source[i]<min) 
			{
				min=source[i];
			}
			if(source[i]>max) 
			{
				max=source[i];
			}
			
		}
		
		System.out.println("Minimum: "+min+" Maximum: "+ max);
		sc.close();
	}

}
