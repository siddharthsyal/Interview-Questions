public class singlelinkedlist {
	public snodes head = new snodes();
	public boolean init = false;
	public int counter=0;
	
	public void insert(int data)
	{
		if(init == false)
		{
			System.out.println("The list is not initializing\n");
			snodes temp = new snodes();
			temp.data = data;
			head = temp;
			init = true; counter++;
		}
		else if(init == true)
		{
			snodes temp = new snodes();
			snodes temp1 = new snodes();
			temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp1.data = data;
			temp.next = temp1;
			counter++;
		}
	}
	public void print()
	{
		snodes temp = new snodes();
		temp = head;
		System.out.println("The list is :");
		while(temp!=null)
		{
			System.out.print(temp.data +" ");
			temp = temp.next;
		}
		System.out.println();
		
		return;
	}
	public boolean delete(int data)
	{
		snodes temp = new snodes();
		snodes temp2 = new snodes();
		boolean flag = false;
		if(head.data == data)
		{
			if(head.next!=null) {
			head = head.next;
			System.out.println("Old head removed\n");
			counter--;
			flag = true;
			return(flag);
			}
			else
			{
				head = null;
				System.out.println("List Deleted\n");
				flag = true;init = false;
				counter--;
				return(flag);
			}
		}
		temp = head;
		while(temp.next !=null)
		{
			temp2 = temp.next;
			
			if((temp2.next == null) && (temp2.data == data))
			{
				temp.next = null;
				counter--;
				System.out.println("Last element deleted\n");
				flag = true;
				break;
			}
			else if((temp2.next != null)&&(temp2.data == data))
			{
				temp.next = temp2.next;
				counter--;
				flag = true;
			}
			temp = temp.next;
			
		}
		
		return(flag);
	}

}
