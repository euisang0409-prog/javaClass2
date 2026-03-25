package javaClass2.co.kr.Class6;

import java.util.ArrayList;
import java.util.List;

public class Class6 {

	public static void main(String[] args) {
		// 1. Object 타입 사용해보기
		// Object 타입의 특징 : 모든 타입을 저장할 수 있다.
//		Object a = "hello";
//		Object b = 10;
//		Object c = 3.14;
//		Object d = true;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
//		Object[] arr = new Object[3];
//		// 각각에 인덱스에다가 다른 타입을 넣을 것이다.
//		arr[0] = "홍길동";	// 문자열
//		arr[1] = 20;		// 정수열
//		arr[2] = 175.5;		// 실수형
//		
//		// 기존 배열에서는 하나의 데이터 타입만 값을 초기화 할 수 있었다.
//		// 향상된 for문을 사용해서 출력
//		for(Object arr2 : arr) {
//			System.out.println(arr2);
//		}
		
		// ArryList : 컬렉션 프레임워크
		ArrayList<Object> list = new ArrayList<>();
		// 컬렉션 프레임워크를 사용하기 위해서 import를 했다.
		
		// 기존의 배열은 항상 인덱스의 크기를 지정하였다.
		// ArrayList는 별도의 크기를 지정하지 않아도 된다. : 크기를 동적으로 설정
		
		// 값을 추가하는 방법은 list.add()함수를 사용했다.
//		list.add("홍길동");
//		list.add(25);
//		list.add(172.3);
//		
//		System.out.println(list);
//		// Object의 특징 : 값을 가져와서 사용할 때, 형변화을 해줘야한다.
//		String name = (String)list.get(0); // get함수를 사용해서 0번 인덱스의 값을 가져와라
//		int age = (int)list.get(1);
//		double height = (double)list.get(2);
//		
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("키 : " + height);
		
		// Object의 특징 1 : 모든 데이터 타입을 담을 수 있다.
		// Object의 특징 2 : 가져와서 사용할 때 형변환을 해줘야한다.
		
		// Object를 사용해서 실습 문제
		// ArrayList 사용하기
		// Scanner로 값을 받을 것이다.
		// 입력받은 값을 Object로 활용한다. (형변환)
//		ArrayList<Object> info = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		// (1) 값을 하나씩 받아오기
//		System.out.println("이름을 입력해주세요 : ");
//		info.add(sc.nextLine());
//		// 나이 입력받기 : 나이를 입력해주세요
//		System.out.println("나이를 입력해주세요 : ");
//		info.add(sc.nextInt());
//		// 평균 입력받기 : 평균을 입력해주세요
//		System.out.println("평균을 입력해주세요 : ");
//		info.add(sc.nextDouble());
//		
//		// (2). info의 값을 하나씩 꺼내서 각 데이터 타입에 맞게 초기화하기
//		// 이름 : name, age, 평균 : avg
//		String name = (String)info.get(0);
//		int age = (int)info.get(1);
//		double avg = (double)info.get(2);
//		
//		// (3). 출력하기 이름 : + name
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//		System.out.println("평균 : " + avg);
		// ******************************************************************
		// 2. 제네릭 사용하기 : <T>
		// 제네릭 클래스를 활용한 객체 선언 : String version
//		Box<String> b = new Box<String>();
//		b.set("안녕하세요");
//		System.out.println(b.get());
//		
//		// 제네릭 클래스를 활용한 객체 선언 : Integer version
//		Box<Integer> bI = new Box<Integer>();
//		bI.set(314);
//		System.out.println(bI.get());
	
		// (1). 무조건 T라는 알파벳을 사용해야 되나요?
		// (2). 제네릭 클래스로 생성된 클래스 안에는 모두 제네릭만 사용해야되나요?
		// -> 무조건 사용하지 않아도 상관 없습니다. ( 필수가 아니다 )
		// ******************************************************************
		// 3. 제네릭 메서드
//		BoxMethod box = new BoxMethod();
//		
//		// 제네릭 메서드를 사용
//		String str = box.echo("안녕하세요"); // T = String
//		Integer num = box.echo(100);	  // T = Integer
//		Double b = box.echo(3.14);		// T = Double
//		
//		System.out.println(str);
//		System.out.println(num);
//		System.out.println(b);
//		
//		String str2 = BoxMethod.echo2("안녕하세요2");
//		System.out.println(str2);
		// ******************************************************************
		// 4. 제네릭 형식 인자 제한 ( 상한 제한 )
//		Calculator<Integer> calc1 = new Calculator<>();
//		System.out.println(calc1.add(10, 20));
//		
		// 4-1. 제네릭 형식 인자 제한 ( 하한 제한 )
		// 객체를 선언한다.
//		Calculator2 c = new Calculator2();
//		// ArrayList를 사용한다.
//		List<Number> n = new ArrayList<>();
//		c.addIntegers(n);
//		System.out.println(n);
		// ******************************************************************
		// 5. 제네릭 와일드 카드 : <?>
		// 특징 : 어떤 것이든 가능하며, 어떤 타입이 올지 모를 때 사용
		// List를 생성하겠습니다.
		List<String> names = List.of("Kim", "Lee"); // 리스트를 간단하게 생성
		List<Integer> numbers = List.of(10,20,30);
		wildcard.printList(names);
		wildcard.printList(numbers);
	}

}
class wildcard{
	// 제네릭 와일드 카드 : 배열의 값을 for문으로 출력
	public static void printList(List<?> list) {
		// for문으로 배열의 값을 하나씩 출력하겠다.
		for(Object item : list) {
			System.out.println(item);
		}
	}
}



class Calculator2{
	// 일반 클래스로 만들어준다.
	// Integer이거나 Integer보다 높은 클래스만 사용하겠다.
	public void addIntegers(List<? super Integer> list) {
		// list의 기능인 add를 사용해서 인덱스의 값을 추가하는 메서드
		list.add(10);
		list.add(20);
		
	}
}





class Calculator<T extends Number>{
	// 더하는 간단한 함수
	public double add(T a, T b) {
		// doubleValue() : Number 클래스에 정의된 메서드로 double 타입으로 변환
		return a.doubleValue() + b.doubleValue();
	}
	
}
	






class BoxMethod{
	// 제네릭 클래스가 아니라 제네릭 메서드를 사용하는 것이 목표
	// 1. static을 사용하지 않은 제네릭 메서드
	public <T> T echo(T item) {
		return item;
	}
	// 2. static을 사용한 제네릭 메서드
	public static <T> T echo2(T item) {
		return item;
	}
	
	
}



class Box<T>{
	// 제네릭 필드(변수) : private를 사용하지 않아도 사용에 지장이 없습니다.
	 T item;
	
	// 제네릭 매개변수 사용
	public void set(T item) {
		this.item = item;
	}
	
	// 제네릭 반환
	public T get() {
		return item;
	}
	
	
}


