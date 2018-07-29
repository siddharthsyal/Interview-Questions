//An animal shelter, which holds only dogs & cats, operates on a strictly "first in, first out" basis. People must adopt either the
//"oldest" (based on the arrival time) of all the animals at the shelter, or they can select whether they would prefer a dog or a cat
//and would get the oldest animal of that type. They cannot select which specific animal they would like.
//Create the data structure to maintain this system & implement operations such as a enqueue,dequeueAny, dequeueCat, dequeueDog

import java.util.Scanner;
import java.util.Arrays;

class node1{
	public String type = null;
	public node1 next = null;
}
public class question6 {
	public node1 head = new node1();
	public int[] counter = new int[2];
	public boolean init = false;

	public void insert(String data) {
		if(init == false)
		{
			head.type = data;
			init =  true;
			return;
		}
		else if(init == true)
		{
			node1 temp = new node1();
			temp.type =  data;
			temp.next = head;
			head = temp;
			init = true;
			return;				
		}
	}
	
	public void peek() {
		node1 temp = new node1();
		temp = head;
		while(temp.next != null)
		{
			System.out.println(temp.type);
			temp = temp.next;
			
		}
		System.out.println(temp.type);
		return;
	}
	
	public void dog_pop() {
		int j = this.counter[0];
		node1 temp =  new node1();
		temp =  this.head;
		while(temp.next != null)
		{
				if(temp.next.type.equals("dog") && j ==1)
				{
					System.out.println(temp.next.type +" removed");
					temp.next = temp.next.next;
					this.counter[0]--;
					return;
				}
				else if(temp.type.equals("dog"))
					j--;
		}
	}
	
	public void cat_pop() {
		int j = this.counter[1];
		String S ="cat";
		node1 temp =  new node1();
		temp = this.head;
		while(temp.next != null)
		{
				if(temp.next.type.equals(S) && (j == 1))
				{
					System.out.println(temp.next.type +" removed");
					temp.next = temp.next.next;
					this.counter[1] --;					
					return;
				}
				else if(temp.type.equals(S))
						j--;
		}
	}
	public void pop()
	{
		
		node1 temp =  new node1();
		temp = head;
		while(temp.next.next != null)
			temp = temp.next;
		if(temp.next.type.equals("dog"))
		{
			System.out.println(temp.next.type +" removed");
			counter[0]--;
		}
		else if(temp.next.type.equals("cat"))
		{
			System.out.println(temp.next.type +" removed");
			counter[1]--;
		}
		temp.next = null;
		return;
	}
	public void user_interface() {
		int x =1, user_input;
		Arrays.fill(counter, 0);
		String type = null;
		while(x ==1)
		{
			System.out.println("1)Enter the animal 1= dog 2=cat\n2)Get a dog\n3)Get a cat\n4)Get any\n5)Top\n  Enter the choice:");
			Scanner scan1 = new Scanner(System.in);
			user_input =scan1.nextInt();
			if(user_input ==1)
			{
				System.out.println("Enter the type of animal");
				Scanner scan2 = new Scanner(System.in);
				int num = scan2.nextInt();
				if(num ==1)
				{
					type = "dog";
					this.counter[0]= this.counter[0]+1;
				}
				else if(num ==2)
				{
					type ="cat";
					this.counter[1]= this.counter[1]+1;
				}
				insert(type);
			}
			else if(user_input ==2)
			{
				dog_pop();
			}
			else if(user_input ==3)
			{
				cat_pop();
			}
			else if(user_input == 4)
			{
				pop();
			}
			else if(user_input ==5)
			{
				peek();
			}
			System.out.println("Do you want to continue?(y==1)");
			Scanner scan3 = new Scanner(System.in);
			x = scan3.nextInt();
		}
	}
	public static void main(String args[])
	{
		question6 m =  new question6();
		m.user_interface();
	}
}
