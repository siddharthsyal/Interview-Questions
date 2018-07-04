//Radix sort algorithm

import java.util.Scanner;
import java.util.Arrays;

public class radix_sort {
	int length;
	int [] a = new int[length];
	
	
	private int getmax()
	{
		int max = this.a[0];
		for(int i =0;i<this.length;i++)
		{
			if(a[i]>max)
				max = a[i];
		}
		return max;
	}
	
	private void radixsort(int exp)
	{
		int[] count = new int[10]; // To count occurrence of a digit
		int[] buffer = new int[this.length]; //Extra array to act as buffer
		Arrays.fill(count, 0);
		Arrays.fill(buffer, 0);
		for(int i =0;i<this.length;i++)
		{
			count[(this.a[i]/exp)%10]++;
		}
		for(int i=1;i<10;i++) // Change count[i] so that count[i] now contains
		{	      	     // actual position of this digit in the buffer
			count[i] +=count[i-1];
		}
		for(int i = this.length-1;i>=0;i--)
		{
			buffer[count[(a[i]/exp)%10]-1] = a[i];
			count[(this.a[i]/exp)%10]--;
		}
		for(int i=0;i<this.length;i++)
		{
			this.a[i] = buffer[i];
		}
	}
	private void user_interface()
	{
		int data;
		System.out.println("Enter the number of elements for the array");
		Scanner scan1 = new Scanner(System.in);
		data = scan1.nextInt();
		this.a = new int[data];
		this.length = data;
		System.out.println("Enter the array");
		for(data =0;data<this.length;data++)
		{
			Scanner scan2 = new Scanner(System.in);
			this.a[data] = scan2.nextInt();
		}
		int max = this.getmax();
		for(int exp = 1; max/exp >0 ; exp =exp*10)
		{
			this.radixsort(exp);
		}
		for(data =0;data<this.length;data++)
		{
			System.out.println(this.a[data] +" ");
		}
		return;		
	}
	public void main(String args[])
	{
		radix_sort m = new radix_sort();
		m.user_interface();
	}
}
