
public class stack {	
	public nodes head = new nodes();	
	public boolean init = false;
	public void push(int data)
	{
		if(init == false)
		{
			head.data = data;
			head.min = data;
			init = true;
			System.out.println("Stack initialized\nData pushed");
		}
		else if(init == true)
		{
			nodes temp = new nodes();
			temp.next = head;
			temp.data = data;
			temp.min = data;
			if(temp.min>head.min)
			{
				temp.min = head.min;
			}
			head = temp;
			
			
			init = true;
			System.out.println("Data pushed");
			
		}
		return;
	}
	public void pop()
	{
		if(head.next == null)
		{
			head = null;
			init = false;
			System.out.println("Data popped\nStack empty");
			
		}
		else if(head.next != null)
		{
			nodes temp = new nodes();
			temp = head.next;
			head = temp;		
			System.out.println(head.data);
			System.out.println("Data popped");
		}
		return;
	}
	public void top()
	{
		if(init == false)
		{
			System.out.println("stack not initialized");
			return;
		}
		else if(init == true)
		{
			System.out.println(head.data);
			return;
		}			
	}
	public void min()
	{
		System.out.println(head.min);
	}
}
