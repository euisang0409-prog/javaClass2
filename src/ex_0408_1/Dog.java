package ex_0408_1;

public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
		
	}
	
 @Override
public void print() {
	System.out.println("강아지: " + name + ", " + age);
}
	
	
}
