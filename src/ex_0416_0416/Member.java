package ex_0416_0416;

public class Member {

	private String id;
	private String name;
	private int age;
	
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	public void printInfo() {
		System.out.println("아이디 : " + id + ", 이름 : " + name + ", 나이: " + age);
	}
	
	
}
