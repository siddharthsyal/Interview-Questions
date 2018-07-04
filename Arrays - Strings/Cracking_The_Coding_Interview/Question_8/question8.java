// Write an algorithm such that if an element in MxN matrix is 0, its entire row and column are set to 0

import java.util.Scanner;

public class question8_book {
	public static void main(String args[])
	{
		int m, n, i , j , k;
		boolean flag1 = true;
		boolean flag2 = true;
		System.out.println("Enter the value for M");
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		System.out.println("Enter the value for N");
		Scanner scan1 = new Scanner(System.in);
		n = scan1.nextInt();		
		int[][] a = new int[m][n];
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				Scanner scan2 = new Scanner(System.in);
				a[i][j] = scan2.nextInt();
			}
		}
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		for(i=0;i<m;i++) // Checking if any element in the first column is 0
			if(a[i][0]==0)
			{
				flag1=false;
				break;
			}
		for(i=0;i<n;i++)// Check if any element in the first row is 0
		{
			if(a[0][i]==0)
			{
				flag2 = false;
				break;
			}
		}
		
		for(i=0;i<m;i++) // Setting the first element of the i'th row and j'th column to zero if a[i][j] == 0
		{
			for(j=0;j<n;j++)
			{
				if(a[i][j]==0)
				{
					a[i][0]=0;
					a[0][j]=0;
				}
			}
		}
		for(i=0;i<m;i++) { // Setting the entire row to zero 
			if(a[i][0] == 0)
			{
				for(j=0;j<n;j++)
					a[i][j]=0;
			}
		}
		for(j=0;j<n;j++) // Setting the entire column to zero
		{
			if(a[0][j]==0)
			{
				for(i=0;i<m;i++)
					a[i][j]=0;
				}
		}
		if(flag1==false)
		{
			for(i=0;i<m;i++)
			{
				a[i][0]=0;
			}
		}
		if(flag2==false)
		{
			for(i=0;i<n;i++)
			{
				a[0][i]=0;
			}
		}
		System.out.println();
		for(i=0;i<m;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
