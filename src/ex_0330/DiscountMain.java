package ex_0330;

import java.util.Scanner;

public class DiscountMain {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Discount d = new Discount();
		
		System.out.println("금액 입력: ");
		int price = sc.nextInt();
		
		double result = d.calculatePrice(price);
		System.out.println("할인 적용 금액: " + result + " 원");
		
		
	}
}
