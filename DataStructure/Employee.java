package DataStructure;

  public class Employee
  {
	  int id;
	  String name;
	  double salary;
	  Employee next;
	  
	  public Employee() {
		
	}
	  
	  public Employee(int id,String name,double salary) {
		  super();
		  this.id=id;
		  this.name=name;
		  this.salary=salary;
	  }
	  
	  void setId(int id)
	  {
		  this.id = id;
	  }
	  
	  void setName(String name)
	  {
		  this.name=name;
	  }
	  
	  void setSalary(double salary)
	  {
		  this.salary=salary;
	  }
	  
	  void setNext(Employee next)
	  {
		  this.next=next;
	  }
	  
	  int getId()
	  {
		  return id;
	  }
	  
	  String getName()
	  {
		  return name;
	  }
	  
	  double getSalary()
	  {
		  return salary;
	  }
	  
	  Employee getNext()
	  {
		  return next;
	  }
	  
	  
}
