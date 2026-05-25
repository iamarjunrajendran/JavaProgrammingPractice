package String_Problems;

import java.util.Scanner;

public class UpperLowerCaseCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the text: ");
		
		String s = sc.nextLine();
		
		int ucount=0;
		int lcount=0;
		
	for(int i=0;i<s.length();i++)
	{
		char ch = s.charAt(i);
		
		if(ch>='a'&&ch<='z')
		{
			lcount=lcount+1;
		}
		else if(ch>='A'&&ch<='Z')
		{
			ucount=ucount+1;
		}
		
	}
	
System.out.println("Upper Count: "+ucount +"Lower Count: "+lcount);

	}

}
