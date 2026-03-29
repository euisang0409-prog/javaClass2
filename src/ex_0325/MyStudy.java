package ex_0325;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class MyStudy {

	public static void main(String[] args) {
		// 로또 만들기
		// 1 ~ 45 까지 6개 문장 중복x
		
//		int[]lotto = new int[6]; // 6개 숫자(방) 넣는 배열
//		outer:for(int i = 0; i < lotto.length; i++) { //--> 라벨(label) == outer--> 보통 break는 한 개 반복문만 종료함
//			lotto[i] = (int)(Math.random()*45)+1;  // 난수 1 ~ 45
//			// 중복이 있는지 검사
//			for(int j = 0; j < i; j++) {
//			if(lotto[i] == lotto[j]) {
//				// 다시 뽑기
//				continue outer;
//				}
//			}
//			System.out.print(lotto[i]+ " ");
//		}
//********************************************
		// 1 ~ 10 숫자 중에서 5개를 "중복 없이 뽑기
//		int[] arr = new int[5];
//		
//		outer:for(int i = 0; i < arr.length; i++) {
//			arr[i] = (int)(Math.random()*10)+1;
//			for(int j = 0; j < i; ++j) {
//				if(arr[i] == arr[j]) {
//					i++;
//					continue outer;
//				}
//			}
//				
//			System.out.print(arr[i] + " ");
//		}
//********************************************
		// 1 ~ 20 숫자 중 6개 뽑기 중복x
		// 그리고 총합까지 구하기
//		int[] arr = new int [6]; // 배열 만들기
//		int sum = 0; // 합
//		outer:for(int i = 0; i < arr.length; i++) {	// 배열확인
//			arr[i] = (int)(Math.random()*20)+1; // 난수
//				for(int j = 0; j < i; j++) {
//					if(arr[i] == arr[j]) {
//						i--;
//						continue outer; 
//					}		
//			}		
//				sum += arr[i];
//				System.out.print(arr[i] + " ");
//		}
		//********************************************
		// 문제 : 사용자 입력 6개 vs 랜덤 6ro 비교" 
		// 사용자 6개 숫자 입력
		// 랜덤 6개 숫자 생성 (중복 없이, 1 ~ 20)
		// 몇 개가 일치하는지 확인
		// 일치 숫자 출력 + 개수 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1~20 숫자 6개 입력 : "); 		// 방은 6개 만들었다.
//		int[] user = new int[6];
//		for(int i = 0; i < user.length; i++) {	// 키보드로 6숫자를 적어라
//			user[i] = sc.nextInt();		
//		}
//		
//		int[] lotto = new int[6];
//	outerLotto:for(int j = 0; j < lotto.length; j++) {
//			lotto[j] = (int)(Math.random()*20)+1;
//			
//			// 중복제거
//			for(int k = 0; k < j; k++) {
//				if(lotto[j] == lotto[k]) {
//					j--;	//중복제거
//					continue outerLotto; // 다시뽑기
//				}			
//			}							
//		}
//		// 랜덤 숫자 출력
//		System.out.println("랜덤 숫자 : ");
//		for(int n : lotto) {
//			System.out.print(n + " ");
//		}
//		System.out.println();
//		
//		// 일치 숫자 확인
//		int count = 0;
//		System.out.println("일치 숫자: ");
//		for(int i = 0; i < user.length; i++) {
//			for(int j = 0; j < lotto.length; j++) {
//				if (user[i] == lotto[j]) {
//					System.out.print(user[i] + " ");
//					count++;
//				}
//			}
//		}
//		System.out.print("\n맞은 개수: " + count);
		
		// 개어렵네
		
//		String str1 = "hello";
//		String str2 = "hello";
//		System.out.println(str1.equals(str2));
		
//		1. 키보드에서 입력받아 연속된 문자를 문자+개수 형태로 압축하기.
//		ex) aaabbc => a3b2c1
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("문자를 입력: ");
//		String str = sc.next();
//		
//		char prev = str.charAt(0);
//		int sum = 1;
//		for(int i = 1; i < str.length(); i++) {
//			char current = str.charAt(i);
//			if(prev == current) {
//				sum++;
//			}else {
//				System.out.print(prev +"" + sum);
//				prev = current;
//				sum = 1;
//			}
//		}
//		System.out.print(prev + "" + sum);
		
// 2. 다음 문자열에서 "프로그래밍"이라는 단어가 몇 번째 위치에 있는지 찾아 출력하시오. 
//		만약 단어가 없으면 "찾을 수 없음"을 출력하세요.
//		String text = "나는 자바 프로그래밍을 공부합니다.";
		
//		String text = "나는 자바 프로그래밍을 공부합니다.";
//		int result = text.indexOf("프로그래밍");
//		if(result == -1) {
//			System.out.println("찾을수 없음");
//		}else {
//			System.out.println(result + "번째 위치");
//		}
		
//		3. 영어 문장을 하나 입력받고, 이 문장의 모음의 개수를 센 뒤, 모음이 각 단어마다 몇 개 들어있는지 확인하는 코드를 작성하시오.
//	    1. toCharArray(), toLowerCase(), split(’ ’)을 이용하는 것이 좋습니다.
//	    2. 여기서 의미하는 ‘단어’는 띄어쓰기로 구분되는 단위를 말합니다.
//	(ex.)There is a cat → There, is, a, cat

//		Scanner sc = new Scanner(System.in);
//		System.out.println("영어 문자 입력");
//		String text = sc.nextLine();
//		
//		text = text.toLowerCase();
//		int total = 0;
//		char[] arr = text.toCharArray();
//		
//		for(int i = 0; i < arr.length; i++) {
//			char ch = arr[i];
//			
//			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//				total++;
//			}
//			
//		}
//		
//		System.out.println("전체 모음 개수 : " + total);
//		
//		// 단어 나누기
//		String[] words = text.split(" ");
//		
//		// 단어별 모음 개수
//		for(int i = 0; i < words.length; i++) {
//			int count = 0;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		String text = sc.nextLine().toLowerCase();
//
//		int total = 0;
//
//		for(String word : text.split(" ")) {
//		    int count = 0;
//		    
//		    for(char ch : word.toCharArray()) {
//		        if("aeiou".indexOf(ch) != -1) {
//		            total++;
//		            count++;
//		        }
//		    }
//		    
//		    System.out.println(word + " : " + count);
//		}
//
//		System.out.println("전체 모음 개수: " + total);
		
//		4. 이메일을 입력하면 아이디와 도메인을 나눠 정리해서 보여주는 코드
//		- 조건 : String[], split("@") 사용
//
//		- 결과 예시1
//		이메일을 입력해주세요.
//		> java1234@gmail.com

//		Scanner sc = new Scanner(System.in);
//		System.out.println("이메일을 입력해주세요");
//		String email = sc.nextLine();
//		
//		String[] arr = email.split("@");
//		
//		System.out.println("아이디 : " + arr[0]);
//		System.out.println("도메인 : " + arr[1]);
		
//		5. 입력받은 10개의 문자열의 아스키 코드들을 전부 더한 값을 구해라.
//		- 입력한 문자열의 소문자/대문자를 구분해야 한다.
		
		Scanner sc = new Scanner(System.in);	
		String[] arr = new String[10];
		
		System.out.println("문자열 10개 입력:");
		
		
		
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextLine();
		}
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			char[] charr = arr[i].toCharArray();
			
			for(int j = 0; j < charr.length; j++) {
				sum += charr[j]; // 아스키 코드 더하기
			}
		}
		
		System.out.println("아스키 코드 총합: " + sum);
		
	}

}
