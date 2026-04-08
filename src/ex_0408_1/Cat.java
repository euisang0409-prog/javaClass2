package ex_0408_1;

public class Cat extends Animal{

	public Cat(String name, int age) {
		super(name, age);
		
	}

	@Override
	public void print() {
		System.out.println("고양이: " + name + ", " + age);
	}
	
}
