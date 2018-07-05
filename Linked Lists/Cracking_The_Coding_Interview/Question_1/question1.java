// Write code to remove duplicates from an unsorted linked lists.
// Try to solve the problem without any extra buffer.

import java.util.Scanner;

class snode {
	public int data = 0;
	public snode next = null;
	
	public void nodedata() {
		System.out.println(data);
	}
}

public class question1 {
	public snode head;
	
	public void insert_data(int data)
	{
		snode temp = new snode();
		if(head == null)
		{
			System.out.println("List is not started\n");
			return;
		}
		else if(head != null)
		{		
			snode temp1 = new snode();
			temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
				System.out.println("Appending the data now\n");
				temp1.data = data;
				temp.next = temp1;
		}
	}
	
	public void insert_first(int data)
	{
		if(head == null)
		{
		snode temp = new snode();
		System.out.println("The list is not started. Starting now\n");
		temp.data = data;
		head = temp;
		}
		else
		{
			System.out.println("The list is started");
			return;
		}
	}
	public void print()
	{
		snode temp = new snode();
		temp = head;
		while(temp != null)
		{
			temp.nodedata();
			temp = temp.next;
		}
	}
	public void deleting() // For deleting the duplicates in the list.
	{
		snode temp = new snode();
		snode temp2 = new snode();
		snode temp3 = new snode();
		temp = head;
		while ( temp != null)
		{
			temp2 = temp;
			while(temp2 != null)
			{
				temp3 = temp2.next;
				if(temp3 == null)
				{
					break;
				}
				else if( temp.data == temp3.data)
				{
					temp2.next = temp3.next;
				}
				temp2 = temp2.next;
			}
			temp = temp.next;
		}
	}
	public void user_interface()
	{
		int x=1, input,data;
		while( x == 1) {
		System.out.println("Enter the choice:\n1) Start the list\n2) Enter the data\n3) Print the data\n4) Delete Duplicates\nInput:");
		Scanner scan1 = new Scanner(System.in);
		input = scan1.nextInt();
		if(input == 1)
		{
			System.out.println("Enter the data to be inserted ");
			Scanner scan2 = new Scanner(System.in);
			data = scan2.nextInt();
			insert_first(data);
		}
		else if(input == 2)
		{
			System.out.println("Enter the data ");
			Scanner scan3 = new Scanner(System.in);
			data = scan3.nextInt();
			insert_data(data);
		}
		else if(input == 3)
		{
			System.out.println("Printing the list\n");
			print();
		}
		else if(input == 4)
		{
			System.out.println("Deleting duplicates");
			deleting();
			print();
		}
		System.out.println("Do you want to continue? ( 1= y) ");
		Scanner scan4 = new Scanner(System.in);
		x = scan4.nextInt();
		
		}
		
	}
	
	public static void main(String args[])
	{
		question1 m = new question1();
		m.user_interface();
	}
}
