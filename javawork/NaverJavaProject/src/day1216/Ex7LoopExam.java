package day1216;

import java.util.Scanner;

public class Ex7LoopExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * 1. 지수 승 구하기 2. 팩토리얼 구하기 3. 원의 넓이 구하기 4. 종료
		 * while 반목문에서 위의 메뉴가 나오믄 번호를 입력하고 결과값을 출력하시오
		 * 메뉴는 switch문
		 * 
		 * 1번 : 두 수 x,y를 입력 후 x의 y승(for문 사용)을 구하시오
		 * 2번 : 숫자 n을 입력 후 n!값을 구하시오(for문 사용)
		 * 3번 : 반지름 r을 입력하면 원의 넓이를 구해서 출력(반지름*반지름*Math.PI)
		 * 그 외 값이 들엉면 "종료합니다" 출력 후 프로그램 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0, y = 0, result = 1; // 1번 변수
		int n = 1, fact = 1; // 2번 변수
		int r=0;
		double area = 0; // 3번 변수
		int menu; //번호 입력받을 변수
		
		Loop : 
		while(true)
			{
				System.out.println("메뉴를 선택하세요");
				System.out.println("1. 지수 승 구하기 2. 팩토리얼 구하기 3. 원의 넓이 구하기 4. 종료");
				menu = sc.nextInt();

			switch (menu)
			{
			case 1 :
				result = 1;
				System.out.println("x, y를 입력해주세요");
				x = sc.nextInt();
				y = sc.nextInt();
				for (int i=1; i<=y; i++)
					result *=x; // x의 y승
				
				System.out.println(x+"의" +y+"승은"+result+"입니다");
				break Loop;
			case 2 : 
				System.out.println("숫자 n을 입력해주세요");
				n = sc.nextInt();
				for (int i=1; i<=n; i++)
				{
					fact *= i;
				}
				System.out.println(n+"의 팩토리얼은 "+fact+"입니다");
				break Loop;
			case 3 : 
				System.out.println("반지름 r을 입력해주세요");
				r = sc.nextInt();
				for (int i = 1; i<=r; i++)
				{
					area = (r*r*Math.PI);
				}
				System.out.println("반지름이"+r+"인 원의 넓이는"+area+"입니다");
				break Loop;
			default : 
				System.out.println("프로그램을 종료합니다");
				break Loop;
			}
			}
	}

}
