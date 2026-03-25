package javaClass2.co.kr.Quiz;

public class QuizMain {

	public static void main(String[] args) {
		// 1. 기본 생성자 + void 메서드를 사용하는 문제
		Movie m = new Movie();
		m.printInfo();
	}

}
class Movie{
	// (1) 필드를 생성할 것이다. String타입의 title, int 타입의 time이라는 필드
	String title;
	int time;
	
	// (2) 기본 생성자를 초기화 해주시고, title = "무제", time = 0
	Movie(){
		title = "무제";
		time = 0;
	}
	// (3) printInfo라는 void 메서드를 생성
	void printInfo() {
		System.out.println("영화 제목: " + title + ", 상영시간 : " + time + "분");
	}
	
	
	
	// 출력 : 영화 제목: title변수 , 상영 시간: time변수 분
}