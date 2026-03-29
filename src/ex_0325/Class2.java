package ex_0325;

public class Class2 {

	public static void main(String[] args) {
		// 두 개의 주사위를 던졌을때 , 두 눈의 합이 6이되는 모두의 경우의 수 출력하기
		// 1 5
		// 2 4
		// 3 3
		// 4 2
		// 5 1
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++){
				if(i + j == 6) {
					System.out.println(i+" " + j);
				}
			}
		}
		
		
	}

}
