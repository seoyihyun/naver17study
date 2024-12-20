package day1217;

import java.util.Scanner;

public class Ex8ArrayAlpha {

	public static void main(String[] args) {
		/*
		 * 영어 문장을 입력하면 알파벳을 분석해서 각 알파벳의 갯수를 구하시오
		 * (대소문자 상관 없음)
		 */
		
		Scanner sc = new Scanner(System.in);
		String message;
		int []alpha = new int[26];
		
		System.out.println("영어 문장을 입력하세요");
		message = sc.nextLine();
		
		// 글자 수만큼 반복
		for(int i=0; i<message.length();i++)
		{
			// 한 글자씩 얻기
			char ch = message.charAt(i); // charAt를 저장해
			// 대문자인 경우 'A'를 뺀 번지수에 1 증가
			if (ch>='A' && ch<='Z') // 그리고 조건에 맞게 알파벳 카운트를 증가시켜
				alpha[ch-'A']++;
			else if(ch>='a' && ch<='z')
				alpha[ch-'a']++;
		}
		// 출력하기
		for(int i=0; i<alpha.length;i++) //
		{
			System.out.printf("%c:%d개\t", 'A'+i, alpha[i]); // %c='A'+i
			// System.out.print((char)('A'+i)+":"+alpha[i]+"개\t");
			// 한 줄에 4개씩만 출력하는 조건 
			if((i+1)%4==0)
				System.out.println();
		}

	}

}
