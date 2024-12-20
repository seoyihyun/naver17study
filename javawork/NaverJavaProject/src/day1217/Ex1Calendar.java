package day1217;

import java.sql.Date;
import java.util.Scanner;

public class Ex1Calendar {

	public static void main(String[] args) {
		
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
		
		System.out.print("연도를 입력해주세요 ");
		inputYear = sc.nextInt();
		System.out.print("월을 입력해주세요 ");
		inputMonth = sc.nextInt();
		
		// 1~12월이 아닌 경우 프로그램 종료 처리하기
		if(inputMonth<1 || inputMonth>12)
		{
			System.out.println("잘못된 월입니다");
			return; //현재 메인 메서드 종료
		}
		
		// 윤년인 지 아닌 지 구하기
		leapYear=inputYear%4==0 && inputYear%100!=0 || inputYear%400==0;
		if(leapYear)
			System.out.println(inputYear+"년은 윤년입니다");
		else
			System.out.println(inputYear+"년은 평년입니다");
		System.out.println();
		
		// 입력한 년도와 월의 1일이 무슨 요일인 지 구하기
		Date inputDate = new Date(inputYear-1900, inputMonth-1, 1);
		weekDay = inputDate.getDay(); //0:일...6:토	
		
		// 해당 월이 몇일까지 있는 지 구하기
		switch(inputMonth)
		{
		case 2:
			endDays = leapYear?29:28;
					break;
		case 4: case 6: case 9: case 11:
			endDays=30;
			break;
		default :
			endDays=31;
		}
		// 달력 제목 출력하기
		System.out.println("=".repeat(50));
		System.out.println("\t\t["+inputYear+"년" +inputMonth+"월]");
		System.out.println("=".repeat(50));
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=".repeat(50));
		
		// weekDay 숫자만큼 탭 띄우기
		for(int i=1;i<=weekDay;i++)
			System.out.print("\t"); // \t을 한줄로 띄워야 함, ln을 쓰면 6줄이 띄워짐
		
		// 1일부터 endDays까지 출력 (토요일-index:6은 출력 후 줄바뀜)
		for(int i=1;i<=endDays;i++)
		{
			++weekDay; // 이렇게 증가하면 첫 토요일이 7, 그 다음부터 토요일이 7의 배수가 됨
			System.out.printf("%2d\t", i);
			if(weekDay%7==0)
				System.out.println();
		}

	}

}
