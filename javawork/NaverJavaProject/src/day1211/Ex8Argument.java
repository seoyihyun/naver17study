package day1211;

public class Ex8Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아규먼트는 1번 외부 실행 후 가져올 수 있음
		
		System.out.println("<외부 값 읽어오기>");
		String name=args[0];
		String city=args[1];
		int birthYear=Integer.parseInt(args[2]);//Stirng형태의 년도를 정수 타입으로 변환		
		int age=2024-birthYear;
		
		//두 과목의 점수 읽기
		int kor=Integer.parseInt(args[3]);//Stirng을 숫자로 변환 - integer 사용
		int eng=Integer.parseInt(args[4]);
		int total=kor+eng;
		double average=total/2.0;
		//int+double=double, int+int=int -> double로 출력할 경우 하나는 double로 변경해야 함
		//total = int, 2.0 = double, 2 = int
		//모두 int일 경우는오른쪽처럼 처리 :double average = (double)total/2;
		
		System.out.println("이름:"+name);
		System.out.println("지역:"+city);
		System.out.println("출생년도:"+birthYear+"나이:"+age+"세");
		System.out.println("국어점수:"+kor+"점");
		System.out.println("영어점수:"+eng+"점");
		System.out.println("총점:"+total+"점");
		System.out.println("평균:"+average+"점");
		
		String day=args[5];
		String hour=args[6];
		
		System.out.println("일주일에 "+day+"일 "+"하루에 "+hour+"시간");
	
	}

}