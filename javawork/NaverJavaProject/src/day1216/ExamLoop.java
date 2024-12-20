package day1216;

import java.util.Scanner;

public class ExamLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * 문자열 str을 입력 후 엔터를 누르면 
		 * 문자열을 분석해서 대문자, 소문자, 숫자 각각의 갯수를 출력하시오
		 * 
		 * 사용할 문자 메서드 : length(), charAt(인덱스)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int upperCount=0, lowerCount=0, numberCount = 0; // 대문자 갯수, 소문자 갯수, 숫자 갯수에 대한 변수 선언
		String str; 
		
		System.out.println("문자열을 입력하세요");
		str = sc.nextLine();
		
		for (int i=0; i<str.length(); i++) // i가 str의 길이보다 작을때까지 카운트해라
		{
			char ch = str.charAt(i); // 캐릭터가
			if(ch>='A' && ch<='Z') // 대문자면 (아스키코드 값으로 작성해도 됨)
				upperCount++; // 대문자 갯수로 세고
			else if (ch>='a' && ch<='z') // 소문자면
				lowerCount++; // 소문자 갯수로 세고
			else if (ch>='0' && ch<='9') // 숫자범위 내에 있으면
				numberCount++; // 숫자 갯수로 세고
		}

		System.out.println("대문자 갯수 : "+upperCount);
		System.out.println("소문자 갯수 : "+lowerCount);
		System.out.println("숫자 갯수 : "+numberCount);
		
	}

}
