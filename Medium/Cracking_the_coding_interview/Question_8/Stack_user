class nodes{
	public int data = 0;
	public nodes next = null;
}
public class Stack_user {
	public nodes head = new nodes();
	public boolean init = false;

	public void push(int data)
	{
		if(init == false)
		{
			this.head.data = data;
			this.init = true;
		}
		else
		{
			nodes temp = new nodes();
			temp.data = data;
			temp.next = this.head;
			this.head = temp;
			this.init = true;
		}		
	}
	
	public int pop() {
		int k =0;
		if(init == true)
		{
			k = this.head.data;
			this.head =this.head.next;
			if(this.head==null)
				this.init = false;
		}
		return k;
	}
	public int top()
	{
		int k =0;
		if(this.init == true)
			k = this.head.data;
		return k;
	}
}
