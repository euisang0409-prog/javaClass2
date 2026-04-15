package ex_0415;

import java.util.Scanner;



public class Basics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int[] arr = new int[5];
//		System.out.println("점수 입력:");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		int max = arr[0];
//		int min = arr[0];
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];
//			}else if(arr[i] < min) {
//				min = arr[i];
//			}
//		}
//		System.out.println("최댓값:" + max);
//		System.out.println("최소값:" + min);
		
//		int[] arr = new int[5];
//		System.out.println("점수 입력:");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i];
//		}
//		double avg = (double)sum / arr.length;
//		System.out.println("평균:" + avg);
//		System.out.println("평균이상: ");
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] >= avg) {
//				System.out.println(arr[i] + " ");
//			}
//		}
//		
//		int[] arr = new int[5];
//		System.out.println("점수 입력:");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		int max = Integer.MIN_VALUE;
//		int second = Integer.MIN_VALUE;
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] > max) {
//				second = max;
//				max = arr[i];	
//			}else if(arr[i] > second) {
//				second = arr[i];
//			}
//			
//			
//		}
//		
//		System.out.println("1등:" + max);
//		System.out.println("2등:" + second);
	
//		int[] arr = new int[5];
//		System.out.println("점수 입력:");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//	
//		for(int i = 0; i < arr.length; i++) {
//			 int rank = 1;
//			 
//			 for(int j = 0; j < arr.length; j++) {
//				 if(arr[j] > arr[i]) {
//					 rank++;
//				 }
//			 }
//			 
//			 System.out.println(arr[i] + " -> " + rank + "등"); 
//		}
				
//		int[] arr = new int[5];
//		System.out.println("점수 입력:");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//			int rank = 1;
//			
//			for(int j = 0; j < arr.length; j++) {
//				if(arr[j] > arr[i]) {
//					rank++;
//				}
//				
//			}
//			
//			System.out.println(arr[i] + "->" + rank + "등");
//		}
		
//		int[] arr = new int[5];
//		System.out.println("점수 입력:");
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
		
//		int max = Integer.MIN_VALUE;
//		
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i] > max) {
//				max = arr[i];			
//			}
//		}
//		
//		for(int i = 0; i < arr.length; i++) {
//		    if(arr[i] == max) {
//		    	System.out.println("1등: " + arr[i]);
//		    }
		
		int[] arr = new int[5];
		System.out.println("점수 입력:");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == max) {
				count++;
			}
		}
		
		System.out.println("1등:" + max);
		System.out.println("1등 개수 :"+ count);
		
		
		
		
		
		
		
		
		
	}
}
