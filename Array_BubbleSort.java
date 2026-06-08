package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class Array_BubbleSort {

	public static void main(String[] args) {
		
		
		
		int[] a = new int[5];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		
		bubbleSort(a);
		
		for(int x: a)
		{
			System.out.println(x);
		}
		
		
		System.out.println("Second inbuilt approach");

		int[] arr = {2,15,1,2,4};
		
		Arrays.sort(arr);
		
		for(int x: arr)
		{
			System.out.println(x);
		}
		
		
	}

	public static int[] bubbleSort(int[] array)
	{
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		
		
		
		return array;
		
	}
	
}
