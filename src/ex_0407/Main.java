package ex_0407;

public class Main {
	public static void main(String[] args) {
//		Student[] arr = new Student[3];
//	
//		arr[0] = new Student("철수", 80);
//		arr[1] = new Student("영희", 90);
//		arr[2] = new Student("민수", 70);
//		
//		int sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i].score;
//			arr[i].printInfo();
//		}
//		double avg = (double)sum / arr.length;
//		
//		Student topStudent = arr[0];
//		for(int i = 0; i < arr.length; i++) {
//			if(arr[i].score < topStudent.score) {
//				topStudent = arr[i];
//			}
//		}
//		System.out.println("최고 점수 학생: " + topStudent.name + ", 점수:" + topStudent.score);
//================================================================================================
//		Fruit[] arr = new Fruit[3];
//		
//		arr[0] = new Fruit("사과",10);
//		arr[1] = new Fruit("바나나",5);
//		arr[2] = new Fruit("오렌지", 8);
//		
//		
//		int sum = 0;
//		for(int i = 0; i < arr.length; i++) {
//			sum += arr[i].count;
//			arr[i].printInfo();
//		}
//		
//		System.out.println("총 합계 : " + sum+ "개");
//================================================================================================
		Animal[] arr = new Animal[3];
		arr[0] = new Animal("강아지", 3);
		arr[1] = new Animal("고양이", 5);
		arr[2] = new Animal("토끼", 2);
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i].age;
			arr[i].printInfo();
		}
		double avg = (double)sum / arr.length;
		System.out.println("전체 나이:" + sum+ "살");
		System.out.println("평균 나이: " + avg + "살");
		
		
	}
}
