package basics;

import java.util.Scanner;

public class Basics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("정수 입력:");
//		int num = sc.nextInt();
//		if(num % 2 == 1) {
//			System.out.println("홀수");
//		}else {
//			System.out.println("짝수");
//		}
		
//		System.out.println("입력한 수: ");
//		int num = sc.nextInt();
//		if(num > 0) {
//			System.out.println("양수");
//		}else if(num == 0) {
//			System.out.println("0");
//		}else  {
//			System.out.println("음수");
//		}
//		System.out.println("입력한 수: ");
//		int num = sc.nextInt();
//		if(num % 3 == 0) {
//			System.out.println("3의 배수");
//		}else {
//			System.out.println("3의 배수 아님");
//		}
//		System.out.println("입력한 수: ");
//		int num = sc.nextInt();
//		if(num % 4 == 0 && num % 5 == 0) {
//			System.out.println("4와 5의 공배수");
//		}else if(num % 4 == 0){
//			System.out.println("4의 배수");
//		}else if(num % 5 == 0) {
//			System.out.println("5의 배수");
//		}
//			System.out.println("점수 입력");
//			int num = sc.nextInt();
//			if(num >= 90) {
//				System.out.println("A");
//			}else if(num >=80) {
//				System.out.println("B");
//			}else if(num >=70 ) {
//				System.out.println("C");
//			}else if(num >=60 ) {
//				System.out.println("D");
//			}else {
//				System.out.println("F");
//			}
		
//		String correctid = "admin";
//		String correctps = "1234";
//		
//		System.out.println("아이디 입력:");
//		String inputid = sc.next();
//		
//		System.out.println("비밀번호 입력:");
//		String inputps = sc.next();
//		
//		if(!inputid.equals(correctid)) {
//			System.out.println("아이디가 존재하지 않습니다.");
//		}else if(!inputps.equals(correctps)) {
//			System.out.println("비밀번호 오류입니다.");
//		}else {
//			System.out.println("로그인 성공");
//		}
		
//		String id = "user1";
//		String ps = "abcd";
//		
//		System.out.println("아이디 입력: ");
//		String inputid = sc.next();
//		
//		System.out.println("비밀번호 입력: ");
//		String inputps = sc.next();
//		
//		if(!inputid.equals(id)) {
//			System.out.println("아이디 없음");
//		}else if(!inputps.equals(ps)) {
//			System.out.println("비밀번호 틀림");
//		}else {
//			System.out.println("로그인 성공");
//		}
		
//		int [] arr = new int [5];
//		
//		System.out.println("점수 입력: ");
//		
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//		 	 arr[i] = sc.nextInt();
//		 	 sum += arr[i];
//		}
//		
//		double avg = (double)sum / arr.length;
//		System.out.println("합:" + sum);
//		System.out.println("평균" + avg);
		
//		int[] arr = new int [5];
//		System.out.println("점수 입력:");
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			sum += arr[i];
//		}
//		
//		double avg = (double)sum / arr.length;
//		System.out.println("합:" + sum);
//		System.out.println("평균: " + avg);
		
		int[] arr = new int[5];
		
		int max = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(i == 0) {
				max = arr[i];
			}else if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("최대값: " + max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
