package javaClass2.co.kr.Class7;

import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		// 목적 : 예외처리
		// 1. 배열의 범위를 벗어났을 때 발생하는 예외
//		int[] arr = {10,20,30};
		
//		// 예외 처리 try-catch
//		try {
//			// 예외가 발생할 것 같은 코드를 작성하는 공간
//			arr[40] = 10;
//			System.out.println(arr[4]);	
//		}catch(Exception e) {
//			// 예외가 발생했을 때 실행하는 공간
//			// 소괄호 안에는 발생할 것 같은 예외를 넣어주면 된다.
//			// 발생하는 예이, 그 예외 사용할 이름
//			System.out.println("배열 인덱스 오류 발생 : " + e);
//		}
		
		// 2. 잘못된 숫자를 변환할 때 : NumberFormatException
//		String input = "abc";
//		try {
//			int num = Integer.parseInt(input);
//		}catch(NumberFormatException e) {
//			// 형변환에 대한 예외가 발생했을 때 어떻게 처리할 것인가
//			System.out.println("형변환 오류 발생 : " + e);
//		}
		
		// 3. null 객체에 접근할 때 발생하는 오류 : NullPiointerException
//		String str = null;
//		try {
//			System.out.println(str.length());
//		}catch(NullPointerException e) {
//			System.out.println("Null 오류 발생 : " + e);
//		}
		
		// 4. 다중 catch문 구조 사용해기
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//			// (1) 숫자를 입력 받겠다. ( 문자를 입력하면 NumberFormatException )
//			System.out.println("배열 인덱스 입력 : ");
//			String input = sc.nextLine();
//			int index = Integer.parseInt(input);
//			// (2) 배열 범위 초과 ( 3보다 높은 수 입력시 ArrayIndexOutOfBoundesException )
//			
//			String[] arr = {"사과", "바나나", "포도"};
//			String value = arr[index];
//			System.out.println(value);
//			
//			// (3) Null에 접근 ( NullpointerException )
//			String str = null;
//			System.out.println(str.length());			
//		}catch(Exception e) {
//			System.out.println("오류가 발생하였습니다." + e);
//		}
//		catch(NumberFormatException e) {
//			System.out.println("숫자를 입력해야 합니다.");		
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열의 범위를 초과했습니다.");
//		}catch(NullPointerException e) {
//			System.out.println("null 값에 접근하였습니다.");
//		}
		// 다중 catch의 장점 : 각 오류별로 어떤 행동을 할 지 각각 정해줄 수 있다.
		// 다중 catch의 단점 : 무수히 많은 예외가 있다.
		// 발생하는 모든 예외 처리를 하면 코드가 매우 길어진다.
		// 모든 예외를 잡아주는 예외 : Exception
		
		// 5. try-catch-finally 구문을 사용하겠다.
		// finally : 예외 처리에 상관없이 무조건 실행되야 하는 코드
//		try {
//			// 예외가 발생할 가능성이 있는 코드를 적는 공간
//			int[] numbers = {1,2,3};
//			System.out.println("OutOf 발생 전");
//			numbers[4] = 10;
//			System.out.println("OutOf 발생 후");
//		}catch(Exception e) {
//			// 예외가 발생 했을 때 실행하는 코드를 적는 공간
//			System.out.println("배열 인덱스 오류 발생" + e);
//		}finally {
//			// 예외 발생 유무와는 상관없이 실행하는 코드 적는 공간
//			System.out.println("예외 상관 없이 출력");
//		}
		
		// 6. 예외 발생 내용 확인
//		try {
//			int[] num = {1,2,3};
//			num[4] = 10;
//			
//		}catch(Exception e) {
//			// (1). getStackTrace()[0]
//			System.out.println(e.getStackTrace()[0]);
//			// (2). toString : 예외 내용과 원인을 출력
//			System.out.println(e.toString());
//			// (3). getMessage() : 예외 발생 원인을 간단하게 출력
//			System.out.println(e.getMessage());			
//		}
		// 7. throw, throws
		// throw : 사용자가 직접 의도적으로 예외를 발생시킨다.
//		try {
//			throw new NullPointerException();
//		}catch(Exception e) {
//			System.out.println("에러 발생 " + e);
//		}
		// throws : 상위 메서드(호출한 위치)로 넘겨준다. 예외를 넘겨준다.
		// 메서드에서 사용하고있습니다.
		ExceptionExample ex = new ExceptionExample();
		try {
			ex.readArray(5);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 처리 : 배열 범위 초과");
		}
		// checked Exception
		// Unchecked Exception
		try {
			ExceptionClass.checkAge(15);
		}catch(InvalidAgeException e){
			System.out.println("예외 발생 : " + e);
		}
		
		
		
		
		
	}	
}

class ExceptionClass{
	// 나이를 확인해주는 사용자 정의 예외 메서드 사용
	// 일반적인 메서드를 작성할 것이다.
	public static void checkAhe(int age) throws InvalidAgeException{
		// throws를 사용한 이유 : 문서화
		if(age < 0) {
			throw new InvalidAgeException("나이는 음수가 될 수 없습니다.");
		}else if(age < 18) {
			throw new InvalidAgeException("미성년자는 접근할 수 없습니다. ")
		}
	}
}



// 내가 직접 작성한 사용자 정의 예외 클래스를 만들겠다.
class InvalidAgeException extends Exception{
	public InvalidAgeException(String msg) {
		super(msg);
	}
}


class ExceptionExample{
	int[] arr = {10,20,30};
	// 메서드를 만들겠다.
	public void readArray(int index) throws ArrayIndexOutOfBoundsException{
		// throws를 사용할 경우 실행한 곳으로 예외를 전달(던진다)한다.
		// 언체크 예외를 사용하는 이유는 문서화 목적이다. : 사용자에게 발생될 예외를 보여주기 위한 것
		System.out.println(arr[index]);
	}
}
