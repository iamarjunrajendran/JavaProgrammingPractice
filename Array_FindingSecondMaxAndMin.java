package Array_Problems;

import java.util.Scanner;

public class Array_SecondLargestAndSmallestvalue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] test = new int[5];
		
		
		System.out.println("Provide the values: ");
		
		for(int i =0; i<=test.length-1; i++)
		{
			test[i] = sc.nextInt();
		}

		int max = test[0];
		int min = test[0];
		int secondMax = Integer.MIN_VALUE;
		int secondMin = Integer.MAX_VALUE;
		for(int j =0; j<=test.length-1; j++)
		{
			if(test[j]>max)
			{
				secondMax=max;
				max=test[j];
			}
			else if((test[j]>secondMax)&&(test[j]!=max))
			{
				secondMax=test[j];
			}
			
			if(test[j]<min)
			{
				secondMin=min;
				min=test[j];
			}
			else if((test[j]<secondMin) && (test[j]!=min))
			{
				        secondMin= test[j];
			}
		}
		
		System.out.println("Min Value: "+ min +" Max Value: "+ max + " SecondMax: "+ secondMax + " Second Min: "+ secondMin);
		

	}

}
