package ex_0408_1;

public class Main {
	public static void main(String[] args) {
		
		Animal[] arr = new Animal[3];
		
		arr[0] = new Dog("바둑이", 3);
		arr[1] = new Cat("나비", 5);
		arr[2] = new Dog("초코", 5);
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			arr[i].print();
			sum += arr[i].age;
			
		}
		System.out.println("총나이: " + sum);
		
		
	}
}
