package day1216;

import java.util.Scanner;

public class Ex2Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 1~100 사이의 임의의 수 rnd를 발생 후
		 * 숫자 알아맞추기
		 * (예시)
		 * 1회 : 50 일 경우 50보다 큽니다 출력
		 * 2회 : 80 일 경우 80보다 작습니다 출력
		 * .
		 * .
		 * 6회 : 60 / 정답입니다 출력, 정답일 경우 프로그램 종료
		 */

		Scanner sc = new Scanner(System.in);
		int su, rnd, n=0;
		rnd = (int)(Math.random()*100)+1;
		
		while(true)
		{
		System.out.println(++n+"번째 숫자 입력");
		su = sc.nextInt();
		
		if (su<rnd)
			System.out.println(su+"보다 큽니다");
		else if (su>rnd)
			System.out.println(su+"보다 작습니다");
		else if (su==rnd)
		break;
		
		// else { print"정답입니다" break;}
		}
		System.out.println("정답입니다");
	}

}
