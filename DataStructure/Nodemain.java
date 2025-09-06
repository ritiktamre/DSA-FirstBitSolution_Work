package DataStructure;

public class Nodemain {
     Node head;
	public static void main(String[] args) {
		Node n1 = new Node(12);
		Node n2 = new Node(54);
		Node n3 = new Node(4);
		Node n4 = new Node(14);
		
		Nodemain n = new Nodemain();
		n.insert(n1);
		n.insert(n2);
		n.insert(n3);
		n.insert(n4);
		n.iterate();
		
		System.out.println("-- Delete function --");
		n.delete(4);
		n.iterate();

	}
	public void insert(Node N) {
		if(head==null)
		{
			head = N;
		}
		
		else
		{
		  Node current=head;
		  while(current.next!=null)
		  {
			  current=current.next;
		  }
		  current.next=N;
		}
	}
	
	public void iterate() {
		Node current = head;
		while(current!=null)
		{
			System.out.println(current.value);
			current = current.next;
		}
	}
	
	public void delete(int value) {
		if(head==null)
		{
			return;
		}
		else
			if(head.value==value)
			{
				head=head.next;
			}
			else
			{
				Node current=head;
				while(current.next!=null)
				{
					if(current.next.value==value)
					{
						current.next=current.next.next;
					}
					current=current.next;
				}
			}
		
	}

}
