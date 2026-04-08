package ex_0408;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee("홍길동", 3000000);
		Employee employee2 = new Employee("고길동", 4000000);
		
		employee1.printInfo();
		employee2.printInfo();
	System.out.println("===========================");
	
		Animal[] ani = new Animal[3];
		
		ani[0] = new Dog("바둑이");
		ani[1] = new Cat("나비");
		ani[2] = new Dog("홍길동");
		
		for(Animal a : ani) {
			a.sound();
		}
		
		
	}
}
