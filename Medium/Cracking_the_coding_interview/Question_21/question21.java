//Given twoarrays of integers, find a pair of values (one from each array) that you can swap to give the two arrays the same sum. 
//Example : Input = {4, 1, 2, 1, 1, 2}
//                  {3, 6, 3, 3}
//          Output =  , 3}
import java.util.Scanner;
import java.util.HashMap;
public class question21 {
	
	public void sumSwap(int[] a, int[] b)
	{
		int i=0,sum1=0, sum2=0,diff=0;
		HashMap<Integer, Integer> map1 =  new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();
		for(i=0;i<a.length;i++)
		{
			sum1 =  sum1+a[i];
			if(!map1.containsKey(a[i]))
				map1.put(a[i], 1);
		}
		for(i=0;i<b.length;i++)
		{
			sum2 =  sum2+b[i];
			if(!map2.containsKey(b[i]))
				map2.put(b[i], 1);
		}
		diff = Math.abs(sum1-sum2);
		for(i=0;i<a.length;i++)
		{
			if(map2.containsKey(Math.abs(diff-a[i])))
			{
				System.out.println("The numbers to be swapped are "+a[i]+" "+Math.abs(diff-a[i]));
				break;
			}
		}
		return;
	}
	public void user_interface()
	{
		int i=0, length=0;
		System.out.println("Enter the length of the array 1");
		Scanner scan1 = new Scanner (System.in);
		length = scan1.nextInt();
		int[] array1 = new int[length];
		System.out.println("Enter the array 1");
		for(i=0;i<length;i++)
		{
			array1[i]= scan1.nextInt();
		}
		System.out.println("Enter the length of the array 2");
		length = scan1.nextInt();
		int[] array2 = new int[length];
		for(i=0;i<length;i++)
		{
			array2[i]= scan1.nextInt();
		}
		sumSwap(array1,array2);
		return;		
	}
	
	public static void main(String args[])
	{
		question21 m = new question21();
		m.user_interface();
	}
}
