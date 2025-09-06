package DoublyLinkedlist;

public class EmpDoublyLinkedList {
  
	 Employee head;
	 
	 public void insertBeg(int id,String name,double salary)
	 {
		 Employee e1 = new Employee(id,name,salary);
		 if(head==null)
		 {
			 head=e1;
		 }
		 else
		 {
			 e1.next=head;
			 head.prev=e1;
			 head=e1;
		 }
		 System.out.println("-- Data Added --");
	 }
	 
	 public void display()
	 {
		 if(head == null)
		 {
			 return;
		 }
		 Employee current=head;
		 while(current!=null)
		 {
			 System.out.println("Id :"+current.id);
			 System.out.println("Name :"+current.name);
			 System.out.println("Salary :"+current.salary);
			 current=current.next;
		 }
	 }
	 
	public void InsertEnd(int id,String name,double salary)
	{
		Employee q = new Employee(id,name,salary);
		if(head==null)
		{
			head=q;
		}
		else
		{
			Employee current = head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=q;
			q.prev = current;
			System.out.println("-- Data Added --");
		}
	}
	
	public void insertPosition(int id,String name,double salary,int pos)
	{
		Employee E = new Employee(id, name, salary);
				if(pos == 1)
				{
					return;
				}
				else
				{
					Employee current = head;
					int count =1;
					while(current!=null && count <pos-1)
					{
						current = current.next;
						count++;
					}
					if(current==null)
					{
						return;
					}
					
					E.next=current.next;
					if(current.next!=null)
					{
						current.next.prev=E;
					}
					current.next=E;
					E.prev=current;
					System.out.println("-- Data Added --");
				}
		
     }
	
	public void reversed()
	{
		Employee current=head;
		Employee temp=null;
		if(head==null || head.next==null)
		{
			return ;
		}
		
			while(current!=null)
			{
				temp=current.prev;
				current.prev=current.next;
				current.next=temp;
				current=current.prev;
			}
			head=temp.prev;
			System.out.println("-- List Is Reserved --");
      }
	
	public void sort()
	{
		if(head==null || head.next==null)
		{
			return;
		}
		Employee current = head;
		while(current!=null)
		{
			Employee e2 =current.next;
			while(e2!=null)
			{
				if(current.id>e2.id)
				{
					int temp=current.id;
					current.id=e2.id;
					e2.id=temp;
				}
				e2=e2.next;
			}
			current=current.next;
		}
		System.out.println("--- List Is Sorted ---");
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
		Employee current = head;
		while(current.next.next!=null)
		{
			current=current.next;
		}
		
		current.next=null;
	}
		System.out.println("--- Deleted The Node At the End ---");
}
}
