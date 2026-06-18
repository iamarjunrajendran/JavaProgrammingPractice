package ArrayProblems;

import java.util.Scanner;

public class array_SumOfarrayElements {

	public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.println("Enter 5 elements");

int[] array = new int[5];
int sum =0;
System.out.println(array.length);

for(int i=0;i<array.length;i++)
{
	array[i]=sc.nextInt();
	
	
	
}

for(int x: array)
{
	sum=sum+x;
}


System.out.println(sum);


}

}
