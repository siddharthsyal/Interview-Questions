// Given a string, write a function to check if it is permutation of a palindrome or not.

import java.util.Scanner;

public class question4 {
	public static void main(String args[])
	{
		String str1;
		System.out.println("Please enter the string");
		Scanner scan = new Scanner(System.in);
		str1 = scan.nextLine();
		permutation(str1);
	}
	
	public static void permutation(String str1)
	{
		int length=0, i=0, sum=0;
		int[] counter = new int[128];
		for(i=0;i<128;i++)
		{
			counter[i]=0;
		}
		length=str1.length();
		if((length%2)==0) // Checking if length is even
		{
			for(i=0;i<str1.length();i++)
			{
				counter[str1.charAt(i)] = counter[str1.charAt(i)] +1;
				sum = counter[str1.charAt(i)]; // At the end of the string, the sum should be divisible by 2 as each character should be present twice.
			}
			if((sum%2)==0)
			{
				System.out.println("True");
				return;
			}
			else
			{
				System.out.println("False");
				return;
			}
		}
		else // For odd length
		{
			for(i=0;i<str1.length();i++)
			{
				counter[str1.charAt(i)] = counter[str1.charAt(i)] +1;
			}
			for(i=0;i<str1.length();i++)
			{
				if(counter[str1.charAt(i)]==1)
				{
					sum++;
				}
			}
			if(sum==1) { // At the end of the  string, there should be exactly ONE character which is unique for a palindrome of an odd length
				System.out.println("true");
				return;
			}
			else {
				System.out.println("False");
				return;
			}
		}
	}
}
