//Design an algorithm to check if someone has won the game of tic-tac-toe
//Note : Algorithm below works for 3 x 3 board only

import java.util.Scanner;
import java.util.Arrays;

public class question4 {
	
	private int checkDiagonals(int[][] board, int content)
	{
		boolean win = false;
		for(int i =0;i<3;i++)
		{
			int j=i;
			if(board[i][j] == content)
			{
				win = true;
				continue;
			}
			else
			{
				win = false;
				break;
			}
		}
		if(win == false)
			return 0;
		else  
		{
			System.out.print(" Player" +content+" Wins");
			return 1;
		}
		
	}
	
	private int checkRows(int[][] board, int content, int y)
	{
		boolean win = false;
		for(int i =0;i<3;i++)
		{
			if(board[i][y] == content)
			{
				win = true;
				continue;
			}
			else
			{
				win = false;
				break;
			}
		}
		if(win)
		{
			System.out.println("Player "+content+" Winner");
			return 1;
		}
		else
			return 0;
	}
	private int checkColumns(int[][] board, int content, int x)
	{
		boolean win = false;
		for(int i =0;i<3;i++)
		{
			if(board[x][i] == content)
			{
				win = true;
				continue;
			}
			else
			{
				win = false;
				break;
			}
		}
		if(win)
		{
			System.out.println("Player "+content+" Winner");
			return 1;
		}
		else
			return 0;
	}
	
	private int check(int[][] board, int x , int y,int content)
	{//Checking the coordinates to determine which row,column  & diagonal to check.
         //Checking rows, columns & diagonal related to a particular coordinate ONLY			
		if((x==y)||(y==(2-x)))
		{
			if(checkDiagonals(board,content) == 1)
				return 1;
		}
		int r1 = checkRows(board, content,y);
		if(r1 == 1)
			return 1;
		int r2 = checkColumns(board, content, x);
		if(r2 ==1)
			return 1;
		return 0;
	}

	private void user_interface() {
		boolean win = false;
		int[][] board = new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				board[i][j] =0;
		}
		
		int counter = 9,data =1;
		while(counter>0)
		{
			if(data == 1)
			{
				System.out.println("Player 1");
				System.out.println("Enter X coordinates");
				Scanner scan2 = new Scanner(System.in);
				int x = scan2.nextInt();
				System.out.println("Enter Y coordinates");
				Scanner scan3 = new Scanner(System.in);
				int y = scan3.nextInt();
				if(board[x][y] == 0)
				{
					board[x][y] = 1;
					int content = 1;
					int r1 =check(board,x,y,content);//After each move checking if anyone has won
					if(r1 ==1)
					{
						win = true;
						break;
					}
				}
				else
					System.out.println("Not valid");
				data =2;
			}
			else if(data == 2)
			{
				System.out.println("Player 2");
				System.out.println("Enter X coordinates");
				Scanner scan2 = new Scanner(System.in);
				int x = scan2.nextInt();
				System.out.println("Enter Y coordinates");
				Scanner scan3 = new Scanner(System.in);
				int y = scan3.nextInt();
				if(board[x][y] == 0)
				{
					board[x][y] = 2;
					int content =2;
					int r2 = check(board,x,y,content);
					if(r2 == 1)
					{
						win = true;
						break;
					}
				}
				else
					System.out.println("Not valid");		
				data =1;
			}
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
					System.out.print(board[i][j]+" ");
				System.out.println();
			}
			counter--;
		}
		if(!win)
		{
			System.out.println("Looks like no-one won");
		}
	}
	public static void main(String[] args) {
		question4 m = new question4();
		m.user_interface();
	}
}
