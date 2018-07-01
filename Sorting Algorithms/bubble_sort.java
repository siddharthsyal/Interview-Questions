// Bubble sort algorithm

import java.util.Scanner;

public class bubble_sort {
	
	private void user_interface()
	{
		System.out.println("Enter the number of elements for the array");
		Scanner scan1 = new Scanner(System.in);
		int n = scan1.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the values for the array");
		for(int i =0;i<n;i++)
		{
			Scanner scan2 = new Scanner(System.in);
			array[i] =  scan2.nextInt();
		}
		this.sort(n, array);
	}
	
	private void sort(int n , int [] array)
	{
		boolean flag = false;
		int i, j;
		for(i=0;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
				if(array[j-1]>array[j]) // Swapping if the previous element is greater than the current.
				{
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
					flag = true; // For improving the execution time.
				}
				else 
					continue;
			}
			if(flag == false) // Breaks the loop if the algorithm sorts the array before the  maximum passes. 
				break;
		}
		print(n, array);
		return ;
	}
	private void print (int n , int[] array)
	{
		int i=0;
		for(i=0;i<n;i++)
			System.out.print(array[i]+" ");
		return ;
	}
	
	public static void main(String args[])
	{
		bubble_sort m = new bubble_sort();
		m.user_interface();
	}
}
