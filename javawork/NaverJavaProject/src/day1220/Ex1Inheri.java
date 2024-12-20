package day1220;

// 부모 클래스
class SuperObj1 {

	// 생성자 선언
	SuperObj1() {
		System.out.println("super 생성자");
	}

	SuperObj1(String msg) { // 파라미터를 받자 String msg
		System.out.println("super 메세지를 받는 생성자 "+msg);
	}

	SuperObj1(int score) {
		System.out.println("super 숫자를 받는 생성자 "+score);
	}
}

// 자식 클래스
class SubObj1 extends SuperObj1 { // extends를 사용했기 때문에 첫줄 super()가 생략되어있음
	SubObj1() {
		// super(); : 부모의 디폴트 생성자를 호출, 무조건 첫줄에 있어야 함
		System.out.println("sub 생성자");
	}
	SubObj1(String msg) {
		super(msg); // 파라미터가 있으면 생략 불가, 생략 시 첫번째 생성자를 받음
		System.out.println("sub의 두번째 생성자 ");
	}
	SubObj1(int score) {
		super(score);
		System.out.println("sub의 세번째 생성자");
	}

}

public class Ex1Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SubObj1 sub1 = new SubObj1(); // 상속관계면 부모,자식 모두 호출
		SubObj1 sub2 = new SubObj1("Hello");
		SubObj1 sub3 = new SubObj1(30);

	}

}
