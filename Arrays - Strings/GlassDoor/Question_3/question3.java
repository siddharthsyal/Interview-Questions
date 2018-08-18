//Implement a method to reverse a list of strings

import java.util.Scanner;
import java.util.ArrayList;
public class reverseList {
	
	public ArrayList<String> reverse(ArrayList<String> list)
	{
		int i=0,size=0;
		if(list.size()%2==0)
			size = list.size()/2;
		else
			size=(list.size()/2)+1;
		for(i=0;i<size;i++)
		{
			String temp = list.get(i);
			list.set(i, list.get(list.size()-1-i));
			list.set(list.size()-1-i, temp);
			
		}
		return list;
	}
	public void user_interface()
	{
		int x=1;
		ArrayList<String> list = new ArrayList<String>();
		while(x==1)
		{
			System.out.println("Do you want to enter a string");
			Scanner scan1 = new Scanner(System.in);
			String buff = scan1.nextLine();
			list.add(buff);
			System.out.println("Do you want to continue");
			Scanner scan2 = new Scanner(System.in);
			x = scan2.nextInt();
		}
		list = reverse(list);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		return;
	}
	public static void main(String args[])
	{
		reverseList m = new reverseList();
		m.user_interface();
	}

}
