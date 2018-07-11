// How  would you design a stack which, in addition to push & pop, has a function min which returns the
// minimum element? Push, pop and min should operate in O(1) time. 
import java.util.Scanner;

public class question2 extends stack{
	
	public void user_interface()
	{
		int data, user_input,x=1;
		while(x==1)
		{
			System.out.println("1)Push the data\n2)Pop the data\n3)Top of the stack\n4)Minimum  Enter the choice: ");
			Scanner scan1 = new Scanner(System.in);
			user_input = scan1.nextInt();
			if(user_input == 1)
			{
				System.out.println("Enter the data to be pushed :");
				Scanner scan2 = new Scanner(System.in);
				data = scan2.nextInt();
				super.push(data);
			}
			else if(user_input == 2)
			{
				super.pop();
			}
			else if(user_input == 3)
			{
				super.top();
			}
			else if(user_input == 4)
			{
				super.min();
			}
			System.out.println("Do you want to continue?(y ==1)");
			Scanner scan3 = new Scanner(System.in);
			x = scan3.nextInt();
		}
	}
	public static void main(String args[])
	{
		question2 m = new question2();
		m.user_interface();
	}
}
