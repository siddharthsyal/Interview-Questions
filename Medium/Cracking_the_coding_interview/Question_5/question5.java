//Write an algorithm to compute the number of trailing zeros in n factorial

import java.util.Scanner;

public class question5 {
	
	private void zeroTrail(Integer num)
	{
		int i =1,j=0;
		if((num%10)>= 5)
		{
			j=0;
			if(num>10)
			{
				for(i=1;i<=num/10;i++)
					j=j+2;
				j++;
				System.out.println("Number of zeros "+j);
				return;
			}
			else
			{
				System.out.println("Number of zeros "+j);
			}
		}
		else if((num%10)==0)//For numbers like 30
		{
			j=0;
			for(i=1;i<=(num/10);i++)
				j=j+2;
			System.out.println("Number of zeros "+j);
		}
		else if(num>10)//For numbers whose unit place is between 0 and 5 while the number is greater than 10
		{
			int x = (num%10);
			num=num-x;
			zeroTrail(num);
		}
		else
			System.out.println("No Zeros");
		return;
	}
	private void user_interface()
	{
		System.out.println("Enter the  number for factorial");
		Scanner scan1 = new Scanner (System.in);
		Integer num = scan1.nextInt();
		zeroTrail(num);
	}
	public static void main(String args[])
	{
		question5 m =  new question5();
		m.user_interface();
	}
}
