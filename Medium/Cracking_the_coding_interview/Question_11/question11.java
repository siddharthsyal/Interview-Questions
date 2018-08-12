//You are building a diving board by placing a bunch of planks of wood end-to-end. There are two types of planks, one of length shorter
//and one of length longer. You must use exactly K planks of wood. Write a method to generate all possible lengths for the diving board. 

import java.util.Scanner;
import java.util.*;
public class question11 {
	public int shorter=0, longer=0,k=0;
	HashSet<Integer> map = new HashSet<Integer>();
	public void possiblity()
	{
		for(int i=0;i<=this.k;i++)
		{
			int longer = this.k-i;
			int length = (longer*this.longer)+(i*this.shorter);
			map.add(length);
		}
		System.out.println(map);
	}
	public void user_interface()
	{
		System.out.println("Enter the length for shorter");
		Scanner scan1 = new Scanner(System.in);
		this.shorter = scan1.nextInt();
		System.out.println("Enter the length for longer");
		Scanner scan2 =  new Scanner(System.in);
		this.longer = scan2.nextInt();
		System.out.println("Enter the total number of planks");
		Scanner scan3 = new Scanner(System.in);
		this.k= scan3.nextInt();		
		possiblity();
	}
	public static void main(String args[])
	{
		question11 m = new question11();
		m.user_interface();
	}
}
