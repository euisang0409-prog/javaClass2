package ex_0330;
public class MyStudy1 {

	//기본요금 : 10,000원(상수)
	// 추가요금 : 시간당 2,000원(상수)

	// 요금계산 메서드

	// 키보드에서 입력받아 총 금액 구하기
	
	final int BASE_FEE = 10000;
	final int TIME_FEE = 2000;
	
	public int calcFee(int time) {
		final int BASE_FEE = 10000;
		final int TIME_FEE = 2000;
		
		return BASE_FEE + (time * TIME_FEE);
	}
	
	
		 
		 
		
	
	
	
	
}
