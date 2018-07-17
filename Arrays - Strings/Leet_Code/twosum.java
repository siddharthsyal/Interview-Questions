//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//Source : LeetCode

import java.util.HashMap;
import java.util.Scanner;
public class twosum {
	private int a=0, b=0;
	
	private void result(int[] a, int length)
	{
		System.out.println("Enter the target sum");
		Scanner scan1 = new Scanner(System.in);
		int target = scan1.nextInt();
		HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
		for(int i =0;i<length;i++)
		{
			int compliment = target - a[i];
			if(table.containsKey(compliment))//Constantly checking if the compliment is found. This reduces the time complexity
			{
				this.a = table.get(compliment);
				this.b = i;
				return;
			}
			table.put(a[i], i);
		}
		return;
	}
	
	private void user_interface()
	{
		System.out.println("Enter the total number of elements for the array");
		Scanner scan1 = new Scanner(System.in);
		int length = scan1.nextInt();
		int [] a = new int[length];
		System.out.println("Enter the elements for the array");
		for (int i =0;i<length ;i++)
		{
			Scanner scan2 = new Scanner(System.in);
			a[i]= scan2.nextInt();
		}
		result(a,length);	
		System.out.println(this.a +" "+this.b);
	}
	public static void main(String args[])
	{
		twosum m =  new twosum();
		m.user_interface();
	}
}
