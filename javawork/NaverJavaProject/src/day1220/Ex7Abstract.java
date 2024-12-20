package day1220;

import java.util.List;
import java.util.Vector;

public class Ex7Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다형성 처리 예
		
		List<String> list = null; // 리스트에 스트링만 담겠다는 뜻
		list = new Vector<String>(); // 리스트를 구현할, 상속받은 클래스
		list.add("Red"); // add라는 오버라이드 메서드
		list.add("Green");
		
		for(String s : list)
			System.out.println(s);
		
		// 현재 할당된 크기를 알아보는 capacity() 라는 메소드는 Vector만이 갖고있다
		int n = ((Vector<String>)list).capacity(); // 다운캐스팅?
		System.out.println(n);

	}

} 
