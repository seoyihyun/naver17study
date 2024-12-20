package day1216;

import java.util.Scanner;

public class Ex3Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 임의의 난수를 구한 후 숫자 알아맞추기
		 * 맞췄을 경우 "계속하시겠습니까?" 출력 및 y일 경우 새로운 난수 발생, 카운트 변수 0으로 초기화
		 * y가 아닐 경우 프로그램 종료
		 */
		
		Scanner sc = new Scanner(System.in);
		int su, rnd, count;
		
		Exit : // 레이블 / 레이블은 대소문자 상관없이 임의로 지정 후 콜론(:) 붙임
			while(true)
			{
				rnd = (int)(Math.random()*100)+1; // rnd(난수번호)에 대한 변수 선언
				count=0;
				while(true)
				{
					System.out.println((++count) +"번째 숫자 입력");
//					su = sc.nextInt(); //문자를 읽히게 하려면 nextLine을 사용 필요
					su = Integer.parseInt(sc.nextLine()); // 숫자를 문자로 바꿔주는 메서드 사용
					
					if (su<rnd)
						System.out.println(su+"보다 큽니다");
					else if (su>rnd)
						System.out.println(su+"보다 작습니다");
					else {
						System.out.println("정답입니다. 계속하려면 y, 그만하려면 n 입력");
						char ch = sc.nextLine().charAt(0);
						if (ch=='y' || ch=='Y')
						{
							System.out.println("새로운 난수를 발생합니다");
							break; //현재 속한 while문만 빠져나간다
//							continue Exit; //바깥쪽 반복문의 조건식으로 이동
						}
						else 
						{
							break Exit; //바깥쪽 while문을 빠져나간
						}
				}
			}
		}
		System.out.println("프로그램 종료");
	}
}

