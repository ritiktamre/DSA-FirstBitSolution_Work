package DataStructure;


public class EmpMain1 {
        
	Employee1 head;
	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1(100,"Aadesh sir",30000);
		Employee1 e2 = new Employee1(200,"Ranjeet sir",25000);
		Employee1 e3 = new Employee1(300,"Shubham sir",40000);
		Employee1 e4 = new Employee1(400,"Ranjeet Kamble sir",32000);
		Employee1 e5 = new Employee1(500,"Chetan Natu sir",60000);
		
		EmpMain1 m1 = new EmpMain1();
		System.out.println("--Insert First Object --");
		m1.insert(e1);
		m1.display();
		System.out.println("-- Insert All Object--");
		m1.insert(e2);
		m1.insert(e3);
		m1.insert(e4);
		m1.insert(e5);
		m1.display();
		
		System.out.println("--Insert Middle Position--");
		Employee1 e6 = new Employee1(600,"Ishkra Dawre mam",28000);
	    m1.insert(e6,3);
		m1.display();
		
		System.out.println("-- Delete first object --");
		m1.delete(100);
		m1.display();
		
		System.out.println("-- Delete Middle object --");
		m1.delete(600);
		m1.display();
		
	
	    }
		
	
	

	public void insert(Employee1 e)
	{
		if(head==null)
		{
			head=e;
		}
		else
		{
			Employee1 current = head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=e;
		}
			
	}
	
	public void display()
	{
		Employee1 current=head;
		while(current!=null) {
		
			System.out.println("Id :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			current=current.next;
			System.out.println();
		}
	}
	
	public void insert(Employee1 E ,int pos)
	{
		if(pos == 1)
		{
			E.next=head;
			head=E;
			return ;
		}
	      Employee1 current = head;
	     int count=1;
	      while(current!=null && count < pos-1)
	      {
	    	  current=current.next;
	    	  count++;
	      }
	      
	      E.next = current.next;
	      current.next=E;
			
	
	}
	
	public void delete(int id)
	{
		if(head==null)
		{
			return ;
		}
		else
			if(head.id==id)
			{
				head=head.next;
			}
			else
			{
				Employee1 current = head;
				while(current.next!=null)
				{
					if(current.next.id==id)
					{
						current.next=current.next.next;
					}
					
					current=current.next;
				}
			}
	}

}
