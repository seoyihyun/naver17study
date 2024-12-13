package day1213;

public class Ex10For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=5; i++) // 3번째 위치에는 증감 또는 대입 연산자만 올 수 있음
			System.out.print(i + " "); // for문 안에서 실행(띄어o)
		System.out.println(); // for문 밖에서 실행(띄어x)
		
		for(int i=1; i<=10; i+=2)
			System.out.println(i + " ");
		System.out.println();
		
		for(int i=1; i<=5; i--)
			System.out.print(i + " "); // for문 안에서 실행(띄어o)
		System.out.println();
		
		for(int i=1; i<=100; i-=10)
			System.out.println(i + " ");
		System.out.println();
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + "");
			if(i==5)
				break;
		System.out.println();
		
		for(int i1=0; i1<=10; i1++)
			if(i1%2==1)
				continue;
			System.out.println(i + " ");
		System.out.println();
			
		}
	}
}
