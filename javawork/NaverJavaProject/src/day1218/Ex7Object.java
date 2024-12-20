package day1218;

class Apple
{
	// 접근 지정자 생략 시 default가 되는데, 같은 패키지에서는 private을 제외하고 모두 직접 접근 가능
	static String message="Hello"; //class 멤버 변수 (왜냐면 class를 이용해서 선언하지 않고도 사용 가능)
	static final String EMP = "비트캠프"; // class 멤버 상수
	String name = "캔디"; //인스턴스 멤버 변수, 직접 바꾸는 케이스보단 메서드를 통해 변경함
	
}
// 컴파일 시 Apple.class 파일 생성
// 동일한 파일 내에서 더이상 Apple이라는 클래스는 생성할 수 없음
/////////////////////////////

public class Ex7Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다른 class의 static 변수는 class명.변수명으로 접근
		System.out.println("메세지 : "+Apple.message); 
		System.out.println("EMP : "+Apple.EMP);
		
		Apple.message = "Happy Day"; // final 변수는 값 변경이 가능하지만
		System.out.println("메세지 : "+Apple.message); 
//		Apple.EMP = "삼성전자"; final 상수는 값 변경이 불가함
		
		// 다른 class의 인스턴스멤버변수에 접근하려면 new로 생성된 인스턴스 변수가 본 class에 있어야 함
		Apple a = new Apple(); // new로 생성된 인스턴스 변수 -> 생성자!
		System.out.println("a 이름 : "+a.name);
		a.name = "미라"; // 값 새로 저장
		System.out.println("a 이름 : "+a.name);
		
		Apple b = new Apple();
		b.name = "영자";
		System.out.println("b 이름 : "+b.name);
		
	}

}
