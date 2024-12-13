package day1213;

import java.util.Scanner;

public class Ex9While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1글자씩 입력하다가 x(대소문자 상관없이)를 입력하면 빠져나와서
		 * 입력한 데이터들을 분석한 결과를 출력하시오
		 * 예시)
		 * 대문자 : 3
		 * 소문자 : 4
		 * 숫자 : 3
		 */

		Scanner sc = new Scanner(System.in);
		char ch; //한글자씩 입력
		int upper=0, lower=0, number=0; //증감연산자라 변수에 초기 값 설정(0) 필요
		
		while (true) { //언제까지 반복할 지 모르니까 while(true) 사용
			System.out.println("1글자를 입력하세요(종료:x)");
			ch = sc.nextLine().charAt(0); //입력한 맨 첫글자만 인식
			
			if(ch=='x' || ch=='X')
				break; // x나 X를 입력하면 멈추고 While문 밖의 코드대로 출력해
			
//			if(ch>='a' && ch<='z')
//				lower++; // 0에서부터 ++한다
//			else if(ch>='A'&& ch<='Z')
//				upper++;
//			else if(ch>='0'&& ch<='9')
//				number++;
		} 
		System.out.println("대문자 :"+upper);
		System.out.println("소문자 :"+lower);
		System.out.println("숫자 :"+number);
	}

}
