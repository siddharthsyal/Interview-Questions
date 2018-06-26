// Implement a method to perform basic string compression using the counts of repeated characters.
// Input : aabcccccaaa    Output: a2b1c5a3

import java.util.Scanner;

public class question6 {
	public static void main(String args[])
	{
		String user_input;
		System.out.println("Enter the String");
		Scanner scan = new Scanner(System.in);
		user_input = scan.nextLine();
		compression(user_input);
	}
	
	public static void compression(String user_input)
	{
		int i=0,count=0;
		StringBuffer s = new StringBuffer("");
		for(i=0;i<user_input.length();i++)
		{
			if( i == user_input.length()-1)
			{
				if(user_input.charAt(i)==user_input.charAt(i-1))
				{
					count++ ;
					s.append(user_input.charAt(i));
					s.append(count);
				}
				else
				{
					count++;
					s.append(user_input.charAt(i));
					s.append(count);
				}
			}
			else
			{
				if(user_input.charAt(i) == user_input.charAt(i+1))
				{
					count++;
				}
				else if (user_input.charAt(i) != user_input.charAt(i+1))
				{
					count++;
					s.append(user_input.charAt(i));
					s.append(count);
					count=0;
				}				
			}
		}
		if(user_input.length() == s.length())
			System.out.println("User Input String :"+user_input);
		else
			System.out.println("New String :"+s);		
	}
}
