package DoublyLinkedlist;

public class Person {
  
	Person prev;
	int id;
	String name;
	double salary;
	Person next;
	
	public Person(int id,String name,double salary) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	Person getPrev() {
		return prev;
	}

	void setPrev(Person prev) {
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

	Person getNext() {
		return next;
	}

	void setNext(Person next) {
		this.next = next;
	}
	
	
}
