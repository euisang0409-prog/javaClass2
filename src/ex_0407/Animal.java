package ex_0407;

public class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("동물: " + name);
		System.out.println("나이 : " + age);
	}
	
	
	
}
