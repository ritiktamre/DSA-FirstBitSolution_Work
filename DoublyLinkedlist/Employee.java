package DoublyLinkedlist;

public class Employee {
  
	Employee prev;
	int id;
	String name;
	double salary;
	Employee next;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	Employee getPrev() {
		return prev;
	}

	void setPrev(Employee prev) {
		this.prev = prev;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	void setSalary(double salary) {
		this.salary = salary;
	}

	Employee getNext() {
		return next;
	}

	void setNext(Employee next) {
		this.next = next;
	}
	
	
}
