package basics_0414;

import java.util.Scanner;

public class Basics {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//
//		int[] arr = new int[5];
//		System.out.println("점수 입력:");
//		arr[0] = sc.nextInt();
//		int max = arr[0];
//		int min = arr[0];
//		int sum = 0;
//		sum += arr[0];
//		for(int i = 0; i < arr.length; i++) {
//			 
//			if(arr[i] > max) {
//				max = arr[i];
//			}
//			if(arr[i] < min) {
//				min = arr[i];
//			}		
//		}
//		double avg = (double)sum / arr.length;
//		
//		System.out.println("최댓값: " + max);
//		System.out.println("최솟값: " + min);
//		System.out.println("평균: " + avg);
		
//	
//		System.out.println("점수 입력:");
//		int even = 0;
//		int odd = 0;	
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		if(arr[i] % 2 == 0) {	
//			even++;
//		}else  {
//			odd++;
//		}
//		}
//		System.out.println("짝수 개수: " + even);
//		System.out.println("홀수 개수: " + odd);
		
//		int[] arr = new int[5];
//		System.out.println("점수 입력:");
//		int max = arr[0];
//		for(int i = 0; i < arr.length; i++) {
//		    arr[i] = sc.nextInt();
//		    sum += arr[i];
//		}
//			double avg = (double)sum / arr.length;
//			
//			int count = 0;
//			for(int i = 0; i < arr.length; i++) {
//			    if(arr[i] > avg) {
//			        count++;
//			    }
//			}
//			System.out.println("평균보다 큰 값 개수: " + count);
		
//		int[] arr = new int[5];
//		System.out.println("점수 입력:");
//		
//		int index = 0;
//		
//		arr[0] = sc.nextInt();
//		int max = arr[0];
//		
//		for(int i = 1; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			
//			if(arr[i] > max) {
//				max = arr[i];
//				index = i;
//			}
//		}
//		System.out.println("최대값: " + max);
//		System.out.println("위치 : " + index);
		
		
//		int[] arr = new int [5];
//		System.out.println("점수입력:");
//		
//		int index = 0;
//		arr[0] = sc.nextInt();
//		int max = arr[0];
//		for(int i = 1; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			if(arr[i] > max) {
//				max = arr[i];
//				index = i;
//			}
//		}
//		
//		System.out.println("최대값: " + max);
//		System.out.println("위치 : " + index);
		
//		int[] arr = new int[5];
//		System.out.println("점수입력:");
//		
//		int index = 0;
//		int count = 1;
//		arr[0] = sc.nextInt();
//		int max = arr[0];
//		for(int i = 1; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//			
//			if(arr[i] > max) {
//				max = arr[i];
//				index = i;
//				count = 1;
//			}else if(arr[i] == max) {
//				count++;
//			}
//			
//		}
//		
//		System.out.println("최대값: " + max);
//		System.out.println("위치 : " + index);
//		System.out.println("개수 : " + count);
		
		int[] arr = new int[5];
		System.out.println("점수 입력:");
		
		arr[0] = sc.nextInt();
		int max = arr[0];
		int second = Integer.MIN_VALUE;
		for(int i = 1; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
			if(arr[i] > max) {
				second = max;
				max = arr[i];
			}else if(arr[i] > second && arr[i] != max) {
				second = arr[i];
			}
		}
		
		System.out.println("두 번재로 큰 값:" + second);
		
		
		
		
	}
	
}
