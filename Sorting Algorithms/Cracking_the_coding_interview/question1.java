// You are given two sorted arrays, A and B, where A has a large enough buffer at the end
// to hold B. Write a method to merge B into A in sorted order.

import java.util.Scanner;

public class question1 {
	private int k =0;
	private int m =0;
	private int total_len =0;
	int[] a = new int[total_len];
	int[] b =  new int[m];
	private void merge ()
	{
		this.total_len--;
		while(m>=0) // Helps in inserting the elements before the first element of A
		{
			if(k>=0 && a[k]>b[m])
			{
				a[this.total_len]=a[k];
				k--;
			}
			else
			{
				a[this.total_len] = b[m];
				m--;
			}
			this.total_len--;			
		}
	}
	private void user_interface() {
		int len_a =0, counter = 0;
		System.out.println("Enter the number of elements in Array A");
		Scanner scan1 = new Scanner(System.in);
		this.k = scan1.nextInt();
		this.k =  this.k-1;
		System.out.println("Enter the number of elements  in the Array B");
		Scanner scan2 = new Scanner(System.in);
		this.m = scan2.nextInt();
		this.b = new int[m];
		this.m = this.m-1;
		len_a = this.m+this.k+2;
		this.total_len = len_a;
		this.a = new int[len_a]; // Array A has extra buffer to include the smaller array
		System.out.println("Enter the elements for A");
		for(int i =0;i<=this.k;i++)
		{
			Scanner scan3 = new Scanner (System.in);
			this.a[i] = scan3.nextInt();
		}
		System.out.println("Enter the elements for B");
		for(int i =0;i<=this.m;i++)
		{
			Scanner scan3 = new Scanner(System.in);
			this.b[i] = scan3.nextInt();
		}
		merge();
		System.out.println("The merged array is");
		for(int i=0;i<len_a;i++)
			System.out.print(a[i]+" ");		
	}
	public static void main(String args[])
	{
		question1 m = new question1();
		m.user_interface();	}
}
