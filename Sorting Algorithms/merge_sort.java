//Merge Sort

import java.util.Scanner;
import java.util.Arrays;

public class merge_sort {

	private void sort(int[] a)
	{
		int length = a.length;
		if(length < 2)
			return;
		int mid = length/2;
		int[] left = new int[mid];
		int[] right = new int[length-mid];
		for(int i=0;i<mid;i++)
			left[i]=a[i];
		for(int i=mid;i<length;i++)
			right[i-mid]=a[i];
		sort(left);
		sort(right);
		merge(left, right, a);
	}
	private void merge(int[]left,int[] right, int[] a)
	{
		int left_len = left.length;
		int right_len = right.length;
		int i =0,j=0,k=0;
		while(i<left_len && j<right_len)
		{
			if(left[i]<right[j])
				a[k++] = left[i++];
			else
				a[k++] = right [j++];
		}
		while(i<left_len)
			a[k++]= left[i++];
		while(j<right_len)
			a[k++]= right[j++];
	}
	
	private void user_interface()
	{
		System.out.println("Enter the length of the array");
		Scanner scan1 = new Scanner(System.in);
		int length = scan1.nextInt();
		int[] array = new int[length];
		System.out.println("Enter the elements for the array");
		for(int i=0;i<length;i++)
		{
			Scanner scan2 = new Scanner(System.in);
			array[i]= scan2.nextInt();
		}
		sort(array);
		System.out.println("Sorted array is");
		for(int i=0;i<length;i++)
			System.out.print(array[i]+" ");
	}
	public static void main(String[] args) {
		merge_sort m = new merge_sort();
		m.user_interface();
	}
}
