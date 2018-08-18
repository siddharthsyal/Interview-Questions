
public class doublyLinkedList {
	public doublynodes head =  new doublynodes();
	public boolean init = false;
	public doublynodes insert(int data)
	{
		if(this.init = false)
		{
			this.init = true;
			this.head.data = data;
			System.out.println("Data inserted");
			return head;
		}
		else
		{
			doublynodes node = new doublynodes();
			node.data = data;
			node.forward = this.head;
			this.head.back = node;
			this.head = node;
			System.out.println("Data inserted");
			return head;
		}
	}
	public void delete(doublynodes node)
	{
		if(node!=this.head)
		{
			node.forward.back=node.back;
			node.back.forward=node.forward;
			return;
		}
		if(this.head.forward==null)
		{
			System.out.println("Deleted everything");
			this.head = null;
			this.init = false;
			return;
		}
		this.head=this.head.forward;
		this.head.back=null;
		return;		
	}
	
	public void print()
	{
		doublynodes node = new doublynodes();
		while(node.forward!=null)
		{
			System.out.println(node.data+" ");
			node=node.forward;
		}
		return;
	}
	
}
