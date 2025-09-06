package DataStructure;

public class Radhe {
    
	int id;
	String name;
	double salary;
	int age;
	Radhe next;
	
	public Radhe(int id, String name, double salary, int age) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
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

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	Radhe getNext() {
		return next;
	}

	void setNext(Radhe next) {
		this.next = next;
	}
	
	
	
	
	
	}
