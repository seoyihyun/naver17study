package day1220;

import day1220_2.Apple;

class Orange extends Apple {
	
	public void play() {
		this.job(); //public
		this.study(); //protected
//		this.draw(); -> 오류 발생(default : 패키지가 다를 경우 상관관계라 하더라도 접근 불가
		this.process(); //현재 클래스의 오버라이드 메서드 호출
	}
	
	@Override
	protected void process() { //더 넓은 범위로 허용
		// void process() : 오류
		// prinvate void process() : 오류
		// public void process() : 오류
		super.process();
		System.out.println("oracle, mysql 공부를 더 깊게 합니다");
	}
}

public class Ex4Inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Orange or = new Orange();
		or.play();
	
	}

}