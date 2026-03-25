package javaClass2.co.kr.class5;

public class Class5 {

	public static void main(String[] args) {
		// 목표 : 중첩 클래스를 사용한다.
		// 1. 비정적 중첩 클래스 - 멤버 내부 클래스(인스턴스 클래스)
		// 2. 우선 Outer의 객체를 먼저 선언한다.
//		Outer outer = new Outer();
//		// 3. 선언된 outer를 기준으로 new 연산자를 사용하여 생성하였다.
//		Outer.Inner inner = outer.new Inner();
//		inner.printMessage();
		
		// 사용할 수 없는 이유는 private 이기 때문에 사용하지 못한다.
		// 그런데 자신 내부에 포함된 중첩 클래스는 그냥 사용할 수 있다.
		// String message = outer.helloMessage;
		// ******************************************************************
		// 1-1. 중첩 클래스 사용해보기 ( Calculator )
		// Calculator를 선언해주세요 ( 매개변수가 2개 : 10, 20 )
//		Calculator c = new Calculator(10,20);
//		// 중첩 클래스 ( 인스턴스 클래스 )를 사용해주세요
//		Calculator.Calc calc = c.new Calc();
//		// 출력으로 합에 대한 내용을 보여주세요
//		System.out.println("합 : " + calc.add());
		// ******************************************************************
		// 2. 비정적 클래스 - 지역 내부 클래스
		// 지역 내부 클래스 : 메서드안에 클래스
//		Greeting g = new Greeting();
//		g.sayHello();
		// ******************************************************************
		// 2-1. 지역 내부 클래스 사용하기 - 유닛이 이동하는 코드 작성하기
//		LocalClass unit = new LocalClass();
//		unit.getUnit("마린");
		// ******************************************************************
		// 3. 비정적 중첩 클래스 - 익명 내부 클래스
		// 익명 내부 클래스 : 이름이 없는 클래스이다. / 일회용으로 사용한다.
		// Interface를 사용한다.
//		Animal dog = new Animal() {
//			// 익명 내부 클래스를 만드는 영역이다.
//			@Override
//			public void sound() {
//				System.out.println("멍멍!");
//			}
//		};
//		dog.sound();
//		
//		// 간단한 실습
//		Animal cat = new Animal() {
//			@Override
//			public void sound() {
//				System.out.println("야옹!");
//			}
//		};
//		cat.sound();
		// ******************************************************************
		// 4. 정적 중첩 클래스
		// 정적 중첩 클래스 객체 선언 방법
		StaticOuter.StaticInner inner = new StaticOuter.StaticInner();
		inner.print();
		
		
		
		
		
	}

}
class StaticOuter{
	// 필드를 2개 선언할 것이다.
	private static int staticNum = 10; // static을 사용한 필드(변수)
	private int instanceNum = 20;	   // static을 사용하지 않은 필드(변수)
	// 정적 중첩 클래스
	static class StaticInner{
		// static이 붙은 중첩 클래스를 정적 중첩 클래스라고 한다.
		void print() {
			// 1. static이 붙은 변수 사용 가능
			System.out.println("nuber = " + staticNum);
			// 2. static이 붙지 않은 변수 사용 불가
//			System.out.println("number = " + instanceNum);
		}
	}
	
	
	
}








interface Animal{
	// 익명 내부 클래스를 작성할 것이다.
	// 추상화를 사용하겠다.
	void sound();
}





class LocalClass{
	// 필드를 생성한다.
	private int speed = 10;
	// 메서드를 만들 것이다.
	public void getUnit(String unitName) {
		// 메서드안에 클래스
		class Unit{
		// 유닛이 이동하는 함수(메서드)
			public void move() {
				System.out.println(unitName + "이"+speed+"속도로 이동합니다.");
			}
		}
		// Unit을 사용하기 위한 객체 선언
		Unit unit = new Unit();
		unit.move();
	}
	
}






class Greeting{
	// 지역 내부 클래스 : 메서드안에 클래스
	void sayHello() {
		// *** 지역 내부 클래스 시작 ***
		class LocalInner{
			void print() {
				System.out.println("메서드 안에서만 쓸 수 있는 클래스 입니다.");
			}
		}
		// 지역 내부 클래스를 사용하기 위한 객체 선언
		LocalInner local = new LocalInner();
		local.print();
		// ** 지역 내부 클래스 종료 ***
	}	
}







class Calculator{
	// 1. 필드를 생성할 것이다. (var1, var2)
	private int var1;
	private int var2;
	// 2. 생성자로 필드를 초기화 할 것이다. ( 생성자랑 this )
	public Calculator(int var1, int var2){	//매개 변수가 2개이다.
		this.var1 = var1;
		this.var2 = var2;
			
	}
	// 3. 중첩 클래스 - 인스턴스 클래스를 만들 것이다. ( Calc )
	// 해당 내용 안에 add()라는 메서드를 만들 것 이다.
	public class Calc{
		// 3-1. 더하기 메서드인 add() 메서드를 만들겠다.
		public int add() {
			return var1 + var2;
		}
	}
}

class Outer{
	// 인스턴스 클래스
	// (1). 인스턴스 클래스에서 사용할 필드(변수)
	private String message = "안녕하세요!";
	
	// inner의 필드나 메서드를 사용하기 위해서 객체를 선언한다.
	Inner i = new Inner();
	// 메서드를 만들 것인데, 아래 innerMessage처럼 똑같이 만들겠다.
	void helloMessage() {
		System.out.println("내부 클래스의 메시지 : " + i.innerMesage);
	}
	
	// (2). 중첩 클래스 작성하기
	class Inner{
		// 필드를 하나 선언 하겠습니다. ( inner의 필드이다. )
		private String innerMesage = "hello";
		
		// 해당 부분이 중첩 클래스 영역이다.
		void printMessage() {
			System.out.println("외부 클래스의 메시지 : " + message);
		}
	}	
}


