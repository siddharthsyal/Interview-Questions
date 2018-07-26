//Write a program to sort a stack such that the smallest elements are always on the top of the stack. You can  use a temporary stack
//but you cannot use any other data structure such as an array. The stack supports the following operatioins : push, pop, peek & isEmpty.

import java.util.Scanner;
import java.util.Arrays;

public class question5 {
	
	snodes[] head = new snodes[2];
	public boolean[] init = new boolean [2];
	public int min, i ;
	
	public void  insert(int data)
	{
		if(init[i] == false)
		{
			head[i].data = data;
			head[i].next =  null;
			init[i] =  true;
			return;
			
		}
		else if(init[i] == true)
		{
			int temp1;
			snodes temp = new snodes();
			temp.data =  data;
			if(temp.data > head[i].data)
			{
				temp1 = temp.data;
				temp.data = head[i].data;
				head[i].data = temp1;
			}
			temp.next =  head[i];
			head[i] = temp;
			init[i] = true;
			return;
			
		}
	}
  
	public void sort() {
		int j = 0;
		if(this.i == 0)
		{
			j=i;
			this.i++;
		}
		else if(this.i ==1)
		{
			j = i;
			this.i--;
		}
		head[i] = new snodes();
		while(head[j]!=null)
		{
			this.insert(this.head[j].data);
	
			this.head[j] =  this.head[j].next;
		}
		this.head[j] = null;
		this.init[j] = false;
		return;
	}
	
	public void top() {
		this.sort();
		System.out.println(this.head[this.i].data);
		return;
	}
	public void pop() {
		this.head[this.i] = this.head [this.i].next;
	}
	
	public void user_interface() {
		Arrays.fill(init, false);
		this.i = 0;
		for(int k=0;k<2;k++)
			head[k] = new snodes();
		int data, user_input, x=1;
		while(x==1)
		{
			System.out.println("1)Enter the data\n2)Pop data\n3)Top of the stack\n  Enter the choice:");
			Scanner scan1 = new Scanner(System.in);
			user_input = scan1.nextInt();
			if(user_input ==1)
			{
				System.out.println("Enter the data");
				Scanner scan2 = new Scanner(System.in);
				data = scan2.nextInt();
				this.insert(data);
			}
			else if(user_input ==2)
				this .pop();
			else if(user_input == 3)
				this.top();
			System.out.println("Do you want to continue?(yes==1)");
			Scanner scan3 = new Scanner(System.in);
			x = scan3.nextInt();
		}
	}
	
	public static void main(String args[])
	{
		question5 m = new question5();
		m.user_interface();
	}
}
