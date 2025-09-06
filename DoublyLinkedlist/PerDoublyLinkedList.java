package DoublyLinkedlist;

public class PerDoublyLinkedList {
    
	Person head;
	
	public void InsertBeg(int id,String name,double salary)
	{
		Person p1 = new Person(id,name,salary);
		if(head==null)
		{
			head=p1;
		}
		else
		{
			p1.next=head;
			head.prev=p1;
			head=p1;
			
			
		}
		System.out.println("-- Data Added --");
	}//class InsertBeg ends here
	
	public void InsertEnd(int id,String name,double salary)
	{
		Person p = new Person(id,name,salary);
		if(head==null)
		{
			head=p;
		}
		else
		{
			Person current = head;
			while(current.next!=null)
			{
				current=current.next;
			}
			
			current.next=p;
			p.prev=current;
			
			
		}
		System.out.println("-- Add Data --");
	}//class InsertEnd ends here
	
	public void InsertPos(int id,String name,double salary,int pos)
	{
		Person p2 = new Person(id,name,salary);
		if(pos==1)
		{
			return ;
		}
		else
		{
			Person current = head;
			int count=1;
			while(current!=null && count <pos-1)
			{
				current=current.next;
				count++;
			}
			
			if(current==null)
			{
				return;
			}
			
			p2.next=current.next;
			if(current.next!=null)
			{
				current.next.prev=p2;
			}
			
			current.next=p2;
			p2.prev=current;
		
		}
		System.out.println("-- Data Added --");
	}
	
	public void reversed()
	{
		Person current=head;
		Person temp=null;
		if(head==null || head.next==null)
		{
			return;
		}
		while(current!=null)
		{
			temp=current.prev;
			current.prev=current.next;
			current.next=temp;
			current=current.prev;
		}
		head=temp.prev;
		System.out.println("-- Reversed the Linked List --");
	}
	
	public void sort()
	{
		if(head==null || head.next==null)
		{
			return;
		}
		Person current=head;
		while(current!=null)
		{
			Person p1 = current.next;
			while(p1!=null)
			{
				if(current.salary > p1.salary)
				{
					double temp=current.salary;
					current.salary=p1.salary;
				}
				p1=p1.next;
			}
			current=current.next;
		}
		System.out.println("-- Sorted The Linked List --");
	}
	
	public void deleteBeg()
	{
		if(head==null)
		{
			return;
		}
		head=head.next;
		if(head!=null)
		{
			head.prev=null;
		}
		System.out.println("Deleted from Begginning");
	}
	
	public void deleteEnd() {
		if(head==null)
		{
			return;
		}
		if(head.next==null)
		{
			head=null;
			return;
		}
		else
		{
		Person current = head;
		while(current.next.next!=null)
		{
			current=current.next;
		}
		
		current.next=null;
	}
		System.out.println("--- Deleted The Node At the End ---");
}
	public void display()
	{
		if(head == null)
		{
			return ;
		}
		else
		{
			Person current = head;
			while(current!=null)
			{
				System.out.println("Id :"+current.id);
				System.out.println("Name :"+current.name);
				System.out.println("Salary :"+current.salary);
				System.out.println();
				current = current.next;
			}
		}
	}
}
