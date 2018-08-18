//Check if two strings are anagrams or not.

import java.util.Scanner;
import java.util.HashMap;

public class question2 {
	
	public boolean ifAnagram(String subject, String test)
	{
		if(subject.length() == test.length())
		{
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for(int i=0;i<subject.length();i++)
			{
				map.put(subject.charAt(i), 1);
			}
			for(int i=0;i<test.length();i++)
			{
				if(!map.containsKey(test.charAt(i)))
					return false;
			}
			return true;
		}
		return false;
	}

	public void user_interface()
	{
		System.out.println("Enter the subject");
		Scanner scan1 = new Scanner(System.in);
		String subject = scan1.nextLine();
		System.out.println("Enter the test word");
		Scanner scan2 = new Scanner(System.in);
		String test = scan2.nextLine();
		String subject1 = subject.replaceAll(" ", "");
		String test1 = test.replaceAll(" ", "");
		System.out.println("Subject is " +subject1);
		System.out.println("Test is "+test1);
		if(ifAnagram(subject1,test1))
			System.out.println("Both are anagrams ");
		else
			System.out.println("Not anagrams ");
	}
	public static void main(String args[])
	{
		question2 m = new question2();
		m.user_interface();
	}
}
