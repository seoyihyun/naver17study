package day1218;

public class Ex6Object {
	
	// 멤버 변수나 상수를 선언하는 영역
	// 여러 객체가 사용하는 변수
	
	// 필드 선언
	static int x=10; // static 변수는 인스턴스 변수 없이도 접근 가능
	static int y=20;
	
	// 메서드도 static으로 만들기
	// void는 아무것도 없다는 뜻?
	public static void  showTitle()
	{
		System.out.println("studying class");
		System.out.println("static 변수는 접근 가능 :"+x+","+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// static 변수는 클래스 명으로 접근
		System.out.println("x="+Ex6Object.x);
		// 같은 클래스의 멤버일 경우에는 클래스명 생략 가능
		System.out.println("x="+x);
		
		// static 변수 x와 y 더하기
		int sum = x+y;
		System.out.println("sum = "+sum);

		// staic 메서드 호출
		Ex6Object.showTitle();
		showTitle(); // 같은 class 멤버 메서드일 경우 class명 생략 가능
	}

}
