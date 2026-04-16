package ex_0416_Employee;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(new Employee("김철수", 3500));
		list.add(new Employee("박철수", 6500));
		list.add(new Employee("봉철수", 5500));
		list.add(new Employee("동철수", 7500));
		
		Collections.sort(list, (e1, e2) -> e2.getSalary() - e1
				.getSalary());
		
		System.out.println("=== 급여가 높은 순 ===");
		for(Employee e : list) {
			e.printInfo();
		}
		
		Collections.sort(list, (e1, e2) -> e1.getName().compareTo(e2.getName()));
		
		System.out.println("=== 이름 오름차순 ===");
		for(Employee e : list) {
			e.printInfo();
		}
		
		
		
		
		
	}
}
