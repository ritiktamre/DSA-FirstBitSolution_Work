///Asignment 1 by Insert, Delete and Iterate 

package DataStructure;

public class  Employee1{
   
	int id;
	String name;
	double salary;
	Employee1 next;
	
	public Employee1() {
		// TODO Auto-generated constructor stub
	}//default constructor ends here

	public Employee1(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	Employee1 getNext() {
		return next;
	}

	void setNext(Employee1 next) {
		this.next = next;
	}
	
	
}
