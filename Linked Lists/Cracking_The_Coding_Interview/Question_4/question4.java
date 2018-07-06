// Write code to partition a linked list around a value X, such that all nodes less than
// X come before all nodes greater tahn or equal to X. If X is contained within the list,
// the values of X only need to be after the elemnets less than X. The partition element X can
// appear anywhere in the "right partition"; it does not need to appear between the left and right partition. 

import java.util.Scanner;

public class question4 extends singlelinkedlist{
	
	public void sort(int data)
	{
		boolean flag = false;
		int i =0,x,ctr =0;
		snodes temp = new snodes();
		snodes temp1 = new snodes();
		for(i =0;i<super.counter;i++)
		{
			flag = false;
			temp = super.head;
			while(temp.next != null)
			{
				temp1 = temp.next;
				if((temp.data>temp1.data)&&(temp.data>=data))
				{
					x = temp.data;
					temp.data = temp1.data;
					temp1.data = x;
					flag = true;
				}
				if(temp.data==data)
				{
					x = temp.data;
					temp.data = temp1.data;
					temp1.data = x;
					flag = true;
				}
				temp = temp.next;
			}
			if(flag == false)
			{
				break;
			}
		}
		super.print();
	}
	
	public void user_interface()
	{
		int x=1, user_input,data;
		while(x == 1) {
		System.out.println("Enter the choice:\n1)Insert the data\n2) Print\n3) Delete\n4) Sorting\nEnter the choice:");
		Scanner scan1 = new Scanner(System.in);
		user_input = scan1.nextInt();
		if(user_input == 1)
		{
			System.out.println("Enter the data: ");
			Scanner scan2 = new Scanner(System.in);
			super.insert(scan2.nextInt());
			System.out.println("The number of elements are : " + counter + "\n");
		}
		else if(user_input == 2)
		{
			super.print();
			System.out.println("The number of elements are : " + counter + "\n");
					}
		else if(user_input == 3)
		{
			System.out.println("Enter the specific node");
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
			System.out.println("Enter the element ");
			Scanner scan4 = new Scanner(System.in);
			data = scan4.nextInt();
			sort(data);			
		}
			
		}
		System.out.println("Do you want to continue ? (1==Y)");
		Scanner scan4 = new Scanner(System.in);
		x= scan4.nextInt();
		}
	
	public static void main(String args[])
	{
		question4 m = new question4();
		m.user_interface();
		
	}
}
