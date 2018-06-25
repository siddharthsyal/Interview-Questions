//Check if a string has all unique characters

import java.util.Scanner;
import java.util.Arrays;
public class question1 {
	public static void main (String[] args)
	{
		int count = 0, ascii;
		char ch;
		System.out.println("Please enter the string");
		Scanner scan = new Scanner(System.in);
		String user_input = scan.nextLine();
		int input_length = user_input.length();
		System.out.println(input_length);
		int[] char_set = new int[128];  // Total Number of standard asci characters is the length of the array
		Arrays.fill(char_set, 0);
		for ( int i=0; i<input_length;i++)
		{
			ch=user_input.charAt(i);
			ascii = ch;
			if(char_set[ascii] ==1 )  // For each character check its associated position in the array.
			{
				System.out.println("The string does not have unique characters");
				return;
			}
			char_set[ascii]=1;    // For each unique character, set char_set[ascii] to 1			
		}
			}
}
