//Write methods to implement the multiply, divide, & subtract operations for integers. The results of all of these are integers
//Use ONLY the add oeprator.

import java.util.*;

public class question9 {
	
	public void Subtract(Integer num1 , Integer num2)
	{
		if(num1>=0 && num2>=0)
		{
			Integer num = Math.max(num1, num2);
			num = (~num)+Math.min(num1, num2);
			num = ~num;
			System.out.println(num);
			return;
		}
		else if(num1>=0 && num2<=0)
		{
			num2 = ~num2;
			num2++;
			Integer result = num1+num2;
			System.out.println(result);
			return;
		}
		else if(num1<=0 && num2<=0)
		{
			
			Integer result = num1+(~num2+1);
			System.out.println(result);
			return;
		}
		else if(num1<=0 && num2>=0)
		{

			Integer result = num1+num2;
			System.out.println(result);
			return;
		}
	}
	public void Divide(Integer num1, Integer num2)
	{
		if(num1==0)
		{
			System.out.println(0);
			return;
		}
		else if(num2==0)
		{
			System.out.println("Cannot  be calculated");
			return;
		}
		int buff,  numb2,  numb1, x=0;
		numb1 = Math.abs(num1);
		numb2 = Math.abs(num2);
		buff = numb2;
		while(numb2 <= numb1)
		{
			numb2=numb2+buff;
			x++;
		}
		if((num1>0&&num2>0)||(num1<0&&num2<0))
			System.out.println(x);
		else
		{
			x=~x+1;
			System.out.println(x);
		}
		return;
	}
	
	public void Multiply(Integer num1, Integer num2)
	{
		boolean flag = false;
		if(num1<0 && num2<0)
		{
			num1 = ~num1+1;
			num2 = ~num2+1;
		}
		if(num1 == 0 || num2 ==0)
		{
			System.out.println(0);
			return;
		}
		if(num2<0)
		{
			flag = true;
			num2 = ~num2+1;
		}
		
		int i =0,buff =num1;
		for(i=0;i<(num2-1);i++)
			num1 = num1+buff;
		if(flag == true)
			num1 =  ~num1+1;
		System.out.println(num1);
		return;
	}
	public void user_interface()
	{
		Integer num1, num2;
		System.out.println("Enter the two  numbers");
		Scanner scan1 = new Scanner(System.in);
		num1 = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		num2 = scan2.nextInt();
		boolean flag = true;
		while(flag)
		{
			System.out.println("Select the operation\n1)Subtract\n2)Divide\n3)Multiply\n");
			Scanner scan3 = new Scanner(System.in);
			int buff = scan3.nextInt();
			switch(buff)
			{
				case 1:
					Subtract(num1,num2);
					flag = false;
					break;
				case 2:
					Divide(num1,num2);
					flag = false;
					break;
				case 3:
					Multiply(num1,num2);
					flag = false;
					break;
			}
		}
		return;
	}
	public static void main(String args[])
	{
		question9 m = new question9();
		m.user_interface();		
	}
}
