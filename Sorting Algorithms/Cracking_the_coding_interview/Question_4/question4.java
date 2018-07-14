//You are given an array-like data structure Listy which lacks a size method. It does, however, have an elementAt(i) method
// that returns the element at index i in O(1) time. If i is beyond the bounds of the data strcuture it returnsw (-1).
// Given a Listy which contains sorted, positive integers, find the index at which an element x occurs.
// If x occurs multiple times, you may return any index. 

import java.util.Scanner;

public class question4 {
	Listy a = new Listy();
	private int length = 0;
	private void findLen()
	{
		int i , j=1 ;
		while(true)
		{
			if(a.array[j] == (-1))
			{
				break;
			}
			j = j*2;// Doubling the J value to reduce the time complexity of the search to O(log N)
		}
		for(i=j;i>=(j/2);i--)
		{
			if(a.array[i] != (-1))
			{
				break;
			}
		}
		System.out.println("Length is " +(i+1));
		this.length = i;
	}
	
	private int BinarySearch(int n, int low , int high)//We call binary search after getting the length of the data structure.
	{
		int mid = 0;
		while(low<=high)
		{
			mid =(low+high)/2;
			if(n<a.array[mid])
				high = mid-1;
			else if(n>a.array[mid])
				low = mid+1;
			else 
				return mid;
		}
		return -1;
	}
	private void user_interface()
	{
		
		System.out.println("Enter the element that you want to search for");
		Scanner scan1 = new Scanner(System.in);
		a = new Listy();
		int number = scan1.nextInt();
		findLen();
		int result=BinarySearch(number,0, this.length);
		if(result != (-1))
			System.out.println("The index is "+result);
		else
			System.out.println("Number does not exists");
	}
	public static void main(String args[])
	{
		question4 m = new question4();
		m.user_interface();
	}
}
