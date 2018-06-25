//Given two strings, write a method to check if one is permutation of another.

import java.util.Scanner;
public class question2 {
	public static void main(String args[])
	{
		String str1 , str2;
		System.out.println("Please enter the string 1");
		Scanner scan = new Scanner(System.in);
		str1 = scan.nextLine();
		System.out.println("Please enter the string 2");
		Scanner scan1 = new Scanner(System.in);
		str2 = scan1.nextLine();
		permutations (str1,str2);		
	}
	public static void permutations(String str1, String str2)
	{
		int i=0, asci=0, sum =0;
		int array []= new int [128];
		if(str1.length()!=str2.length())  // If the string length, for both the strings, does not match. They cannot be permutations.
		{
			System.out.println("Not permuation");
			return;
		}
		for(i=0;i<str1.length();i++)
		{
			asci = str1.charAt(i);
			array[asci]=1;	    // For each character, initializing the associated array poistions to 1.
			sum = sum + asci; 
		}
		for(i=0;i<str2.length();i++)
		{
			asci = str2.charAt(i);
			sum = sum - asci;  
			if(array[asci]==0 || (sum != 0 && i == str2.length()-1)) // Array[asci] == 0 is for checking if its a unique charcater or present in the other string as well
			{                                                        // Ideally, the sum should be 0 if both the strings are permutations of each other.
				System.out.println("Not permutation");
				return;				
			}
		}
		System.out.println("Permuation");
		
	}

}
