package day1220;

class Parent1 {
	public void process() {
		System.out.println("기본 작업을 한다");
	}
}
class My1 extends Parent1 {
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("벽지 작업을 한다");
	}
}
class My2 extends Parent1 {
	@Override
	public void process() {
		// TODO Auto-generated method stub
		super.process();
		System.out.println("바닥 작업을 한다");
	}
}

public class Ex5Inheri {
	
	public static void homeProcess1(My1 my) { // My1만 처리 가능
		my.process();
	}
	public static void homeProcess2(My1 my) { // My2만 처리 가능
		my.process();
	}
	
	public static void homeProcessAll(Parent1 p) { // My1, My2 둘다 처리 가능
		p.process(); // p 안에 누가 생성되어있느냐에 따라 서로 다른 일을 처리
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		My1 my1 = new My1();
		my1.process();
		
		My2 my2 = new My2();
		my2.process();
		
		System.out.println("================");
		
		homeProcess1(my1);
		homeProcess2(my1);
		
		// 다형성 처리
		Parent1 p1 = null;
		p1 = new My1();
		p1.process(); // My1이 가진 process 메소드가 호출
		
		p1 = new My2();
		p1.process(); // My2이 가진 process 메소드가 호출
		
		System.out.println("================");
		
		homeProcessAll(my1);
		homeProcessAll(my2);		
		
		


	}


}
