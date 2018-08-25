//You have an integer matrix representing a plot of land, where the value at that location represents the height above the sea level.
//A value of zero indicates water. A pond is the region of water connected vertically, horizontally or diagonally. The size of the pond
//is the total number of connected water cells. Write a method to compute the size of all ponds in the matrix. 
//Input : 0 2 1 0
//        0 1 0 1
//        1 1 0 1
//        0 1 0 1
//Output : 2, 4, 1

import java.util.Scanner;
class matrix {
	int data;
	boolean visited = false;
}
public class question19 {
	matrix[][] m =  new matrix[0][0];
	public int sum =0;
	public void checkPond(int length,int i,int j)
	{
		if(this.m[i][j].visited==false)
		{
			this.m[i][j].visited = true;
			if(this.m[i][j].data == 0)
			{
				this.sum++;
				if(i+1<length)
					checkPond(length,i+1,j);
				
				if(i-1>=0)
					checkPond(length,i-1,j);
				
				if(j+1<length)
					checkPond( length,i,j+1);
				
				if(j-1>=0)
					checkPond(length,i,j-1);
				
				if(j-1>=0 && i-1>=0)
					checkPond(length,i-1,j-1);
				
				if(i-1>=0 && j+1<length)
					checkPond(length,i-1,j+1);
				
				if(i+1<length && j-1>=0)
					checkPond(length,i+1,j-1);
				
				if(i+1<length && j+1<length)
					checkPond(length,i+1,j+1);
				return;
			}
			return;
		}
		return;
	}
	public void numOfPonds(int length)
	{
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				this.sum=0;
				if(this.m[i][j].visited == false)
					checkPond(length,i,j);
				if(this.sum>0)
					System.out.println(this.sum);
			}			
		}
		return;
	}
	public void user_interface()
	{
		int length=0;
		System.out.println("Enter the length of the matrix");
		Scanner scan1 = new Scanner(System.in);
		length = scan1.nextInt();
		this.m = new matrix[length][length];
		System.out.println("Enter the elements");
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<length;j++)
			{
				this.m[i][j] = new matrix();
				Scanner scan2 = new Scanner(System.in);
				int data = scan2.nextInt();
				this.m[i][j].data = data;
			}
		}
		numOfPonds(length);
		return;
	}
	
	public static void main(String args[])
	{
		question19 m = new question19();
		m.user_interface();
	}
}
