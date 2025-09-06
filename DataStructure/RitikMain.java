package DataStructure;

public class RitikMain {
 
	Ritik head;
	
	public static void main(String[] args) {
	    
		Ritik r1 = new Ritik(100,"Bumrah",45000);
		Ritik r2 = new Ritik(200,"Sudershan",30000);
		Ritik r3 = new Ritik(300,"Gill",35000);
		Ritik r4 = new Ritik(400,"Rahul",40000);
		
		RitikMain m1 = new RitikMain();
		m1.insert(r1);
		m1.insert(r2);
		m1.insert(r3);
		m1.insert(r4);
		m1.display();
		
		System.out.println("--Inset by Middle position--");
		Ritik r5 = new Ritik(500,"Jadeja",20000);
		m1.insertPosition(r5, 1);
		m1.display();
		
		System.out.println("-- Delete function --");
		m1.delete(300);
		m1.display();
		
		System.out.println("-- Delete function by name --");
		m1.delete("Jadeja");
	    m1.display();
	}
	
	public void insert(Ritik R)
	{
		if(head == null)
		{
			head=R;
		}
		else
		{
			Ritik current = head;
		    while(current.next!=null)
		    {
		    	current=current.next;
		    	
		    }
		    current.next=R;
		}
		
	}
	
	public void insertPosition(Ritik r,int pos)
	{
		if(pos==1)
		{
			r.next=head;
			head=r;
			return;
		}
		else
		{
			Ritik current = head;
			int count=1;
			while(current!=null && count <pos-1)
			{
				current=current.next;
				count++;
			}
		      r.next=current.next;
		      current.next=r;
		}
	}
	
	public void display()
	{
		Ritik current=head;
		while(current!=null)
		{
			System.out.println("Id :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			current=current.next;
			System.out.println();
		}
	}
	
	public void delete(int id)
	{
		if(head==null)
		{
			return;
		}
		else
			if(head.id==id)
		{
				head=head.next;
		}
			else
			{
				Ritik current = head;
				while(current.next!=null)
				{
					if(current.next.id==id)
					{
						current.next=current.next.next;
						return;
					}
					
					current=current.next;
				}
			}
	}
	
	public void delete(String name)
	{
		if(head==null)
		{
			return;
		}
		else
			if(head.name==name)
			{
				head=head.next;
			}
			else
			{
				Ritik current = head;
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
}
