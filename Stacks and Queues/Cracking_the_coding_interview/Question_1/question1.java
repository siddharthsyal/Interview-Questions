// Implement three stacks using a single array

import java.util.Scanner;

public class question1 {
	int[] a = new int[20];
	boolean stack1 = false;
	boolean stack2 = false;
	boolean stack3 = false;
	int top1 = 0;
	int top2 = 1;
	int top3 = 2;
	
	private void insert(int data, int list)
	{
		if( list == 1)
		{
			if(stack1 ==false)
			{
				System.out.println("You entered the first data into the stack 1");
				a[top1] = data;
				stack1 = true;
			}
			else if(stack1 == true)
			{
				if((top1+3)<20)
				{
					top1 = top1+3;
					a[top1] = data;
					System.out.println("Data stored in stack 1");
				}
				else 
				{
					System.out.println("Out of bounds");
					return;
				}
			}
		}
		else if(list ==2)
		{
			if(stack2 == false)
				{
					System.out.println("You entered the first data into the stack 2");
					a[top2] = data;
					stack2 = true;
				}
				else if(stack2 == true)
				{
					if((top2+3)<20)
					{
						top2 = top2+3;
						a[top2] = data;
						System.out.println("Data stored in stack 2");
					}
					else 
					{
						System.out.println("Out of bounds");
						return;
					}
				}
		}
		else if (list ==3)
		{
			if(stack3 == false)
			{
				System.out.println("You entered the first data into the stack 3");
				a[top3] = data;
				stack3 = true;
			}
			else if(stack3 == true)
			{
				if((top3+3)<20)
				{
					top3 = top3+3;
					a[top3] = data;
					System.out.println("Data stored in stack 3");
				}
				else 
				{
					System.out.println("Out of bounds");
					return;
				}
			}
		}

	}

	private void delete(int list)
	{
		if(list == 1)
		{
			if(stack1 == true)
			{
				if(top1==0)
				{
					a[top1]= 0;
					stack1 = false;
					return;
				}
				else
				{
					a[top1]=0;
					top1=top1-3;
					return;
				}
			}
		}
		else if(list == 2)
		{
			if(stack2 == true)
			{
				if(top2==1)
				{
					a[top2]= 1;
					stack2 = false;
					return;
				}
				else
				{
					a[top2]=1;
					top2=top2-3;
					return;
				}
			}
		}
		else if(list == 3)
		{
			if(stack3 == true)
			{
				if(top3==2)
				{
					a[top3]= 2;
					stack3 = false;
					return;
				}
				else
				{
					a[top3]=2;
					top3=top3-3;
					return;
				}
			}
		}
	}
	private void top(int list)
	{
		if(list == 1 && stack1 ==true)
		{
			System.out.println(a[top1]);
			return;
		}
		else if(list ==2 && stack2 == true)
		{
			System.out.println(a[top2]);
			return;
		}
		else if(list ==3 && stack3 == true)
		{
			System.out.println(a[top3]);
			return;
		}
		
		
	}
	public void user_interface()
	{
		int user_input, list, data,x =1;
		while(x==1)
		{
			System.out.println("1)Push\n2)Top of the stack\n3)Pop\n  Choice:\n");
			Scanner scan1 = new Scanner(System.in);
			user_input = scan1.nextInt();
			System.out.println("Enter the Stack number: ");
			Scanner scan2 = new Scanner(System.in);
			list = scan2.nextInt();
			if(user_input == 1)
			{
				System.out.println("Enter the data to be pushed : ");
				Scanner scan3 = new Scanner(System.in);
				data = scan3.nextInt();
				insert(data,list);
			}
			else if(user_input == 2)
			{
				top(list);
			}
			else if(user_input ==3)
			{
				delete(list);
			}
			System.out.println("Do you want to continue?(y==1");
			Scanner scan4 = new Scanner(System.in);
			x= scan4.nextInt();
			
		}
	}
	
	public static void main(String args[])
	{
		question1 m = new question1();
		m.user_interface();
	}
}
