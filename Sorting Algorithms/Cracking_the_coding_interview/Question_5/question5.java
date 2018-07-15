// Given a sorted array of strings that is interpersed with empty strings.
// Write a method to find the location of a given string.
// Input String : ["at","","","","ball","","","cat","","","dad","",""]
// input Element : cat
// Location : 8

import java.util.Scanner;
import java.lang.*;
import java.util.Arrays;

public class question5 {
	private int length =0;
	private String[] s = {"at","","","","ball","","","cat","","","dad","",""};
	private String element;
	
	private int BinarySearch( int min, int max)
	{
		int mid ;
		int result = -1;
		while(min<=max)
		{
			mid = (min+max)/2;			
			while(this.s[mid].equals(""))//Reducing the value of mid till s[mid] != ""
				mid--;
			if(this.s[mid].equals(this.element) == true)
			{
				result = mid;
				break;
			}
			else if(this.s[mid].compareTo(this.element)<0)//Lexographic comparison
				min = mid+1;
			else if(this.s[mid].compareTo(this.element)>0)//Lexographic comparison
				max = mid-1;
		}
		return result;
	}
	private void user_interface()
	{
		this.element = "cat";
		this.length =12;
		int result = BinarySearch(0,this.length);
		System.out.println("The location is "+(result+1));
	}
	
	public static void main(String args[])
	{
		question5 m = new question5();
		m.user_interface();
	}
}
