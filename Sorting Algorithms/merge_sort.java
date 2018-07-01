//Merge Sort

import java.util.Scanner;

public class merge_sort {

	private int length;
	int[] b =  new int[length];	
	private void sort(int a[], int p, int r) // Recursively breaking the elements of the array
	{
		if(p<r) // Only breaking  if there are at least two numbers in the array.
		{
			int q = (p+r)/2;
			sort(a,p,q);
			sort(a,q+1,r);
			merge(a,p,q,r);			
		}
		return;
	}
	private void merge(int a[], int p, int q, int r) // sorting and merging into a new array.
	{
		
		int i=p,j=0,k=0;
		j=q+1;
		while(i<=q && j<=r)
		{
			if(a[i]<a[j])
			{
				this.b[k++] = a[i++];
			}
			else 
			{
				this.b[k++]= a[j++];
			}
		}
		while(i<=q)
		{
			this.b[k++] = a[i++];
		}
		while(j<=r)
		{
			this.b[k++] = a[j++];
		}
		return;
	}
	
	private void user_interface()
	{
		System.out.println("Enter the number of elements");
		Scanner scan1 =  new Scanner(System.in);
		this.length = scan1.nextInt();
		this.b = new int[length];
		int[] a =  new int[this.length];
		System.out.println("Enter the elements");
		for(int i=0;i<length;i++)
		{
			Scanner scan2 = new Scanner(System.in);
			a[i]=  scan2.nextInt();
		}
		this.sort(a, 0, this.length-1);
		for(int i=0;i<length;i++)
		{
			System.out.print(b[i] +" ");
		}
		return;
	}
	public static void main(String args[])
	{
		merge_sort m =  new merge_sort();
		m.user_interface();
	}
}
