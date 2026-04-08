package ex_0408_2;

public class Car extends Vehicle{

	public Car(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("자동차가 달립니다.");
	}
	
}
