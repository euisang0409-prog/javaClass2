package ex_0330;

import java.util.Scanner;

public class TimeFeemain {
	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        
	        System.out.print("사용 시간 입력: ");
	        int time = sc.nextInt();
	        
	        int total = calcFee(time);
	        
	        System.out.println("총 요금: " + total + "원");
	        
	}
}
