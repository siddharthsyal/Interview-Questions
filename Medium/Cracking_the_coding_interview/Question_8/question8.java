//Given an integer, print an English phrase that describes the integer. 
//Input : 19 
//Output : Nineteen

import java.util.Arrays;
import java.util.Scanner;

public class question8 {

	private void print(Stack_user[] stack, int[] counter, Integer num , int length, int count)
	{ 
		String[] counts = {""," Thousand "," Million "};
		String[] tens = {""," Ten "," Twenty "," Thirty "," Forty "," Fifty "," Sixty"," Seventy "," Eighty "," Ninty "};
		String[] unit =  {""," One "," Two "," Three "," Four "," Five "," Six "," Seven "," Eight "," Nine "," Ten "," Eleven "," Twelve ", " Thriteen ", " Fourteen "," Fifteen ", " Sixteen "," Seventeen ", " Eighteen "," Nineteen"};
		int i=0,k=0;
		StringBuffer s =new StringBuffer();
		while(count>0)
		{
			
			if( counter[count-1] == 3)
			{
				k = stack[count-1].pop();
				if(k>0)
				{
					System.out.print(unit[k] +" Hundred");
					counter[count-1]--;	
				}
			}
			s.append(stack[count-1].pop());
			s.append(stack[count-1].top());
			String buff = s.toString();
			k = Integer.parseInt(buff);
			if(k>=1 && k<20)
			{
				System.out.print(unit[k]);
				counter[count-1] = 0;
			}
			else
			{
				k=k/10;
				System.out.print(tens[k]);
				counter[count-1]--;
				System.out.print(unit[stack[count-1].pop()]);
				counter[count-1]--;
			}
			if(counter[count-1] == 0)//For switching to new stack that contains another pair of three numbers
			{
				System.out.print(counts[count-1]);
				s.setLength(0);//Reseting string buffer for each  new stack
				count--;
			}
		}
		return;
	}
	public void user_interface()
	{
		int i=0 , j=0 , length, len_dup,count=0,count_dup=0,k=0;
		System.out.println("Enter the number");
		Scanner scan1 = new Scanner(System.in);
		Integer num = scan1.nextInt();
		length = num.toString().length();//To get the length of the  number;
		len_dup = length;
		while(len_dup>0)
		{
			len_dup = len_dup-3;//Diving numbers into pairs of three
			count++;//Getting the count of the pairs
		}
		Stack_user[] stack = new Stack_user[3];//Using stack based on linked list
		int[] counter = new int[count];
		for(i=0;i<count;i++)
		{
			counter[i] =0;
			stack[i] = new Stack_user();
		}
		k = num;
		for(i=1;i<=length;i++)
		{
			int m = (k%10);
			k=k/10;
			stack[count_dup].push(m);			
			counter[count_dup]++;
			if(i%3==0)
				count_dup++;
		}
		print(stack, counter, num,length,count);
	}
	public static void main(String args[])
	{
		question8 m = new question8();
		m.user_interface();
	}	
}
1
