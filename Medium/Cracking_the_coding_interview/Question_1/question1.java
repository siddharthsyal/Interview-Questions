//Swap two numbers without using any temprory variable

import java.util.Scanner;

public class question1 {
	private int a=0,b=0;
	
	private void swap() {
		if(this.b>this.a)
		{
			this.b = (2*this.b-this.a)-this.b;
			this.a =  (this.b - this.a)+2*this.a;
			this.b = this.a-this.b;
			return;
		}
		else if(this.a>this.b) {
			this.a = (2*this.a-this.b)-this.a;
			this.b = (this.a-this.b)+2*this.b;
			this.a = this.b-this.a;
			return;
		}
		else if(this.a == this. b)
			return;
	}

	private void user_interface() {
		System.out.println("Enter two numbers");
		Scanner scan1 =  new Scanner(System.in);
		this.a = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		this.b = scan2.nextInt();
		System.out.println("Original Numbers are " +this.a +" " +this.b);
		swap();
		System.out.println("Swapped Numbers are " +this.a +" " +this.b);
	}
	public static void main(String args[])
	{
		question1 m = new question1();
		m.user_interface();
	}
}
