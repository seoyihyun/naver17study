package day1213;

import java.util.Scanner;

public class Ex12For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/* 문제 1
	 * 숫자 n을 입력하면 1부터 n까지의 합계를 구하시오 (for문 사용) 
	 */
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		int sum = 0;
		System.out.print("숫자를 입력하세요 : ");
		number = sc.nextInt();
		
		for(int i=1; i<=number; i++) { //1을 증가시키면서 입력한 넘버까지 반복해
//			sum += i++; // 3 입력 시 1과 4 나열
			sum = i++; // 3 입력 시 1과 3 나열
			System.out.print((int)sum);	
			}
	}
  }


