// Write a method to replace all the spaces in a string with %20
// Input : " Mr John Smith    ", Length 17
// Output : Mr%20John%20Smith

import java.util.Scanner;

public class question3 {
	public static void main ( String args [])
	{
		int length=0, i=0;
		System.out.println("Please enter the total length of the string");
		Scanner scan = new Scanner(System.in);
		length = scan.nextInt();
		char[] input = new char [length];	
		removespace(length);
	}
	
	public static void removespace(int length)
	{
		int i=0,ascii=0,j=0;
		char temp;
		String user_input;
		System.out.println("Enter the string ");
		Scanner scan = new Scanner(System.in);
		user_input = scan.nextLine();
		char[] input = new char [length];		
		for (i=0;i<length;i++)
		{			
			input[i] = user_input.charAt(i);
		}
		for (i=0;i<length;i++)
		{			
			if(input[i]== ' ')
			{
				for (j=(length-1);j>i+1;j--) // Shifting the characters to make space for '2'
				{
					temp = input[j];
					input[j]=input[j-1];
					input[j-1]=temp;
				}
				for (j=(length-1);j>i+1;j--) // Shifting the characters to make space for '0'
				{
					temp = input[j];
					input[j]=input[j-1];
					input[j-1]=temp;
				}	
				input[i]= '%';
				input[i+1]= '2';
				input[i+2]= '0';				
			}
		}
		System.out.println("\nThe string is");
		for(i=0;i<length;i++)
		{
			System.out.print(input[i]);
		}		
	}
}
