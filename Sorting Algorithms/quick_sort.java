// Quick sort algorithm 
import java.util.Scanner;

public class quick_sort {
	int length;
	int[] array =  new int[length];
	
	private void user_interface() {
		int data, input,i;
		System.out.println("Enter the number of elements");
		Scanner scan1 = new Scanner(System.in);
		this.length = scan1.nextInt();
		this.array = new int [length];
		System.out.println("Enter the elements for the array");
		for(i=0;i<length;i++)
		{
			Scanner scan2 =  new Scanner(System.in);
			this.array[i] = scan2.nextInt();
		}
		quicksort(this.array,0,this.length-1);
		print();
		return;
	}
	private void quicksort(int[] a, int start, int end)
	{
		int pindex;
		if(start<end)
		{
			pindex = pivot(a,start, end);// Getting the index of pivot element
			quicksort(a, start, pindex-1); // Dividing the array using the index of pivot element.
			quicksort(a, pindex+1, end); // Dividing the array using the index of pivot element.
		}
	}
	
	private int pivot(int[] a, int start, int end) // Elements lesser than or equal to pivot
	{					       // element belong to the left side of the pivot
		int k = start;
		int pivot = a[end];
		for(int i =start;i<end;i++)
		{
			if(a[i]<=a[end])
			{
				int  temp = a[i] ;
				a[i] =  a[k];
				a[k]  =  temp;
				k++;
			}
		}
		int temp= a[k];
		a[k] = a[end];
		a[end] = temp;
		return k;		
	}
	private void print()
	{
		int i=0;
		for(i=0;i<length;i++)
			System.out.print(this.array[i]+" ");
		return;
	}
	public static void main(String args[])
	{
		quick_sort m = new quick_sort();
		m.user_interface();
	}
}
