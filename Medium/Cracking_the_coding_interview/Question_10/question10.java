//Given a list of people with their birth and death years, implement a method to compute the year with the most number of people alive.
//You may assume that all people were born between 1900 and 2000 (inclusive). If a person was alive during any portion of that year, 
//they should be included in that year's count. For example, Person  (birth = 1908,death=1909) is included in  the counts for
//both 1908 abd 1909.

import java.util.ArrayList;
import java.util.Scanner;

public class question10 {
	
	
	public void convertToArray(ArrayList<Integer> birth1, ArrayList<Integer>death1)
	{
		int size = birth1.size();
		int[] birth = new int[size];
		int[] death = new int[size];
		for(int i=0;i<size;i++)
		{
			birth[i]= birth1.get(i);
			death[i]= death1.get(i);
		}
		sort(birth, 0, size-1);
		sort(death, 0, size-1);
		findMax(birth, death, size-1);
		return;
	}
	public void findMax(int[]birth, int[] death, int size)
	{
		int maxyear=0, max=0,i=0,death1=0,alive=0;
		while(i<=size)
		{
			if(birth[i]<=death[death1])
			{
				alive++;
				if(alive>max)
				{
					maxyear=birth[i];
					max=alive;
				}
				i++;
			}
			else
			{
				alive--;
				death1++;
			}
		}
		System.out.println("Maxyear " +maxyear);
		return;
	}
	
	public void sort(int[] array, int start, int end)
	{
		int pindex=0;
		if(start<end)
		{
			pindex = pivot(array,start,end);
			sort(array, start, pindex-1);
			sort(array, pindex+1,end);
		}
	}
	
	public int pivot(int[] array, int start, int end)
	{
		int k =start, i=0,temp=0;
		int pivot = array[end];
		for(i=start;i<end;i++)
		{
			if(array[i]<=pivot)
			{
				temp = array[k];
				array[k] = array[i];
				array[i] = temp;
				k++;
			}
		}
		temp = array[k];
		array[k] = array[end];
		array[end] = temp;		
		return k;
	}
	
	public void user_interface()
	{
		ArrayList<Integer> birth = new ArrayList<Integer>();
		ArrayList<Integer> death = new ArrayList<Integer>();
		int death1,birth1, flag =1;
		while(flag ==1)
		{
			System.out.println("Enter birth");
			Scanner scan1 = new Scanner(System.in);
			birth1 = scan1.nextInt();
			if(birth1<=1900 || birth1>2000)
			{
				System.out.println("Bad Input");
				continue;
			}
			System.out.println("Enter death");
			Scanner scan2 = new Scanner(System.in);
			death1 = scan2.nextInt();
			birth.add(birth1);
			death.add(death1);
			System.out.println("Do  you want to continue?(1=y)");
			Scanner scan3 = new Scanner(System.in);
			flag = scan3.nextInt();
		}
		convertToArray(birth,death);
		return;		
	}
	public static void main(String args[])
	{
		question10 m= new question10();
		m.user_interface();
	}
}
