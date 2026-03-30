package ex_0325;

public class Student {

//	Student 클래스를 만들기
//	필드
//
//	- 문자열 타입의 이름
//	- 정수 타입의 나이
//
//	모든 필드는 private으로 선언
//
//	setter / getter를 각각 구현
//
//	Main 클래스에서 학생 객체를 만든 후 값을 세팅하고 콘솔에 값을 출력하기
//
//	나이에 0미만의 값이 들어오면 "잘못된 나이입니다" 출력하기
	
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("잘못된 나이입니다.");
		}else {
			this.age = age;
		}
		
	}
	
	
	
	
	
	
}
