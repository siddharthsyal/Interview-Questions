//Imagine you are reading in a stream of integers, periodically, you wish to be able to look up the rank of a number X
//Implement a data structure and algorithm to support this need. That is, implement a method track(int x) to insert the number
//and a method getRank() to get the rank of the number. Here rank is the nummber of values less than the number.
//Example : Stream of numbers : 5,1,4,9,7,13,3
//          getRank(5) : 3 

import java.util.Scanner;

class node{//Tree data structure offers insertion with O(log n) and in this case insertion is done dynamically. 
	int data =0;
	node left = null;
	node right = null;
	int rank =0;
}

public class question10 {
	private boolean init = false;
	private node root = new node();
	private int rank=0;
	private void track(int data)
	{
		int rank =0;
		if(this.init == false)
		{
			this.root.data = data;
			this.init = true;
			this.rank =0;
			updateRank(this.root);
		}
		else
		{
			node temp = new node();
			temp = root;
			while(true)
			{
				if(data<temp.data)
				{
					if(temp.left == null)
					{
						node temp1 = new node();
						temp1.data = data;
						temp.left = temp1;
						this.rank = -1;
						updateRank(this.root);//Updates the rank after adding any element to the tree
						return;
					}
					else
					{
						temp=temp.left;
						continue;
					}
				}
				else if(data>temp.data)
				{
					if(temp.right == null)
					{
						node temp1 = new node();
						temp1.data = data;
						temp.right= temp1;
						this.rank = -1;
						updateRank(this.root);
						return;								
					}
					else
					{
						temp = temp.right;
						continue;
					}
				}
				else //Not adding duplicate content in the tree
				{
					System.out.println("Duplicate Content");
					return;
				}
			}
		}
		return;
	}
	private void updateRank(node temp)//Updates ranks of the nodes in the tree
	{
		if(temp == null)
			return;
		else {
		updateRank(temp.left);
		this.rank++;
		temp.rank = this.rank;
		updateRank(temp.right);
		}
		return;
	}
	
	private void getRank(int data)
	{
		node temp = new node();
		temp =  this.root;
		while(true)
		{
			if(data == temp.data)
			{
				System.out.println("Rank is "+temp.rank);
				return;
			}
			else if(temp.data > data)
			{
				temp = temp.left;
				if(temp == null)
				{
					System.out.println("Number not present");
					return;
				}
				else
					continue;
			}
			else if(data > temp.data)
			{
				temp = temp.right;
				if(temp == null)
				{
					System.out.println("Number not present");
					return;
				}
				else
					continue;
			}
		}
	}
	private void user_interface()
	{
		int x =1, user_input =0, data=0;
		while(x==1)
		{
			System.out.println("Enter the choice\n1)Enter the data\n2)Get Rank\nEnter choice : ");
			Scanner scan1 = new Scanner(System.in);
			user_input = scan1.nextInt();
			switch(user_input)
			{
			case 1:
				System.out.println("Enter the data for the stream");
				Scanner scan2 = new Scanner(System.in);
				data = scan2.nextInt();
				track(data);
				break;
			case 2 :
				System.out.println("Enter the data for rank");
				Scanner scan3 =  new Scanner(System.in);
				data = scan3.nextInt();
				getRank(data);
				break;
			}	
			System.out.println("Do you want to continue?(y=1)");
			Scanner scan2 = new Scanner(System.in);
			x = scan2.nextInt();
		}
	}
	public static void main(String args[])
	{
		question10 m = new question10();
		m.user_interface();
	}
}
