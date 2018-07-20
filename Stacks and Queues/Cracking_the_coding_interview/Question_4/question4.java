//Implement a "Queue" using two stacks.

import java.util.Scanner;
import java.util.Arrays;

public class question4 {
	private snodes[] head = new snodes[2];
	private boolean[] init = new boolean [2];
	public int[] counter = new int [2];
		
	public void insert(int data) {	
		snodes temp = new snodes();
		if(counter[0] < 6 )
		{
			if(init[0]  == false)
			{
				temp.data = data;
				head[0] = temp;
				init[0] = true;
				counter[0]++;
				return;
			}
			else if(init[0] == true)
			{
				temp.data = data;
				temp.next = head[0];
				head[0] =  temp;
				counter[0]++;
				init[0]= true;
			}
		}
		else if(counter[0] == 6)
		{
			if(init[1] == false)
			{
				allpop();
				init[0] = false;
				counter[0] =0;
			}
			System.out.println("Queue is full. Please pop the data");
			return;
		}
	}
	public void allpop() {
		head[1].data = head[0].data;
		head[0] = head[0].next;
		while(head[0] !=null)
		{
			snodes temp = new snodes();
			temp.next = head[1];
			temp.data = head[0].data;
			head[1] = temp;
			head[0] = head[0].next;
		}
		init[1] = true;
		return;
	}
	public void top() {
		System.out.println(head[1].data);
		return;
	}
	public void pop() {
		this.allpop();
		head[1] = head[1].next;
		System.out.println("Data popped");
		if(head[1]== null)
		{
			init[1] = false;
			System.out.println("The queue is completely empty");
		}
		return;
	}
	public void user_interface() {
		int x, data, user_input;
		Arrays.fill(init, false);
		Arrays.fill(counter, 0);
		for(int j =0 ;j<=1;j++)
			head[j] = new snodes();
		x =1; 
		while(x==1)
		{
			System.out.println("1)Enter the data\n2)Pop the data\n3)Top of the queue\n  Enter the choice:");
			Scanner scan1 = new Scanner (System.in);
			user_input = scan1.nextInt();
			if(user_input ==1)
			{
				System.out.println("Enter the data to insert :");
				Scanner scan2 = new Scanner(System.in);
				data = scan2.nextInt();
				this.insert(data);
			}
			else if(user_input ==2)
			{
				this.pop();
			}
			else if(user_input ==3)
			{
				this.top();
			}
			System.out.println("Do you want to continue?(1==y)");
			Scanner scan3 = new Scanner(System.in);
			x = scan3.nextInt();
		}
	}
	
	public static void main(String args[])
	{
		question4 m = new question4();
		m.user_interface();
	}		
}
