//Implement a function to check if a linkedlist is a palindrome.

import java.util.Scanner;
public class question6 extends singlelinkedlist {
	public int ctr =0;
	snodes temp1 = new snodes();
	boolean flag =true;
	public void palindrome(snodes temp)
	{
		if(temp.next!=null) // Recursivly calling  till the end node.
		{
			palindrome(temp.next);
		}
		if(counter%2==0) // Checking for palindrome length
		{
			if((counter/2)-ctr != 0)
			{
				ctr++;
				if(temp1.data == temp.data&& flag == true)
				{
					temp1=temp1.next;
				}
				else if(temp1.data != temp.data)
				{
					System.out.println("Not plaindrome");
					flag = false;
					return;
				}
			}
			else if((counter/2)-ctr == 0)
			{
				return;
			}
			}
		else
		{
			if(((counter+1)/2-ctr !=1))
			{
				ctr++;
				if(temp1.data == temp.data&& flag == true)
				{
					temp1=temp1.next;
				}
				else
				{
					System.out.println("Not plaindrome");
					flag = false;
					return;
				}
			}
			else if(((counter+1)/2-ctr ==1))
				return;
		}
	}
	public static void main(String args[])
	{
		question6 m = new question6();
		m.user_interface();
	}
	public void user_interface()
	{
		int x,user_input, data ;
		x=1;
		while(x==1)
		{
			System.out.println("1) Insert the data\n2) Delete the data \n3) Print the data\n4) Palindrome Check \nEnter the choice: ");
			Scanner scan1 = new Scanner(System.in);
			data = scan1.nextInt();
			if(data==1)
			{
				System.out.println("Enter the data");
				Scanner scan2 = new Scanner(System.in);
				super.insert(scan2.nextInt());
			}
			else if(data==2)
			{
				System.out.println("Enter the data");
				Scanner scan2 = new Scanner(System.in);
				boolean delete = super.delete(scan2.nextInt());
			}
			else if(data == 3)
			{
				super.print();
			}
			else if(data==4)
			{
				temp1=head;
				palindrome(head);
			}
			
		}
	}
}
