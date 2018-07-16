//Write a java program to combine to two LinkedLists such that first take the first element of list A and then take the last element
// of list B. 
// Inputs : List A = {1,2,3}
//          List B = {4,5,6}
// Output : { 1,6,2,5,3,4 }

import java.util.Scanner;
public class question1 {
	public linkedlist l1 = new linkedlist();
	public linkedlist l2 = new linkedlist();
	private void merge()
	{
		linkedlist l3 = new linkedlist();
		int counter_l1 =  1;
		int counter_l2 = this.l2.counter;
		while((counter_l1 <= l1.counter)&&(counter_l2 > 0))
		{
			l3.insert(this.l1.getElement(counter_l1));//Inserting first element of list A
			l3.insert(this.l2.getElement(counter_l2));//Inserting last element of the list B
			counter_l1++;
			counter_l2--;
		}
		l3.print();		
	}
	private void user_interface()
	{
		this.l1 =  new linkedlist();
		this.l2 =  new linkedlist();
		int x =1;
		while(x==1)
		{
			System.out.println("Select the option:\n 1)Enter the data\n 2)Delete the data\n 3)Print the data\n 4)Merge the list\n User Choice:");
			Scanner scan1 =  new Scanner(System.in);
			int user_input = scan1.nextInt();
			switch(user_input)
			{
			case 1:
				System.out.println("Enter the list number");
				Scanner scan2 = new Scanner(System.in);
				if(scan2.nextInt() ==1)
				{
					System.out.println("Enter the data");
					Scanner scan3 = new Scanner(System.in);
					l1.insert(scan3.nextInt());
				}
				else
				{
					System.out.println("Enter the data");
					Scanner scan3 = new Scanner(System.in);
					l2.insert(scan3.nextInt());
				}
				break;
			case 2:
				System.out.println("Enter the list number");
				Scanner scan4 = new Scanner(System.in);
				if(scan4.nextInt() == 1)
				{
					System.out.println("Enter the data");
					Scanner scan3 = new Scanner(System.in);
					l1.delete(scan3.nextInt());					
				}
				else
				{
					System.out.println("Enter the data");
					Scanner scan3 = new Scanner(System.in);
					l2.delete(scan3.nextInt());
				}
				break;
			case 3:
				System.out.println("Enter the list number");
				Scanner scan5 = new Scanner(System.in);
				if(scan5.nextInt() ==1)
				{
					l1.print();
				}
				else
				{
					l2.print();
				}
				break;
			case 4:
				merge();
				break;
			}
			System.out.println("Do you want to continue?(yes ==1)");
			Scanner scan3 =  new Scanner(System.in);
			x =  scan3.nextInt();
		}
	}
	public static void main(String args[])
	{
		question1 m = new question1();
		m.user_interface();
	}
}
