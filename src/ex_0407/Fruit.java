package ex_0407;

public class Fruit {
	
	String name;
	int count;
	
	public Fruit(String name,int count) {
		this.name = name;
		this.count = count;	
	}
	
	public void printInfo() {
		System.out.println("과일: " + name);
		System.out.println("재고 :" + count);
				
	}
	
	
	
	
	
	
	
	
}
