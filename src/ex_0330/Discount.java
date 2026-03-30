package ex_0330;

public class Discount {
//	할인률을 결정하는 Discount클래스
//	할인률을 상수로 가지고 있다.
//	RATE_HIGHT = 0.2;
//	RATE_MID = 0.1;
//	RATE_LOW = 0.05;
//
//	금액에 따라서 할인률을 결정하는 disCountRate메서드 만들기
//	금액이 10만원 이상이면 0.2
//	5만원 이상이면 0.1
//	5만보다 적으면 0.05 적용
//
//	최종 금액을 계한하는 calculatePrice메서드 작성
//	- 할인률이 적용된 금액을 반환하세요
//
//	DiscountMain에서 금액을 키보드에서 입력받아서 할인 적용금액 구하기
	
	// 할인률
	final double RATE_HIGHT = 0.2;
	final double RATE_MID = 0.1;
	final double RATE_LOW = 0.05;
	
	public double disCountRate(int price) {
		if(price >= 100000) {
			return RATE_HIGHT;
		}else if(price >= 50000) {
			return RATE_MID;
		}else {
			return RATE_LOW;
		}
	}
	
		public double calculatePrice(int price) {
			double rate = disCountRate(price);
			return price * (1 - rate);
		}
	
	
	
}
