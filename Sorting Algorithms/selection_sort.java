//Selection sort algorithm

import java.util.Scanner;

public class selection_sort {

	private void user_interface() {
		System.out.println("Enter the number of the elements");
		Scanner scan1 = new Scanner(System.in);
		int n = scan1.nextInt();
		int[] array = new int[n];
		for(int i =0;i<n;i++)
		{
			Scanner scan2 = new Scanner(System.in);
			array[i] = scan2.nextInt();
		}
		selection_sort(n, array);
		return;
	}
	
	private void selection_sort(int n , int[] array)
	{
		int i,j, temp;
		boolean flag =  false;
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(array[i]>array[j]) // Swapping the minimum element in the array with the i'th position
				{
					temp = array[j];
					array[i] = array[j];
					array[j] = temp;
					flag = true;
				}
			}
			if(flag == false)  // Increasing the efficiency of the algorithm 
				break;
		}
		print(n, array);
		return ;		
	}
	private void print(int n, int[] array)
	{
		int i ;
		for(i=0;i<n;i++)
		{
			System.out.print(array[n] +" ");
		}
		return;
	}
	private void main(String args[])
	{
		selection_sort m = new selection_sort();
		m.user_interface();
	}
}
