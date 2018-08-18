//Implement LRU Cache

import java.util.Scanner;
import java.util.HashMap;
public class question25 {

	doublyLinkedList cache = new doublyLinkedList();
	public int current=1, size=0;
	HashMap<Integer, doublynodes> map = new HashMap<Integer, doublynodes>();
	public void print()
	{
		doublynodes nodes = new doublynodes();
		nodes =  this.cache.head;
		while(nodes.forward!=null)
		{
			System.out.print(nodes.data+" ");
			nodes = nodes.forward;
		}
		System.out.println();
		return;
	}
	public void lastDelete()
	{
		System.out.println("Deleting least recently used data");
		doublynodes node = new doublynodes();
		if(this.current==0)
		{
			System.out.println("List is already empty");
			return;
		}
		node =  this.cache.head;
		while(node.forward!=null)
		{
			node =  node.forward;
		}
		this.map.remove(node.data);
		if(--this.current<=0)
			this.current=0;
		node = node.back;
		node.forward=null;
		return;		
	}
	public void delete()
	{
		System.out.println("Enter the data that you want to delete");
		Scanner scan1 = new Scanner (System.in);
		int data = scan1.nextInt();
		if(this.map.containsKey(data))
		{
			this.cache.delete(this.map.get(data));
			this.map.remove(data);
			if(--this.current<=0)
				this.current=0;
		}
		else
		{
			System.out.println("Data not present");
		}
		return;
	}
	public void addData()
	{
		System.out.println("Enter the data that you want to add");
		Scanner scan1 = new Scanner(System.in);
		int data = scan1.nextInt();
		if(map.containsKey(data))
		{
			System.out.println("Already there");
			this.cache.delete(this.map.get(data));
			this.map.remove(data);
			this.map.put(data,this.cache.insert(data));				
		}
		else
		{
			if(this.current<=this.size)
			{
				this.map.put(data,this.cache.insert(data));
				this.current++;
			}
			else
			{
				System.out.println("Out of space, do you want to remove the data");
				Scanner scan2 = new Scanner (System.in);
				int data1 = scan1.nextInt();
				if(data1 ==1)
				{
					lastDelete();
					addData();
				}
			}
		}
		return;
	}
	public void user_interface()
	{
		int x=1;
		this.size=5;
		cache = new doublyLinkedList();
		while(x==1)
		{
			System.out.println("Select from options\n1)Insert\n2)Delete\n3)Print\nChoice: ");
			Scanner scan1 = new Scanner(System.in);
			int choice = scan1.nextInt();
			if(choice ==1)
			{
				addData();
			}
			else if(choice ==2)
			{
				delete();
			}
			else if(choice ==3)
			{
				print();
			}
			System.out.println("Do you want to continue?");
			Scanner scan2 = new Scanner(System.in);
			x= scan2.nextInt();		
		}		
	}
	public static void main(String args[])
	{
		question25 m = new question25();
		m.user_interface();
	}	
}
