// Given a sorted array of n integers that has been rotated an unknown number of times.
// Write code to find an element position in the array. You may assume that the array has originally been sorted in increasing order. 

import java.util.Scanner;

public class question3 {

	private int length, element;
	private int[] array = new int[length];
	
	private int findElement(int[] a, int min, int max)//Carefully check, one of the half would be completely sorted
	{
		while(min<=max)
		{
		int mid = (max+min)/2;
		if(this.array[mid] == this.element)
			return mid;
		else
		{
			if(a[mid]<=a[max])//Checking if right side is sorted
			{
				if((this.element>a[mid])&&(this.element<=a[max]))//Checking if the element can belong in the right side
				{
					min = mid+1;
				}
				else 
					max = mid-1;
			}
			else if(a[mid]>a[min])//Checking if left side is sorted
			{
				if((this.element>=a[min])&&(this.element<a[mid]))//Checking if the element can belong in the left side
				{
					max =  mid-1;
				}
				else 
				{
					min = mid+1;
				}
			}				
		}
		}
		return 100;		
	}
	
	private void user_interface() {
		System.out.println("Enter the number of elements for the array");
		Scanner scan1 = new Scanner(System.in);
		this.length  = scan1.nextInt();
		this.array =  new int[this.length];
		System.out.println("Enter contents of the array in rotated format");
		for(int i =0;i<this.length;i++)
		{
			Scanner scan2 = new Scanner(System.in);
			this.array[i] = scan2.nextInt();
		}
		System.out.println("Enter the number that you want to find");
		Scanner scan2 = new Scanner(System.in);
		this.element = scan2.nextInt();
		int result = findElement(this.array,0,this.length-1);
		if(result != 100)
			System.out.println(result);
		else
			System.out.println("Number does not exist in the array");
	}
	public static void main(String args[])
	{
		question3 m = new question3();
		m.user_interface();
	}
}
