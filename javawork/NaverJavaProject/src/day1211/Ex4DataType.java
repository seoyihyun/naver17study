package day1211;

public class Ex4DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2024;
		int month=12;
		int day=11;
		
		int year2=2024;
		int month2=5;
		int day2=3;
		
		//2024-12-11 형태로 출력
		System.out.println(year+"-"+month+"-"+day);
		
		//printf를 사용해서 위와같이 출력
		//정수:변환기호가 %d
		System.out.printf("%d-%d-%d\n",year,month,day);
		
		//2024-05-03
		System.out.println(year2+"-"+month2+"-"+day2);//2024-5-3
		System.out.printf("%d-%02d-%02d\n",year2,month2,day2);//%02d:오른쪽 정렬, 남는곳은 0표기, 2자리 출력
		System.out.printf("%5d-%05d-%05d\n",year2,month2,day2);
		System.out.printf("%d-%01d-%01d\n",year2,month2,day2);//2024-5-3
		System.out.printf("%d-%03d-%03d\n",year2,month2,day2);//2024-005-003
		
		int money=2346000;
		System.out.printf("이번달 급여=%10d원\n",money);//10자리 중 오른쪽정렬, 남는곳은 공백처리
		System.out.printf("이번달 급여=%-10d원\n",money);//10자리 중왼쪽정렬. 남는곳은 공백처리
		
		int money2=151060;
		System.out.printf("돈=%9d@@@원\n",money2);
		System.out.printf("돈=%-9d@@@원\n",money2);
		
		
		
	}

}
