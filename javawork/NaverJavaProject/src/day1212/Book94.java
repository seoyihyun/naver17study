package day1212;

import java.util.Scanner;

public class Book94 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 94페이지
		Scanner sc = new Scanner(System.in);
		
		int charCode = 'A'; //ASCII CODE
		
		if (charCode>=65 & charCode<=90)
			System.out.println("대문자");
		else if (charCode>=97 & charCode<=122)
			System.out.println("소문자");
		else
			System.out.println("숫자");
		
		
		int value = 6;
		
		if(value%2==3 | value%3==0)
			System.out.println("2 또는 3의 배수");
		
	}

}