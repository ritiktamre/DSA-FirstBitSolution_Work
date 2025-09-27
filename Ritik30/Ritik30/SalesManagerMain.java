package Ritik30;

public class SalesManagerMain {

	SalesManager head;
	
	public static void main(String[] args) {
	
		SalesManager s1 = new SalesManager(12,"Ritik",30000,3000,30);
		SalesManager s2 = new SalesManager(10,"Omkar",25000,2500,25);

		
		SalesManagerMain sal = new SalesManagerMain();
		 sal.insert(s1);
		 sal.insert(s2);
		 sal.display();
		 
		 
		 System.out.println("-- Insert Data in the Table -- ");
		    SalesManager s3 = new SalesManager(1,"Akshay",20000,2000,20);
		    sal.insertpos(s3, 1);
		    sal.display();
		    
		    
		   System.out.println("-- Delete Data in the Table -- ");
		   sal.delete(10);
		   sal.display();
		   
		   System.out.println("-- Search Data in the Table --");
		   sal.search(1);
		   System.out.println();
		  sal.search(34);
	}
	
	public void insert(SalesManager s)
	{
		if(head == null)
		{
			head = s;
		}
		
		else
		{
			SalesManager current = head;
			while(current.next!=null)
			{
				current = current .next;
			}
			 current .next = s;
		}
	}
	
	public void insertpos(SalesManager s,int pos)
	{
		if(pos == 1)
		{
			s.next =head;
			head = s;
			return;
		}
		
		else
		{
			SalesManager current = head;
			int count=1;
			while(current!=null && count >pos-1)
			{
				current = current.next;
				count++;
				return;
			}
			
			s.next =current.next;
			current.next=s;
		}
	}
	
	public void delete(int id)
	{
	    if(head == null)
	    {
	    	return;
	    }
	    
	    if(head.id == id)
	    {
	    	head=head.next;
	    }
	    
	    else
	    {
	    	SalesManager current = head;
	    	while(current.next!=null)
	    	{
	    		if(current.next.id == id )
	    		{
	    			current.next = current.next.next;
	    			return;
	    		}
	    		
	    		current = current.next;
	    	}
	    }
	}
	
	public void search(int id)
	{
		SalesManager current = head;
			boolean found = false;
			while(current!=null) {
				
			
			if(current.id==id)
			{
				System.out.println("Employee Found");
				System.out.println("ID :"+current.id);
				System.out.println("Name :"+current.name);
				System.out.println("Salary :"+current.salary);
				System.out.println("Incentive :"+current.incentive);
				System.out.println("Target :"+current.target);
				found = true;
				break;
			}
			 current = current.next;
			}
			if(!found)
			{
				System.out.println("Does not exists the data :"+id);
			}
			
	}
	
	public void display()
	{
		SalesManager current = head;
		while(current!=null)
		{
			System.out.println("ID :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			System.out.println("Incentive :"+current.incentive);
			System.out.println("Target :"+current.target);
			System.out.println();//next line used
			
			 current = current.next;
		}
		
		
	}

}
