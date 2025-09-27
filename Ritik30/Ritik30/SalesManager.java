package Ritik30;

public class SalesManager {

	 int id;
	 String name;
	 double salary;
	 double incentive;
	 int target;
	 SalesManager next;
	 
	 
	 public SalesManager() {
		// TODO Auto-generated constructor stub
	}


	public SalesManager(int id, String name, double salary, double incentive, int target) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.incentive = incentive;
		this.target = target;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public double getIncentive() {
		return incentive;
	}


	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}


	public int getTarget() {
		return target;
	}


	public void setTarget(int target) {
		this.target = target;
	}


	public SalesManager getNext() {
		return next;
	}


	public void setNext(SalesManager next) {
		this.next = next;
	}
	 
	 
}
