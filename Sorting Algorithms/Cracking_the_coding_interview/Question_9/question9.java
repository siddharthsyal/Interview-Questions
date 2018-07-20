//Given M x N matrix in which each row and each column is sorted in ascending order
//Write a method to find an element. 
//Sample Matrix : 15 20 40 85
//                20 35 80 95
//                30 55 95 105
//                40 80 100 120

import java.util.Scanner;

public class question9 {
	private int row =0, column =0;
	private int[][] matrix = new int[row][column];
	private int target =0;
	private boolean flag = false;
	
	private void binarySearch(int i)
	{
		int min =0, max =  this.column-1, mid=0;
		while(min<=max)
		{
			mid = (min+max)/2;
			if(this.matrix[i][mid]==this.target)
			{
				System.out.println(+i +" " +mid);
				this.flag = true;
				return;
			}
			else if(this.target<this.matrix[i][mid])
			{
				max = mid-1;
			}
			else if(this.target>this.matrix[i][mid])
			{
				min = mid+1;
			}
		}
		return;
	}

	private void user_interface()
	{
		int i, j;
		System.out.println("Enter the number of rows for the matrix");
		Scanner scan1 = new Scanner(System.in);
		this.row =  scan1.nextInt();
		System.out.println("Enter the number of columns for the matrix");
		Scanner scan2 = new Scanner(System.in);
		this.column = scan2.nextInt();
		this.matrix = new int[this.row][this.column];		
		System.out.println("Enter the elements for the matrix");
		for(i=0;i<this.row;i++)
		{
			for(j=0;j<this.column;j++)
			{
				Scanner scan3 = new Scanner(System.in);
				this.matrix[i][j]=  scan3.nextInt();
			}
		}
		System.out.println("Enter the target");
		Scanner scan3 = new Scanner(System.in);
		this.target = scan3.nextInt();
		for(i=0;i<this.row;i++)
		{
			if((this.matrix[i][0]<= this.target)&&(this.target<= this.matrix[i][this.column-1]))//Since the Matrix is sorted, this 'IF' condition helps in reducing the time complexity 
			{
				binarySearch(i);
				if(flag == true)
				{
					break;
				}
			}
			
		}
	}
	
	public static void main(String args[])
	{
		question9 m = new question9();
		m.user_interface();
	}
}
