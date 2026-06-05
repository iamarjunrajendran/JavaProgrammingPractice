package Array_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Array_ArrayEquality {

	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array1 = new int[5];
		int[] array2 = new int[5];
		boolean compare = true;
		System.out.println("Enter elements for the Array 1: ");
		
		for(int i=0;i<array1.length;i++)
		{
			array1[i]=sc.nextInt();
			
		}
		
System.out.println("Enter elements for the Array 2: ");
		


		for(int i=0;i<array2.length;i++)
		{
			array2[i]=sc.nextInt();
			
		}
		
		

	
		
		if(ArrayEquals(array1,array2)==true)
		{
			System.out.println("Arrays are equal");
		}
		else 
		{
			System.out.println("Arrays are not equal");
		}

		sc.close();
		
		//Using the Arrays-Inbuilt method
		
	if	(Arrays.equals(array1, array2)==true)
	{
		System.out.println("Using inbuilt Array method: Arrays are equal");
	}
	else 
	{
		System.out.println("Using inbuilt Array method: Arrays are not equal");
	}
		

	}

	//Method
	public static boolean ArrayEquals(int[]a, int[]b)
	
	{
		boolean compare = true;
		
		if(a.length == b.length) 
		{
			
			
			for(int i=0;i<a.length;i++)
			{
				if(a[i] != b[i])
				{
					compare = false;
					break;
				}
				
			}
			
		}
		
		else
		{
			compare = false;
			System.out.println("Array Lengths doesn't match");
		}
    
		return compare;
		
	}
}
