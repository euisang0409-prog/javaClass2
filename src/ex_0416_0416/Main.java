package ex_0416_0416;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<>();
		
		list.add(new Member("hong", "홍길동", 20));
		list.add(new Member("gong", "공길동", 40));
		list.add(new Member("lee", "이영희", 15));
		
		for(Member m : list) {
			m.printInfo();
		}
		
		int count = 0;
		for(Member m : list) {
			if(m.getAge() >= 20) {
				count++;
			}
			
		}
		
		System.out.println("나이가 20세 이상:" + count);
		
	}
}
