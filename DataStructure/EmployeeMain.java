package DataStructure;

public class EmployeeMain {
      
	Employee head;
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"Raju",10000);
		Employee e2 = new Employee(10,"Ramveer",30000);
		Employee e3 = new Employee(2,"Keshav",50000);
		
		EmployeeMain m1 = new EmployeeMain();
	       m1.insert(e1);
	       m1.insert(e2);
	       m1.insert(e3);
	       m1.display();
	       
	       System.out.println("-- Insert Position --");
	       Employee e4 = new Employee(5,"Halke",60000);
	       m1.insertpos(e4, 2);
	       m1.display();
	       
	       System.out.println(" -- Delete LinkedList --");
	       m1.delete(1);
	       m1.display();
	       
	       System.out.println("-- Delete LinkedList --");
	       m1.delete("Ramveer");
	       m1.display();
	       
	       System.out.println("-- Insert --");
	       Employee e5 = new Employee(1,"Rahul",30000);
	       m1.insertPos(e5, 3);
	       m1.display();
	}
	
	public void insert(Employee e)
	{
		if(head == null)
		{
			head=e;
		}
		else {
		  Employee current = head;
		  while(current.next!=null)
		  {
			  current=current.next;
		  }
		  current.next=e;
		}
			
	}
	
	public void insertpos(Employee e,int pos)
	{
		if(pos==1)
		{
			e.next=head;
			head=e;
			return;
		}
		else
		{
			Employee current=head;
			int count=1;
			while(current!=null && count < pos -1)
			{
				current=current.next;
				count++;
			}
			e.next=current.next;
			current.next=e;
		}
	}
	
	public void delete(int id)
	{
		if(head==null)
			return;
		if(head.id==id)
		{
			head=head.next;
		}
		else
		{
			Employee current = head;
			while(current.next!=null)
			{
				if(current.next.id==id)
				{
					current.next=current.next.next;
					return;
				}
				current = current.next;
			}
		}
	}
	
	public void delete(String name)
	{
		if(head==null)
			return;
		if(head.name==name)
		{
			head=head.next;
		}
		else {
			Employee current = head;
			while(current.next!=null)
			{
				if(current.next.name==name)
				{
					current.next=current.next.next;
					return;
				}
				current=current.next;
			}
		}
	}
	
	public void insertPos(Employee e,int pos)
	{
		if(head==null)
		{
			e.next=head;
			head=e;
			return;
		}
		else
		{
			Employee current =head;
			int count=1;
			while(current!=null && count < pos -1)
			{
				current=current.next;
				count++;
			}
			e.next=current.next;
			current.next=e;
		}
	}
	
	public void display()
	{
		Employee current = head;
		while(current!=null)
		{
			System.out.println("Id :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			System.out.println();
			current=current.next;
		}
	}
}
