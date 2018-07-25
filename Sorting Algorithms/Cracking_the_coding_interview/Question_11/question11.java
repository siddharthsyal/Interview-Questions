//In an array of integers, a "peak" is an element which is greater than or equal to the adjacent integers and "a valley"
//is an element which is less than or equal to the adjacent integers. For example, in the array {5,8,6,2,3,4,6}, {8,6} are peaks 
//and {5,2} are valleys. Given an array of intgers, sort the array into an alternating sequence of peaks and valleys 
//Example : Input : {5,3,1,2,3}
//          Output : {5,1,3,2,3}

import java.util.Scanner;

public class question11 {
	
	private void peakValley(int[] array, int length)
	{
		int i =0;
		for(i=1;i<length-1;i=i+2)//Takes care of peaks and valleys are automatically in place.
		{
			if(array[i-1]>array[i])
			{
				int temp =  array[i-1];
				array[i-1] =  array[i];
				array[i] = temp;
				continue;
			}
			else if(array[i]<array[i+1])
			{
				int temp =  array[i+1];
				array[i+1] =  array[i];
				array[i] = temp;
				continue;
			}
			else
				continue;
		}
		return;
	}

	private void user_interface()
	{
		System.out.println("Enter the length of the array");
		Scanner scan1 = new Scanner(System.in);
		int length = scan1.nextInt();
		int[] array = new int[length];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<length;i++)
		{
			Scanner scan2 = new Scanner(System.in);
			array[i] = scan2.nextInt();
			
		}
		peakValley(array, length);
		System.out.println("New array is");
		for(int i=0;i<length;i++)
			System.out.print(array[i]+" ");
		return;
	}
	public static void main(String[] args) {
		question11 m = new question11();
		m.user_interface();
	}
}
