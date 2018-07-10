//Write a method to sort an array of strings so that all the anagrams are next to each other

import java.util.Scanner;
import java.util.Arrays;

public class question2 {
	private int len_a =0;
	private String[] a = new String[len_a];
	private String[] b = new String[len_a];
	private int k=0;
	
	private void stringTochar(String  str)// Since strings are immutable, we need to covert to Char array to apply sorting algorithm
	{
		char[] array = new char[str.length()];
		int i =0;
		for(i=0;i<str.length();i++)
		{
			array[i] = str.charAt(i);
		}
		quicksort(array,0,str.length()-1);
		this.b[k]= new String(array);		
	}
	private void quicksort(char[] a, int start, int end)// passing individual strings from the string array to apply sorting algorithm
	{
		int pindex;
		if(start<end)
		{
			pindex = pivot(a,start, end);
			quicksort(a, start, pindex-1); 
			quicksort(a, pindex+1, end); 
		}
	}
	
	private int pivot(char[] a, int start, int end) 
	{											  
		int k = start;
		char pivot = a[end];
		for(int i =start;i<end;i++)
		{
			if(a[i]<=a[end])
			{
				char  temp = a[i] ;
				a[i] =  a[k];
				a[k]  =  temp;
				k++;
			}
		}
		char temp= a[k];
		a[k] = a[end];
		a[end] = temp;
		return k;		
	}
	private void group(int len)// Grouping anagrams together
	{
		int i,j;
		for(i=0;i<len;i++)
		{
			for(j=i+1;j<len;j++)
			{
				if(j>len)
					break;
				if(this.b[i].equals(this.b[j]))
				{
					String temp = a[j];
					a[j] = a[i+1];
					a[i+1]= temp;
					i++;
					break;
				}
			}
		}
	}

	private void user_interface()
	{
		int i,user_input =0;
		System.out.println("Enter the number of strings");
		Scanner scan1 = new Scanner(System.in);
		user_input = scan1.nextInt();
		this.a = new String[user_input];
		this.b = new String[user_input];
		System.out.println("Enter the Strings");
		for(i=0;i<user_input;i++)
		{
			Scanner scan2 = new Scanner(System.in);
			this.a[i]= scan2.nextLine();
		}
		for(i=0;i<user_input;i++)
		{
			stringTochar(this.a[i]);
			this.k++;
		}
		group(user_input);
		for(i=0;i<user_input;i++)
			System.out.print(this.a[i]+" ");
		
	}
	public static void main(String args[]) {
		question2 m = new question2();
		m.user_interface();
	}

}
