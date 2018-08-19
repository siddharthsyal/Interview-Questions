//The Game of Master is played as follows:
//The computer has four slots & each slot would contain a ball that is red (R), yellow (Y), green (G) or blue (B). For example, 
//the computer might have RGGB (Slot #1 Red, Slot #2 Green, Slot #3 Green, Slot #4 Blue).
//You, the user, are trying to guess the solution. You might, for example, guess YRGB.
//When you guess the correct color for the correct slot, you get a "hit". If you guess a color that exists but is in the wrong slot,
//you get a psuedo-hit. Note that a slot that is hit can never be counted as pseudo-hit.
//For example, if the correct solution is RGBY and you guess GGRR, you have one hit and one pseudo-hit.
//Write a method that, given a guess and a solution, returns the number of hits and pseudo-hits. 

import java.util.Scanner;
import java.util.HashMap;
public class question15 {
	public void counter(String comp, String user)
	{
		int i,phit =0,hit=0,update=0,update1=0;
		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
		for(i=0;i<comp.length();i++)
		{
			if(comp.charAt(i)==user.charAt(i))
			{
				hit++;
			}
			else
			{
				if(map1.containsKey(comp.charAt(i))==false)
					map1.put(comp.charAt(i), 1);
				else
					map1.put(comp.charAt(i), map1.get(comp.charAt(i))+1);
			}
		}
		for(i=0;i<comp.length();i++)
		{
			if(comp.charAt(i) != user.charAt(i))
			{
				if(map1.containsKey(user.charAt(i)) == true)
				{
					update = map1.get(user.charAt(i));
					if(update ==0)
						continue;
					phit++;
					if(--update<=0)
						update=0;
					map1.put(user.charAt(i), update);
				}
			}
			else
				continue;
		}
		System.out.println("Hits = "+hit+" PsuedoHits = "+phit);
		return;
	}
	public void user_interface()
	{
		System.out.println("Enter the computer string");
		Scanner scan1 = new Scanner(System.in);
		String comp = scan1.nextLine();//Actual solution
		comp = comp.toLowerCase();
		System.out.println("Enter the user string");
		Scanner scan2 = new Scanner(System.in);
		String user = scan2.nextLine();//User entered guess
		user = user.toLowerCase();
		if(user.length()!=comp.length())
		{
			System.out.println("Input error. Try again!");
			return;
		}
		counter(comp,user);
		return;
				
	}
	public static void main(String args[])
	{
		question15 m = new question15();
		m.user_interface();
	}

}
