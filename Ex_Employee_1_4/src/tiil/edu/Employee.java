package tiil.edu;

public class Employee {
	int id;
	String firstName;
	String lastName;
	int salary;
	
	public Employee(int id,String firstName,String lastName,int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
		
	}
	public String getName() {
		return firstName+lastName;
		
	}
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
		
	}
	
	public int getAnnualSalary() {
		return salary*12;
		
	}
	public int raiseSalary(int percent) {
		salary += salary*percent/100;
		return salary;
	}
	public String toString() {
		return String.format("Employee[id=%d,name=%s %s,salary=%d]", id,firstName,lastName,salary);
	}
}
