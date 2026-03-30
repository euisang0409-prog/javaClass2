package ex_0330;

import java.util.Scanner;

public class UserMain {
	public static void main(String[] args) {
		// 스캐너 방식 
		User u = new User();
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("아이디 입력");
			String uesrname = sc.next();
			
			u.setUsername(uesrname);
			 if(u.getUsername() != null) {
	                break;
	            }
		}
		
		// 비밀번호 입력
        while(true) {
            System.out.print("비밀번호 입력: ");
            String password = sc.next();

            u.setPassword(password);

            if(u.getPassword() != null) {
                break;
            }
        }
        
        // 이메일 입력
        while(true) {
            System.out.print("이메일 입력: ");
            String email = sc.next();

            u.setEmail(email);

            if(u.getEmail() != null) {
                break;
            }
        }
        // 최종 출력
        System.out.println("\n회원가입 완료!");
        System.out.println("아이디: " + u.getUsername());
        System.out.println("비밀번호: " + u.getPassword());
        System.out.println("이메일: " + u.getEmail());
		
//		u.setUsername("abc");	// 실패
//		u.setUsername("abcd"); // 성공
//		
//		u.setPassword("12345");		// 실패	 
//		u.setPassword("123456"); 	// 성공
//		
//		u.setEmail("easd qweqe");	// 오류
//		u.setEmail("easd@qweqe");	// 성공
//		
//		System.out.println("아이디 : " + u.getUsername());
//		System.out.println("비밀번호 : " + u.getPassword());
//		System.out.println("이메일 : " + u.getEmail());
		
		
		
		
		
		
	}
}
