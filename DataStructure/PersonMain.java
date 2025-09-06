package DataStructure;

public class PersonMain {
    
	Person head;
	public static void main(String[] args) {
		
		Person p1 = new Person(300,"Aadarsh",35000,23,"Male");
		Person p2 = new Person(250,"Nisha",40000,26,"Female");
		Person p3 = new Person(200,"Shweta",20000,22,"Female");
		Person p4 = new Person(100,"Ramu",30000,25,"Male");
         
		PersonMain m1= new PersonMain();
		System.out.println("-- Insert Function --");
		m1.insert(p1);
		m1.insert(p4);
		m1.insert(p3);
		m1.insert(p2);
	
		m1.Iterate();
		
		System.out.println("-- Delete Function --");
		m1.delete(100);
		m1.Iterate();
		
		System.out.println("--Insert Function By Middle--");
		Person p5 = new Person(500,"Shyam",50000,25,"Male");
		m1.insert(p5,3);
		m1.Iterate();
		
	}
	
	public void insert(Person P)
	{
		if(head == null)
		{
			head=P;
		}
		else {
			Person current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			current.next=P;
		}
	}
	
	public void Iterate()
	{
		Person current=head;
		while(current!=null)
		{
			System.out.println("Id :"+current.id);
			System.out.println("Name :"+current.name);
			System.out.println("Salary :"+current.salary);
			System.out.println("Age :"+current.age);
			System.out.println("Gender :"+current.gender);
			current= current.next;
		}
	}
	
	public void delete(int id)
	{
		if(head==null)
		{
			return;
		}
		else if (head.id==id){
			head = head.next;
		}
		else {
			Person current = head;
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
	
	public void insert(Person P,int pos)
	{
		if(pos == 1)
		{
			P.next=head;
			head=P;
			return;
		}
		
		Person current =head;
		int count=1;
		while(current!=null && count < pos-1)
		{
			current=current.next;
			count++;
		}
		P.next=current.next;
		current.next=P;
	}

}
