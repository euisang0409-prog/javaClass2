package ex_0325;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		System.out.println("1~20 숫자 6개 입력 : "); 		// 방은 6개 만들었다.
		int[] user = new int[6];
		for(int i = 0; i < user.length; i++) {	// 키보드로 6숫자를 적어라
			user[i] = sc.nextInt();		
		}
		
		int[] lotto = new int[6];
	outerLotto:for(int j = 0; j < lotto.length; j++) {
			lotto[j] = (int)(Math.random()*20)+1;
			
			// 중복제거
			for(int k = 0; k < j; k++) {
				if(lotto[j] == lotto[k]) {
					j--;	//중복제거
					continue outerLotto; // 다시뽑기
				}			
			}							
		}
		// 랜덤 숫자 출력
		System.out.println("랜덤 숫자 : ");
		for(int n : lotto) {
			System.out.print(n + " ");
		}
		System.out.println();
		
		// 일치 숫자 확인
		int count = 0;
		System.out.println("일치 숫자: ");
		for(int i = 0; i < user.length; i++) {
			for(int j = 0; j < lotto.length; j++) {
				if (user[i] == lotto[j]) {
					System.out.print(user[i] + " ");
					count++;
				}
			}
		}
		System.out.print("\n맞은 개수: " + count);
		
		// 개어렵네
		
		
		
	}

}
