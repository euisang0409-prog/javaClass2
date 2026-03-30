package ex_0325;

public class StudentMain {
	public static void main(String[] args) {
		
//		Main 클래스에서 학생 객체를 만든 후 값을 세팅하고 콘솔에 값을 출력하기
		//
//			나이에 0미만의 값이 들어오면 "잘못된 나이입니다" 출력하기
		
		Student s = new Student()
				;
		
		s.setName("홍길동");
		s.setAge(30);
		
		System.out.println("이름 : " + s.getName());
		System.out.println("나이 : " + s.getAge());
		
	}
}
