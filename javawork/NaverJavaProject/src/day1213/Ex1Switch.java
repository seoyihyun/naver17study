package day1213;

public class Ex1Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 케이스에 따른 메소드 호출하는 클래스
		
		int n=4;
		
		switch(n) {
		case 1:
			System.out.println("one");
			break; // 변수에 해당하는 값만 출력하고 다른 케이스는 출력하지 않기 위해 모든 케이스에 추가
		case 2: // case와 순번 사이를 띄워야 오류 빈도수가 적어짐
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("other number");
			
		}
		

	}

}
