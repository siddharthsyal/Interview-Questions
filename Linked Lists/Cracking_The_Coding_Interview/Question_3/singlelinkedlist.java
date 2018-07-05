import java.util.Scanner;

public class question3 extends singlelinkedlist {
	
	public boolean delete(int data)
	{
		
		snodes temp = new snodes();
		snodes temp1 = new snodes();
		temp = head;
		while (temp!=null)
		{
			if(temp.data == data)
			{
				temp1 = temp;
				temp.data = temp1.next.data;
				temp.next = temp1.next.next;
				super.init = true;
				super.counter--;
				super.print();
				return(init);
			}
			temp = temp.next;
		}		
		return init;
	}
	
	public void user_interface()
	{
		int x=1, user_input,data;
		while(x == 1) {
		System.out.println("Enter the choice:\n1)Insert the data\n2) Print\n3) Delete\nEnter the choice:");
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
		}
		System.out.println("Do you want to continue ? (1==Y)");
		Scanner scan4 = new Scanner(System.in);
		x= scan4.nextInt();
		}
	
	public static void main(String args[])
	{
		question3 m = new question3();
		m.user_interface();
	}
}
