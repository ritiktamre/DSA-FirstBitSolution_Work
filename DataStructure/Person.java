package DataStructure;

public class Person {
   int id;
   String name;
   double salary;
   int age;
   String gender;
   Person next;
   
   public Person() {
	// TODO Auto-generated constructor stub
}//default constructor

public Person(int id, String name, double salary, int age, String gender) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.age = age;
	this.gender = gender;
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

String getGender() {
	return gender;
}

void setGender(String gender) {
	this.gender = gender;
}

Person getNext() {
	return next;
}

void setNext(Person next) {
	this.next = next;
}
   

   
}
