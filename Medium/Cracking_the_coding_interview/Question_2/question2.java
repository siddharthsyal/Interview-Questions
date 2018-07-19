//Design a method to find the frequency of occurences of any given word in a book.
//What if we are  using the  method multiple times?

import java.util.HashMap;
import java.util.Scanner;
import java.lang.*;

public class question2 {
	
	private void checkFrequency(String sentence, int length)
	{
		HashMap<String, Integer> map = new HashMap<String,Integer>();//Using hashmap to have an access time of O(1)
		StringBuffer buff = new StringBuffer();
		for(int i =0;i<length;i++)
		{
			if(sentence.charAt(i) == ' ')
			{
				System.out.println(buff);
				String buff_1 = buff.toString();//Converting String buffer type to String
				if(map.containsKey(buff_1) == true)
				{
					int j = map.get(buff_1);
					map.put(buff_1, j+1);
				}
				else
				{
					map.put(buff_1, 1);
				}
				buff.setLength(0);//Deleting the previous word from the string buffer
				continue;
			}
			else
			{
				buff.append(sentence.charAt(i));
			}
		}
		System.out.println("Enter the word for frequency check");
		Scanner scan1 = new Scanner(System.in);
		String target = scan1.nextLine();
		if(map.containsKey(target))
		{
			System.out.println("Frequency is " +map.get(target));
		}
		else
		{
			System.out.println("Oops!");
		}
	}
	private void user_interface() {
		String sentence;
		System.out.println("Enter the sentence");
		Scanner scan1 = new Scanner(System.in);
		sentence = scan1.nextLine();
		int length = sentence.length();
		checkFrequency(sentence, length);		
		}
	
	public static void main(String args[])
	{
		question2 m = new question2();
		m.user_interface();
	}
}
