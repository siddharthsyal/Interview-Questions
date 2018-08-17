//Given an array of integers, determine the longest increasing sequence

import java.util.Scanner;

public class question1 {
	
	public void longestSeq(int[] a, int length)
	{
		int sum=0, lastMax=0, k =0, l=0,buff=0;
		boolean init = false;
		for(int i=0;i<length;i++)
		{
			if(i != length-1)
			{
				if(a[i]<a[i+1])
				{
					if(init == false)
					{
						init =  true;
						buff=i;
					}
					sum++;
					if(sum>lastMax)
					{
						lastMax = sum;
						k=buff;
						l=i;
					}
				}
				else
				{
					sum=0;
					init = false;
				}
					
				}
			else if(i==length-1 &&(a[i-1]<a[i]))
			{
				sum++;
				if(sum>lastMax)
				{
					lastMax = sum;
					l=i;					
				}
			}
		}
		System.out.println("Longest seq is of "+lastMax+" between k = "+k+" l = "+l);
		return;
			
	}
	public void user_interface()
	{
		int i=0;
		int[] a = new int[10];
		System.out.println("Enter the elements:");
		for(i=0;i<10;i++)
		{
			Scanner scan1 = new Scanner(System.in);
			a[i] = scan1.nextInt();
		}
		longestSeq(a,10);
	}

	public static void main(String[] args) {
		question1 m = new question1();
		m.user_interface();

	}
}
