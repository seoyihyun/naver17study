package day1219;
/*
 * 생성자?
 * 1. 객체 생성 시 자동 호출됨
 * 2. 리턴 타입이 없음(형식 [접근지정자 클래스명)
 * 3. 오버로딩(중복 함수) 가능(이름은 같고 파라미터가 달라서 여러개 올 수 있음)
 * 4. 생성자에서는 주로 멤버변수 초기화를 담당
 */

class Apple {
	Apple() { // 파라미터가 없는 생성자 = class명과 동일해야 함 = 디폴트 생성자
		System.out.println("디폴트 생성자");
	}
	Apple(String name) {
		System.out.println(name+"을 인자로 받음");
	}
	Apple(int age) {
		System.out.println(age+"을 인자로 받음");
	}
	Apple(String name, int age) {
		System.out.println(name+"과"+age+"을 인자로 받음");
	}
}

public class Ex3Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple a1 = new Apple(); // 생성자 자동 호출
		Apple a2 = new Apple("강씨");
		Apple a3 = new Apple(40);
		Apple a4 = new Apple("빨강", 23);

	}

}
