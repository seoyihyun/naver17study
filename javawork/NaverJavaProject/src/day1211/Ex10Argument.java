package day1211;

public class Ex10Argument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<double형 Argument 값 읽기>");
		
		//3과목의 정수를 double형으로 변환
		//계산 안할거면 String도 노상관
		//계산하고 소수점까지 사용할거면 double 사용
		
		double score1=Double.parseDouble(args[0]);//String 타입을 double 타입으로 변환하는 class 함수
		double score2=Double.parseDouble(args[1]);
		double score3=Double.parseDouble(args[2]);
		double total=score1+score2+score3;
		double average=total/3; //printf 함수 사용 시 딱히 double로 안바꿔도 됨
		
		System.out.printf("점수1:%3.1f점\n", score1);
		System.out.printf("점수2:%3.1f점\n", score2);
		System.out.printf("점수3:%3.1f점\n", score3);
		System.out.printf("총점:%3.1f점\n", total);
		System.out.printf("평균:%3.1f점\n", average);

	}

}