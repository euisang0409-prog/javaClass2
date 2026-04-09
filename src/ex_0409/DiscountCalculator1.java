package ex_0409;

public class DiscountCalculator1 {
	public static void main(String[] args) {
	       int price = 10000;
	       String grade = "VIP";
	       int discountedPrice = 0;
	    
	       
	       // [A] 오류발생로직		
	       if(grade.equals("VIP")) {
	    	   discountedPrice = (int)(price * 0.8);
	       }else if(grade.equals("GOLD")) {
	    	   discountedPrice = (int)(price * 0.8);
	       }else {
	    	   discountedPrice = price; 
	       }
	 
	      System.out.println("최종 결제 금액: " + discountedPrice + "원");

	       // [B] 나머지 로직

	   }

}
