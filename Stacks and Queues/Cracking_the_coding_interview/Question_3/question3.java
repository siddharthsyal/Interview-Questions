//Imagine a (literal) stack of plaes. If stack gets too high, it may topple. Therefore, in real life, we would likely start with
//a new stack when the previous stack exceeds some threshold. Implement a data structure "SetOFStacks" that mimics this.
//SetOfStacks should be composed of several stacks and should create a new stack once the previous one exceeds the capacity.
//SetOfStacks.push() and SetOfStacks.poop() should behave identically to a single stack.

import java.util.Scanner;
import java.util.Arrays;

class node
{
	public int data = 0;
	public node next = null;
}

public class question3 
{	
	public node[] head = new node[3];
	public node[] base = new node[2];
	public int[] counter = new int[3];
	public int i;
	public boolean init[] = new boolean[3];
	public void insert(int data)
	{
		
		if(this.init[this.i] == false)// Checking if a particular stack  is initialized.
		{
			this.head[this.i].data = data;			
			this.init[this.i] = true;
			System.out.println("Stack "+(this.i+1)+" initialized");
			return;
			
		}
		else if(this.init[this.i] == true)
		{
			node temp = new node();
			temp.data = data;
			temp.next = this.head[this.i];
			if(this.counter[this.i] >= 3)// if counter goes beyond 3, create a new stack
			{
				this.i = this.i+1;
				this.head[this.i].data = data;
				this.base[i-1] = head[i];
				this.init[this.i] = true;
				System.out.println("Stack "+(this.i+1)+" initialized");
				return;
			}
			else if(this.counter[this.i] < 3)//If counter is less than 3, adding to current stack
			{
				this.counter[this.i]= this.counter[this.i] + 1;
				this.head[this.i] = temp;
				return;
			}
		}		
	}
	public void pop()
	{
		if(this.counter[this.i] == 0)//Checking if the popped element would be the last one
		{
			if(this.i==0)
			{
				if(this.head[this.i].next == null)//Emptying all stacks.
				{
					this.head[this.i] = null;
					this.counter[this.i]=0;
					System.out.println("Whole stack empty");
					this.init[this.i] = false;
				}
			}
			else//Popping the element from the last stack
			{
					this.head[this.i] = null;
					this.counter [this.i] = 0;
					this.init[this.i] = false;
					this.i--;
			}
			
			return;
		}
		else if(this.counter[this.i] > 0)//A normal pop operation
		{
			this.head[this.i] = this.head[this.i].next;
			this.counter[this.i]--;	
			return;
		}
		
	}
	public void top()
	{
		System.out.println(this.head[this.i].data);
	}
	public void popstack(int number)
	{
			base[number-1] = head[number-1].next;
			System.out.println(head[number-1].data+" popped");
			head[number -1]= head[number -1].next;
			counter[number-1] --;			
	}	
	public void user_interface()
	{
		Arrays.fill(this.init, false);
		Arrays.fill(this.counter, 0);
		this.i = 0;
		int j =0;
		for(j=0;j<3;j++)
		{
			head[j] = new node();
		}
		for(j=0;j<2;j++)
			base[j] = new node();
		int x =1, data, user_input;
		while(x==1)
		{
		System.out.println("1)Push to Stack\n2)Pop from stack\n3)Top of the stack\n4)Pop from selected Stack\n  Enter the choice :");
		Scanner scan1 = new Scanner(System.in);
		user_input = scan1.nextInt();
		if(user_input ==1)
		{
			System.out.println("Enter the data to be pushed :");
			Scanner scan2 = new Scanner(System.in);
			data = scan2.nextInt();
			this.insert(data);
		}
		else if(user_input == 2)
		{
			this.pop();
			System.out.println("Popped from the stack");
		}
		else if(user_input ==3)
		{
			this.top();
		}
		else if(user_input == 4)
		{
			System.out.println("Enter the stack number to pop the data");
			Scanner scan3 = new Scanner(System.in);			popstack(scan3.nextInt());
		}
		System.out.println("Do you want to continue?(y==1)");
		Scanner scan3 = new Scanner(System.in);
		x = scan3.nextInt();
		}		
	}
	public static void main(String args[])
	{
		question3 m = new question3();
		m.user_interface();		
	}		
}
