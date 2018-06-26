// There are three types of edits possible on a string: insert a char, delete a char & replace a char.
// Given two strings write a function to check if they are one edit away.

import java.util.Scanner;

public class question5 {
	public static void main (String args[])
	{
		String user_input1, user_input2;
		System.out.println("Please enter the String 1");
		Scanner scan = new Scanner(System.in);
		user_input1 = scan.nextLine();
		System.out.println("Please enter the String 2");
		Scanner scan1 = new Scanner(System.in);
		user_input2 = scan1.nextLine();		
		edit(user_input1, user_input2); // passing the strings to the EDIT function
	}
	
	public static void edit(String str1, String str2)
	{
		int i=0, counter=0,j=0;
		if(str1.length()==str2.length())// To check if there has been exactly ONE replacement.
		{
			for(i=0;i<str1.length();i++)
			{
				if(str1.charAt(i)!=str2.charAt(i))
					counter++;
			}
			if(counter != 1)
				System.out.println("False");
			else
				System.out.println("True");
		}
		else if(str2.length()-str1.length()==1) // To check if there has been addition of only ONE character
		{
			j=0;counter =0;
			for(i=0;i<str2.length();i++)
			{
				if(str1.charAt(j)!=str2.charAt(i))
					counter++;
				else
					if((j=j+1)<str1.length())
					{
						continue;
					}
					else
						j=j-1;			
				}
			if(counter != 1)
				System.out.println("False");
			else
				System.out.println("True");			
		}
		else if(str1.length()-str2.length()==1) // To check only ONE character has been removed
		{
			for(i=0;i<=str2.length();i++) {
			if(str1.charAt(i)!=str2.charAt(j))
			{
				counter++;
			}
			else
				if((j=j+1)<str2.length())
					continue;
				else
					j=j-1;
			}
			if(counter>1)
				System.out.println("False");
			else
				System.out.println("True");
		}
		else // if either of the three cases dont match.
			System.out.println("False");
	}
}
