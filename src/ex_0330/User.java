package ex_0330;

public class User {

//	User 클래스를 작성한다.
//	필드
//	- 문자열 : username
//	- 문자열 : password
//	- 문자열 : email
//
//	setter&getter를 이용해서 필드의 값을 세팅하거나 가져올 수 있다.
//	- username은 4글자 이상
//	ㄴ "아이디는 4글자 이상이어야 합니다"
//	- password는 6글자 이상
//	ㄴ " 비밀번호는 6글자 이상이어야 합니다.
//	- email은 @를 포함해야한다.
//	ㄴ "이메일 오류"
	
	private String username;
	private String password;
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		if(username.length() < 4) {
			System.out.println("아이디는 4글자 이상이여야 합니다.");
		}else {
			this.username = username;
		}
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password.length() < 6) {
			System.out.println(" 비밀번호는 6글자 이상이어야 합니다.");
		}else {
			this.password = password;
		}
		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(!email.contains("@")) {
			System.out.println("이메일 오류");
		}else {
			this.email = email;
		}
	}
		
	
	
	
	
	
}
