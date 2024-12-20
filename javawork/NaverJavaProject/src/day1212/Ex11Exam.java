package day1212;

import java.util.Date;
import java.util.Scanner;

public class Ex11Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 년 year 월 month 일 day를 입력 후
		 * 해당 날짜에 대한 Date 클래스 생성(myDate)
		 * 후 myDate를 이용해서 년도 월 일 요일(week)을 구해서 출력
		 * 
		 * 요일은 요일숫자(weekNum)를 먼저 얻은 후 요일을 구해서 출력
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int year, month, day, weekday;
		String week;
		Date myDate = new Date();
		
		System.out.println("해당년도를 입력하세요");
		year = sc.nextInt();
		
		System.out.println("해당 월을 입력하세요");
		month = sc.nextInt();
		
		System.out.println("해당 일을 입력하세요");
		day = sc.nextInt();
		
		System.out.println(year+"-"+month+"-"+day+"입니다");
		
		// 입력한 날짜에 대한 Date 클래스 생성
		
		myDate = new Date(year-1900, month-1, day);
		int weekNum = myDate.getDay(); // 요일 숫자
		
		System.out.println("년도 :"+(myDate.getYear()+1900));
		System.out.println("월 :"+(myDate.getMonth())+1);
		System.out.println("일 :"+(myDate.getDate()));
		
		System.out.println((weekNum==0?"일":weekNum==1?"월":weekNum==2?"화":
			weekNum==3?"수":weekNum==4?"목":weekNum==5?"금":"토")+"요일입니다");
		
		
	
		
	}

}
