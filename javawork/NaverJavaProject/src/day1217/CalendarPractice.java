package day1217;

import java.sql.Date;
import java.util.Scanner;

public class CalendarPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 캘린더 만들기
		 * 년도와 월을 입력하면 해당 월의 달력을 출력하시오
		 * 달력이 제대로 나오게 하려면
		 * 1. 그 월의 1일이 무슨 요일인 지?
		 * 2. 그 월이 몇일까지 있는 지?
		 * 3. 윤년인 지?
		 */
		Scanner sc = new Scanner(System.in);
		int inputYear, inputMonth;
		int endDays; // 몇일까지 있는 지
		int weekDay; // 요일 숫자
		boolean leapYear;
		
		System.out.print("년도를 입력해주세요");
		inputYear = sc.nextInt();
		System.out.print("월을 입력해주세요 ");
		inputMonth = sc.nextInt();
		
		leapYear = inputYear%4==0 && inputYear%100!=0 || inputYear%400==0;

	}

}
