//Given two arrays of integers, compute the pair of values (one value in each array) with smallest (+ve) difference. Return difference.
//Example : Input = { 1,3,15,11,2 }
//                  { 23,27,235,19,8 }
//          Output = 3. The  pair is {11,8} 

import java.util.Scanner;

public class question6 {

	private void quickSort(int[] array,int min,int max)
	{
		if(min<max)
		{
			int pindex = pivot(array,min,max);
			quickSort(array,min,pindex-1);
			quickSort(array,pindex+1,max);
		}
	}
	private int pivot(int[] array, int min,int max)
	{
		int i, k=min;
		for(i =min;i<max;i++)
		{
			if(array[i]<=array[max])
			{
				int temp = array[i];
				array[i]= array[k];
				array[k] = temp;
				k++;
			}
		}
		int temp = array[max];
		array[max]= array[k];
		array[k] = temp;		
		return k;
	}
	private void difference(int[] a, int[]b,int lenA, int lenB)
	{
		int i =0,j=0,min,diff=0, num1=0, num2=0;
		
		if(a[i]<b[j])
			min = b[j]-a[i];//for +ve initial min value
		else 
			min = a[i]-b[j];//for +ve initial min value
		while((i<lenA)&&(j<lenB))
		{
			if(a[i]<b[j])
			{
				diff = b[j]-a[i];//for +ve difference
				if(diff<min)
				{
					min = diff;
					num1 = a[i];
					num2 = b[j];
				}
				i++;
				continue;
			}
			else if (b[j]<a[i])
			{
				diff = a[i]-b[j];//for +ve difference
				if(diff<min)
				{
					min = diff;
					num1 = a[i];
					num2 = b[j];
				}
				j++;
				continue;
			}
			else//condition where elements in both the elements are same
			{
				min = a[i]-b[j];
				num1 = a[i];
				num2 = b[j];
				break;
			}
		}
		System.out.println("Min is "+min+" for pair ("+num1+","+num2+")");
		return;
	}
	private void user_interface()
	{
		System.out.println("Enter the length of array A");
		Scanner scan1 =  new Scanner(System.in);
		int lenA = scan1.nextInt();
		System.out.println("Enter the length of array B");
		Scanner scan2 = new Scanner(System.in);
		int lenB = scan2.nextInt();
		int i =0;
		int[] a = new int[lenA];
		int[] b =  new int[lenB];
		System.out.println("Enter the array A");
		for(i=0;i<lenA;i++)
		{
			Scanner scan3 = new Scanner(System.in);
			a[i] = scan3 .nextInt();
		}
		System.out.println("Enter the array b");
		for(i=0;i<lenB;i++)
		{
			Scanner scan3 = new Scanner(System.in);
			b[i] = scan3 .nextInt();
		}
		quickSort(a,0,lenA-1);//Sorting both arrays
		quickSort(b,0,lenB-1);
		difference(a,b,lenA,lenB);//finding min difference
	}
	public static void main(String[] args) {
		question6 m = new question6();
		m.user_interface();

	}
}
