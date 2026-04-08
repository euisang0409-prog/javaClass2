package ex_0408;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		
	}

	@Override
	public void sound() {
		System.out.println(name+ ": 멍멍");
	}
	
	
}
