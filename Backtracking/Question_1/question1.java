//Given a string and a pattern. Check if the string follows the pattern

import java.util.*;
public class question1 {	
	
	public boolean patternMatch(String input, int i, String pattern, int j,HashMap<Character,String> map )
	{
		if(i==input.length()&&j==pattern.length())
			return true;
		if(i==input.length()|| j==pattern.length())
			return false;
		char ch = pattern.charAt(j);
		if(map.containsKey(ch))
		{

			String s = map.get(ch);
			int len = s.length();
			if((i+len)>input.length() || (input.substring(i, i+len).equals(s)==false))
				return false;
			else
			{
				return (patternMatch(input,i+len,pattern,j+1,map));	
			}
		}
		if(i<input.length())
		{
			for(int l=i;l<input.length();l++)
			{
				map.put(ch, input.substring(i, l+1));
				if(patternMatch(input,l+1,pattern,j+1,map))
					return true;
				map.remove(ch);
			}
		}

		return false;
	}
	public void user_interface()
	{
		String pattern="abba";
		String input="batballballbat" ;
		HashMap<Character,String> map = new HashMap <Character ,String>();
		if(patternMatch(input,0,pattern,0,map))
		{
			System.out.println("True");
			System.out.println("a -> "+map.get('a'));
			System.out.println("b -> "+map.get('b'));

		}
	}

	public static void main(String[] args) {
		question1 m = new question1();
		m.user_interface();
	}
}
