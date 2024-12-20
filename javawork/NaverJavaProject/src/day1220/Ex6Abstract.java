package day1220;

// 추상 클래스는 객체 생성을 할 수 없음
// 자식 클래스로 하여금 반드시 구현하게 할 목적으로 추상메서드를 생성함
// 만약 자식클래스가 추상메서드를 오버라이드하지 않았을 경우 그 클래스도 추상화 필요

// Abstract : 추상화(미완성)
// 부모가 process 에서 하는일이 없을 경우
// 그렇다고 안만들면 자식 클래스에서 오버라이드 불가
// 이럴 경우 미완성으로 선언만 하며, abstract 메서드로 만든다	
abstract class Parent2 {
	abstract public void process();

	protected abstract void study();
}

class Your1 extends Parent2 {
	@Override
	public void process() {
		super.process();
		System.out.println("벽지공사를 합니다");
	}
}

class Your2 extends Parent2 {
	@Override
	public void process() {
		super.process();
		System.out.println("타일공사를 합니다");
	}
}

public class Ex6Abstract {
	public static void youProcess(Parent2 p) {
		p.process();
		p.study(); // 부모가 가진 메소드는 호출 가능
//		p.draw(); // 오류 발생
//		p에 Your2가 생성되어있는 경우 오류 발생
		((Your1)p).draw(); // 다운 캐스팅 후 호출 필요
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		yourProcess(new Your1());
		System.out.println("================");
		yourProcess(new Your2());
		
		

	}

}
