package ex_0407;

public class Student {
	String name;
	int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void printInfo() {
		System.out.println("이름: " + name);
		System.out.println("점수: " + score);
	}
	
	
	
	
}
