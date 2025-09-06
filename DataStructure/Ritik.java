package DataStructure;

public class Ritik {
  int id;
  String name;
  double salary;
  Ritik next;
 
  public Ritik() {
	// TODO Auto-generated constructor stub
}

public Ritik(int id, String name, double salary) {
	
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

Ritik getNext() {
	return next;
}

void setNext(Ritik next) {
	this.next = next;
}
  
  
}
