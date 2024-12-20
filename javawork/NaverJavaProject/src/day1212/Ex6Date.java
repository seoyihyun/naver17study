package day1212;

import java.util.Date;

public class Ex6Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 현재 날짜와 시간을 얻어보자
		// Date 클래스는 jdk1.1 이후에 deprecate됨 - Calendar를 권장
		// 모든 클래스는 new로 생성
		// oracle java api에 기본형이 없으면 사용할 수 없음
		
		Date today = new Date();
		
		int curYear = today.getYear()+1900; //줄그음 : deprecate 되었다는 뜻, 실행 시 문제 없음
		// 메소드 자체가 1900을 반환하기 때문에 +1900 필요
		int curMonth = today.getMonth()-1;
		// 메소드 자체가 0~11로 구성,반환하기 때문에 -1 필요
		int curDate = today.getDate();
		int curHour = today.getHours();
		int curMinute = today.getMinutes();
		int curSecond = today.getSeconds();
		
		System.out.println("현재년도 : "+curYear);
		System.out.println("현재월 : "+curMonth);
		System.out.println("현재일 : "+curDate);
		System.out.println("현재시 : "+curHour);
		System.out.println("현재분 : "+curMinute);
		System.out.println("현재초 : "+curSecond);
		
		// 요일 숫자 구하기(0~6 : 일~토)
		int weekDay = today.getDay();
		System.out.println(weekDay);
		
		// 오늘은 목요일입니다 출력
		
		String week=weekDay==0?"일":weekDay==1?"월":weekDay==2?"화":weekDay==3?"수":weekDay==4?"목":weekDay==5?"금":"토";	
		System.out.println("오늘은"+week+"요일입니다");
		
		
		
		
		
	}

}
