// Given a circular linked list, implement an algorithm that returns the node at the beginning of the loop.
// Example: Input - A -> B -> C -> D -> E -> C [Same C as earlier one]
//          Output : C
import java.util.Scanner;

public class question8 extends singlelinkedlist {
	
	public void circular()
	{
		snodes temp = new snodes();
		snodes temp1 = new snodes();
		temp = super.head;
		while(temp.next !=null)
		{
			temp = temp.next;
		}
		temp1 = super.head;
		for(int i=0;i<(super.counter)/2;i++)
		{
			System.out.println(temp1.data);
			temp1= temp1.next;
		}
		temp.next = temp1;
		return;
	}
	public void check()
	{
		snodes temp = new snodes();
		snodes temp1 = new snodes();	
		temp1 = super.head;
		while(true)
		{
			
			temp = temp1.next;
			int counter = super.counter;
			while(temp1 != temp && counter>0) // Finding common node in the linked list
			{
				if(temp1 == temp.next)
				{
					System.out.println("The node is :"+temp1.data);
					return;
				}
				counter--;
				temp = temp.next;
			}
			temp1 = temp1.next;
		}
	}
	
	public void user_interface()
	{
		int x, user_input, data;
		x=1;
		while (x==1)
		{
			System.out.println("1)Insert the data\n2)Print\n3)Delete the data\n4)Circular list\n5)Find the node\n6)Number of nodes\n  Enter the choice:");
			Scanner scan1 = new Scanner(System.in);
			user_input = scan1.nextInt();
			if(user_input == 1)
			{
				System.out.println("Enter the data to be inserted :");
				Scanner scan2 =new Scanner(System.in);
				data = scan2.nextInt();
				super.insert(data);
			}
			else if(user_input == 2)
			{
				System.out.println("The list is:\n");
				super.print();
			}
			else if(user_input == 3)
			{
				System.out.println("Enter the data to deleted :");
				Scanner scan2 = new Scanner(System.in);
				data = scan2.nextInt();
				super.delete(data);
			}
			else if(user_input == 4)
			{
				this.circular();
			}
			else if(user_input == 5)
			{
				this.check();
			}
			else if(user_input == 6)
			{
				System.out.println(super.counter);
			}
			System.out.println("Do you want to continue?(1==y)");
			Scanner scan3 = new Scanner(System.in);
			x = scan3.nextInt();
		}
	}
	
	public static void main(String args[])
	{
		question8 m = new question8();
		m.user_interface();
	}
}
