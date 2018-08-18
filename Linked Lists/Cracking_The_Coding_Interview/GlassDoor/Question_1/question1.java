//Reverse a linked list
import java.util.Scanner;
public class reverselinkedlist extends linkedlist {

	nodes node1 =  new nodes();
	public nodes reverseLL(nodes current, nodes prev)
	{
		if(current.next == null)
		{
			this.head = current;
			this.head.next = prev;
			return (this.head);
		}
		else
		{
			node1 = current.next;
			current.next = prev;
			reverseLL(node1,current);
			return (this.head);
		}
	}
	public void user_interface()
	{
		int x=1;
		while(x==1)
		{
			System.out.println("Do you want to add data");
			Scanner scan1 = new Scanner(System.in);
			int data = scan1.nextInt();
			this.insert(data);
			System.out.println("Do  you want to continue?");
			Scanner scan2 = new Scanner(System.in);
			x = scan2.nextInt();
		}
		this.print(this.head);
		this.print(reverseLL(this.head,null));
		return;		
	}
	public static void main(String args[])
	{
		reverselinkedlist m = new reverselinkedlist();
		m.user_interface();
	}
}
