package day1213;

import java.util.Scanner;

public class WhilePractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// While문 사용
		
		int i =65;
		while(i<=90) {
			System.out.printf("%c ", i++); // while문의 경우 {} 안에서 값을 출력해야 함
		}
		System.out.println();
		
		char b = 'a';
		do {
			System.out.print(b++ + " ");
		} while (b <='z');
		System.out.println();
		
		int n = 1;
		while (n<=10) {
			n++;
		if (n%2==0)
			continue;
			System.out.printf("%2d", n);
		}
	}
		
}
