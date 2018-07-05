// Implement an algorithm to find the k'th element of a singlylinked list
import java.util.Scanner;

public class question2 {
	public snodes head = new snodes();
	public boolean init = false;
	public int counter;
	
	public void insert(int data)
	{
		if(init == false)
		{
			System.out.println("The list is not initializing\n");
			snodes temp = new snodes();
			temp.data = data;
			head = temp;
			init = true; counter++;
		}
		else if(init == true)
		{
			snodes temp = new snodes();
			snodes temp1 = new snodes();
			temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp1.data = data;
			temp.next = temp1;
			counter++;
		}
	}
	public void print()
	{
		snodes temp = new snodes();
		temp = head;
		System.out.println("The list is :");
		while(temp!=null)
		{
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
		
		return;
	}
	public boolean delete(int data)
	{
		snodes temp = new snodes();
		snodes temp2 = new snodes();
		boolean flag = false;
		if(head.data == data)
		{
			if(head.next!=null) {
			head = head.next;
			System.out.println("Old head removed\n");
			counter--;
			flag = true;
			return(flag);
			}
			else
			{
				head = null;
				System.out.println("List Deleted\n");
				flag = true;
				counter--;
				return(flag);
			}
		}
		temp = head;
		while(temp.next !=null)
		{
			temp2 = temp.next;
			
			if((temp2.next == null) && (temp2.data == data))
			{
				temp.next = null;
				counter--;
				System.out.println("Last element deleted\n");
				flag = true;
				break;
			}
			else if((temp2.next != null)&&(temp2.data == data))
			{
				temp.next = temp2.next;
				counter--;
				flag = true;
			}
			temp = temp.next;			
		}		
		return(flag);
	}
	
	public void element(int data) // Printing the list from k'th to the last element
	{
		int j, i;
		snodes temp = new snodes();
		j = (counter)-(data)+(1);
		System.out.println("Position from front = "+j+"\n");
		temp = head;
		for(i=1;i<=counter;i++)
		{
						
			if((i>=j)&&(temp!=null))
			{
				System.out.print(temp.data+" ");
			}
			temp = temp.next;
		}
		System.out.println();
		
	}
	public void user_interface()
	{
		int x=1, user_input,data;
		while(x == 1) {
		System.out.println("Enter the choice:\n1)Insert the data\n2) Print\n3) Delete\n4) Which Element from reverse\nEnter the choice:");
		Scanner scan1 = new Scanner(System.in);
		user_input = scan1.nextInt();
		if(user_input == 1)
		{
			System.out.println("Enter the data: ");
			Scanner scan2 = new Scanner(System.in);
			insert(scan2.nextInt());
			System.out.println("The number of elements are : " + counter + "\n");
		}
		else if(user_input == 2)
		{
			print();
			System.out.println("The number of elements are : " + counter + "\n");
					}
		else if(user_input == 3)
		{
			System.out.println("Enter the data");
			Scanner scan3 = new Scanner(System.in);
			if(delete(scan3.nextInt()) == true )
			{
				System.out.println("Deletion Done\n");	
				System.out.println("The number of elements are : " + counter + "\n");
			}
			else
			{
				System.out.println("Number does not exist\n");
				System.out.println("The number of elements are : " + counter + "\n");
			}
		}
		else if(user_input == 4)
		{
			System.out.println("Enter the position from reverse ");
			Scanner scan4 = new Scanner(System.in);
			data = scan4.nextInt();
			if(data<= counter)
			{
			element(data);
			}
			else
			{
				System.out.println("Out of Range\n");
				return;
			}
			
		}
			
		}
		System.out.println("Do you want to continue ? (1==Y)");
		Scanner scan4 = new Scanner(System.in);
		x= scan4.nextInt();
		}
	
	public static void main(String args[])
	{
		question2 m = new question2();
		m.user_interface();
	}
}
