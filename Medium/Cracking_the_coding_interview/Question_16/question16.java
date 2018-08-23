//Given an array of integers, write a method to find the indices m & n such that  if you sorted the elements through m and n, 
//the entire array would be sorted. Minimize n-m (that is, find the smallest such sequence)
//For example : Input = [1, 2, 4, 7, 10, 11, 7, 12,  6, 7, 16, 18, 19]
//            : Output = [4, 9]

import java.util.Scanner;

public class question16 {
	public void subSort(int[] array)
	{
		int length = array.length;
		boolean f_i=false,f_j=false;
		int i=0,final_i=0, final_j=0;
		for(i=0;i<array.length-1;i++)
		{
			if(array[i]>array[i+1] && f_i == false)
			{
				f_i = true;
				final_i=i;
			}
			if(f_j == false  && array[(array.length-1)-i]<array[(array.length-2)-i])
			{
				final_j = array.length-2-i;
				f_j = true;
			}
		}
		i= final_i;
		int j=final_j;
		while(i>=0 && j<array.length-1)
		{
			if(array[i]<array[i-1])
			{
				i--;
				continue;
			}
			if(array[i]>array[j+1])
			{
				j++;
				continue;
			}
			if(array[j]>array[j+1])
			{
				j++;
				continue;
			}
			if(array[j]<array[i-1])
			{
				i--;
				continue;
			}
			break;
		}
		System.out.println("i ="+i+" j = "+j);
		return;
	}
	public void user_interface()
	{
		int[] array = new int[13];
		int i=0;
		System.out.println("Enter the array");
		for(i=0;i<13;i++)
		{
			Scanner scan1 = new Scanner(System.in);
			array[i]= scan1.nextInt();
		}
		subSort(array);
	}
	public static void main(String args[])
	{
		question16 m = new question16();
		m.user_interface();
	}
}
