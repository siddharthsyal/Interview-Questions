// Assume you have a method "isSubstring" which checks if one word is a substring
// of another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1
// using only one call to isSubstring
// Example: waterbottle is rotation of erbottlewat

import java.util.Scanner;
public class question9_book {
	public static void main(String args[])
	{
		String str1, str2, str3;
		System.out.println("Enter the str1");
		Scanner scan1 = new Scanner(System.in);
		str1 = scan1.nextLine();
		System.out.println("Enter the str2");
		Scanner scan2 = new Scanner(System.in);
		str2 = scan2.nextLine();
		str3 =str1+str1;
		if(str1.length() != str2.length())
			return;
		if(str3.contains(str2))
		{
			System.out.println("Substring");
			return;
		}
		else 
		{
			System.out.println("Not a substring");
			return;
		}
	}

}
