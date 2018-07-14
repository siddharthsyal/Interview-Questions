//Find if there are duplicate characters present in the string

import java.util.HashMap;
import java.util.Scanner;
public class question1 {
	
	private String s;
	
	private int CheckDuplicates() {
		int i=0,j=0;
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		while(j<s.length())
		{
			if(map.containsKey(s.charAt(j))) //Checking if there is already a key for charAt(i) present
			{
				System.out.println("Duplicates present");
				return 1;
			}
			else
				map.put(s.charAt(j), 1);
			j++;
		}
		return 0;
	}
	private void user_interface() {
		System.out.println("Enter the string");
		Scanner scan1 = new Scanner(System.in);
		this.s=scan1.next();
		int result = CheckDuplicates();
		if(result ==0)
			System.out.println("Duplicates not present");
	}
	public static void main(String args[])
	{
		question1 m = new question1();
		m.user_interface();
	}
}
