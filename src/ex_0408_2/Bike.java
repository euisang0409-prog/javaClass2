package ex_0408_2;

public class Bike extends Vehicle{

	public Bike(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("자전거가 달립니다.");
	}
	
}
