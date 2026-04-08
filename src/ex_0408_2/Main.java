package ex_0408_2;

public class Main {
	public static void main(String[] args) {
		
		Student stu1 = new Student("홍길동", 80);
		Student stu2 = new Student("고길동", 90);
		stu1.printInfo();
		stu2.printInfo();
		
		
		System.out.println("==============");
		
		Vehicle[] arr = new Vehicle[2];
		
		arr[0] = new Car("자동차");
		arr[1] = new Bike("자전거");
		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i].run();
//			
//		}
		
		for(Vehicle v : arr) {
			v.run();
		}
		
		
		
		
		
		
		
	}
}
