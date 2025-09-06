package DataStructure;

public class RadheMain {

	Radhe head;
	public static void main(String[] args) {
		 
		Radhe r1 = new Radhe(100,"Ram",30000,23);
		Radhe r2 = new Radhe(200,"Ramu",40000,25);
		Radhe r3 = new Radhe(30,"Rahul",10000,19);
		Radhe r4 = new Radhe(300,"Ranjeet",12000,26);
		
		RadheMain m1 = new RadheMain();
		m1.insertbeg(r1);
		m1.insertbeg(r2);
		m1.insertbeg(r3);
		m1.insertbeg(r4);
		
		System.out.println("-- Insert Beg details --");
		m1.displayAll();
		
		System.out.println("-- Insert Pos Details --");
		Radhe r5 = new Radhe(50,"Kahna",200000,28);
		m1.insertpos(r5, 2);
		m1.displayAll();
		
		System.out.println("--- Delete Details by Id---");
		m1.deleteAll(30);
		m1.deleteAll(50);
		m1.displayAll();
	 
		System.out.println("--- Delete Details by Name ---");
		m1.delete("Ramu");
		m1.delete("Ranjeet");
		m1.displayAll();
		
	}
      public void insertbeg(Radhe r)
      {
    	  if(head == null)
    	  {
    		  head=r;
    	  }
    	  else
    	  {
    		  Radhe current = head;
    		  while(current.next!=null)
    		  {
    			  current=current.next;
    		  }
    		  current.next=r;
    	  }
      }
      
      public void displayAll()
      {
    	  Radhe current = head;
    	  while(current!=null)
    	  {
    		  System.out.println("Id :"+current.id);
    		  System.out.println("Name :"+current.name);
    		  System.out.println("Salary :"+current.salary);
    		  System.out.println("Age :"+current.age);
    		  current=current.next;
    		  System.out.println();
    	  }
      }
      
      public void insertpos(Radhe r,int pos)
      {
    	  if(pos==1)
    	  {
    		  r.next=head;
    		  head=r;
    		  return;
    	  }
    	  else
    	  {
    		  Radhe current = head;
    		  int count = 1;
    		  while(current!=null && count < pos-1)
    		  {
    			  current = current.next;
    			  count++;
    		  }
    		  
    		  r.next=current.next;
    		  current.next=r;
    	  }
      }
      
      public void deleteAll(int id)
      {
    	  if(head == null)
    	  {
    		  return ;
    	  }
    	  else
    	  {
    		  if(head .next.id == id)
    		  {
    			  head=head.next;
    		  }
    		  else
    		  {
    			  Radhe current = head;
    			  while(current.next!=null)
    			  {
    				  if(current.next.id == id)
    				  {
    					  current.next=current.next.next;
    					  return;
    				  }
    				  current = current.next;
    			  }
    		  }
    	  }
      }
      
      public void delete(String name)
      {
    	  if(head==null)
    	  {
    		  return ;
    	  }
    	  else
    	  {
    		  if(head.name.equals(name))
    		  {
    			  head=head.next;
    		  }
    		  else {
    			  Radhe current = head;
    			  while(current.next!=null)
    			  {
    				  if(current.next.name.equals(name))
    				  {
    					  current.next=current.next.next;
    					  return;
    				  }
    				  
    				  current = current.next;
    			  }
    		  }
    	  }
      }
}
