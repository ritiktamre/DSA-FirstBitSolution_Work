package DoublyLinkedlist;

public class Doublylinkedlist1 {
  Node head;
  
  public void insertBeg(int ele)
  {
	  Node temp = new Node(ele);
	  if(this.head==null)
	  {
		  this.head=temp;
	  }
	  else
	  {
		  temp.next=head;
		  head.prev=temp;
		  head=temp;
	  }
	  System.out.println("-- Data Added --");
  }
  public void displayAll()
  {
	  if(head==null)
	  {
		  return ;
	  }
	  else
	  {
		  Node current =head;
		  while(current.next!=null)
		  {
			  System.out.println(current.data);
			  current=current.next;
		  }
		  System.out.println(current.data);
	  }
  }
  
  public void insertEnd(int data)
  {
	  Node temp = new Node(data);
	if(head == null)
	{
		head=temp;
	}
	else
	{
		Node current = head;
		while(current.next!=null)
		{
			current =current.next;
		}
		current.next=temp;
		temp.prev=current;
	}
  }
}
