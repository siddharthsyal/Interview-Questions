// Given an image represented by NxN matrix, where each pixel in the image is 4 bytes. 
// Write a method to rotate the image by 90 degrees.

import java.util.Scanner;
public class question7 {
	public static void main(String args[])
	{
		int n=0,i,j;
		System.out.println("Please enter the value of N");
		Scanner scan = new Scanner (System.in);
		n = scan.nextInt();
		int[][] array = new int [n][n];
		System.out.println("Please enter the matrix");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				Scanner num = new Scanner(System.in);
				array[i][j] = scan.nextInt();
			}
		}
		rotate(array, n);
	}
	static void rotate (int[][] array, int n)
	{
		int i , j, temp =0;
		System.out.println("The Matrix is\n");
		for(i=0;i<n;i++)
		{
			for (j=0;j<n;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		for (i=0;i<n;i++) // Finding the transpose of the matrix
		{
			for(j=i;j<n;j++)
			{
				temp = array[i][j];
				array[i][j]= array[j][i];
				array[j][i] = temp;
			}
		}
		System.out.println("The transpose of the matrix is\n");
		for(i=0;i<n;i++) 
		{
			for (j=0;j<n;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("After rotation\n");
		for(i=0;i<n;i++) // Reversing the columns of the transpose.
		{
			for(j=0;j<n/2;j++)
			{
				temp = array[j][i];
				array [j][i] = array[(n-1)-(j)][i];
				array[(n-1)-(j)][i] = temp;				
			}
		}
		for(i=0;i<n;i++)
		{
			for (j=0;j<n;j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}
