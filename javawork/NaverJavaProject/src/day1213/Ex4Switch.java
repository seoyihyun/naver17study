package day1213;

import java.util.Scanner;

public class Ex4Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("숫자를 입력해주세요");
		
		num = sc.nextInt();
		
		switch(num%2)
		{
		case 0: // num%2=0인 케이스
			System.out.println("짝수입니다");
			break;
		case 1: //num%2=1인 케이스
			System.out.println("홀수입니다");
		}
		
		// if문으로도 구현 가능
		if(num%2==1)
			System.out.println("홀수입니다");
		else
			System.out.println("짝수입니다");

	}

}