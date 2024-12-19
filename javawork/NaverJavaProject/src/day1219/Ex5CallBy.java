package day1219;
//CallByValue : 인자전달방식, 값만 전달(기본형, String)
// CallByReference : 주소가 전달됨(모든 객체, 배열 타입)
// 3. 주소 전달이 안되니 Test Class를 만들자, class는 무조건 주소를 전달함
class Test {
	String message;
	int code;
}
public class Ex5CallBy {
	// 1. 다른 주소 신규 생성, main에 영향을 주지 않음
	public static void changeInt(int n) { 
		n=200;
	}
	public static void changeString(String s ) {
		s = "Apple";
	}
	// 4. changeTest 생성?, main에 영향을 줌 = 주소를 통해 직접 값을 넣을 수 있음
	public static void changeTest(Test t) {
		t.message = "Happy";
		t.code = 100;
	}
	// 6. 어레이 받기
	public static void changeArray(int []arr) {
		arr[1] = 20;
	}
	// 8. 클래스 안만들거고 main에서 변경값 받고싶어 = 리턴 쓰자
	public static int changeScore(int score) {
		if(score>=80)
			return score;
		else
			return 90;
	}
	public static void main(String[] args) {
		// 2. 값만 전달되기 때문에? 200이 아니라 100이 출력됨
		int n=100;
		changeInt(n);
		System.out.println("n="+n); 

		String s="orange";
		changeString(s);
		System.out.println("s="+s);
		// 5. 변경된 값으로 출력
		Test t = new Test();
		System.out.println("메세지:"+t.message+" 코드 :"+t.code); 
		
		// 7. 배열이 들어가면 레퍼런스 타입으로 변경됨, 그럼 주소가 전달되서 값에 영향을 줌
		int [] a = {1,2,3}; // 7. 배열이 들어가면 레퍼런스 타입으로 변경됨
		changeArray(a); 
		for(int aa: a)
			System.out.print(aa+" "); 
		
		// 9. 리턴 썼더니 값이 변경되서 출력됨
		int score = 80;
		score = changeScore(score);
		System.out.println("score = "+score);


	}

}

