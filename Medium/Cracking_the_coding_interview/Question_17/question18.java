//You are given an array of integers (both positive & negative). Find the continguous sequence with the largest sum. Return the sum.
//For example : Input = {2, -8, 3, -2, 4, -10}
//            : Output = 5 (Max Sum)

import java.util.Scanner;

public class question17 {

	public int findSum(int[] array)
	{
		int sum=0, maxSum=0,k=0;
		for(int i : array)
		{
			sum = sum+i;
			if(maxSum<sum)
				maxSum=sum;
			else if(sum<0)
				sum=0;
		}		
		return maxSum;
	}
	public void user_interface()
	{
		int i=0;
		System.out.println("Enter the number of elements for the array");
		Scanner scan1 = new Scanner(System.in);
		int length = scan1.nextInt();
		int[] array = new int[length];
		System.out.println("Enter the elements for the array");
		for(i=0;i<length;i++)
		{
			Scanner scan2 = new Scanner(System.in);
			array[i]= scan2.nextInt();
		}
		System.out.println("Max sum achieved is "+findSum(array));
		return;
	}
	public static void main(String[] args) 
	{
		question17 m = new question17();
		m.user_interface();
	}
}
