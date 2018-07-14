import java.util.Arrays;

public class Listy {//Listy data structure as described by the problem statement
	
	public int[] array = new int[20];
	Listy()
	{
		Arrays.fill(array, -1);
		int i,j=0;
		for(i=20;j<15;i=i*3)
		{
			this.array[j] = i;
			j++;
		}
	}
}
