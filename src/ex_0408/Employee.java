package ex_0408;

public class Employee {
	String name;
	int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public int getPay() {
		return salary;
	}
	
	public void printInfo() {
		System.out.println("이름: " + name + ", 급여:" + salary);
	}
	
}
