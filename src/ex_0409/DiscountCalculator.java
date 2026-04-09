package ex_0409;

public class DiscountCalculator {
	   public static void main(String[] args) {
	      
	 
	       // 문자열 비교 오류(==사용)
	       // grade ="VIP"는 참조값 비교입니다.
	       // 자바에서 문자열 비교는 equals를 사용해야합니다.
	       // ==를 쓰면 문자열 내용이 같아도 다른 객체라면 false가 나옵니다.
	     // 2. 정수열 변수에 실수형 연산 대입 오류
	       // price * 0.8의 결과 값은 doulbe타입 연산 결과가 입니다.
	      // 그런데 디스카운터는 int라서 컴파일 에러가 나옵니다.
	       // 그래서 (int)price 형변환 또는 double 타입으로 선언
	       private
	       
	       // [A] 오류발생로직 
		   int price = 10000;
	       String grade = "VIP";
	       int discountedPrice = 0;
	 
	       // [A] 오류발생로직
	       if (grade == "VIP") { 
	           discountedPrice = price * 0.8; 
	       } 

	       // [B] 나머지 로직


	   }
	}

