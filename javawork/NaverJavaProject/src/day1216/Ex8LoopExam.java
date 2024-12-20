package day1216;

import java.util.Scanner;

public class Ex8LoopExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * 이름을 입력하면 그 중 "김"씨 성을 가진 사람의 인원 수
		 * "이"씨 성을 가진 사람의 인원 수
		 * 그 이외의 인원 수를 각각 구하여 출력하시오
		 * (While문 사용, 빠져나가는 코드 : "끝")
		 * 사용할 문자열 메소드 : startsWith, equals
		 */

		Scanner sc = new Scanner(System.in);
		String names;
		int KimCount=0, LeeCount=0, OtherCount=0;
		
		while(true)
			{
			System.out.print("이름을 입력하세요 : ");
			names = sc.nextLine();
			
			if (names.equals("끝"))
				break;
			if(names.startsWith("김"))
				KimCount++;
				else if(names.startsWith("이"))
				LeeCount++;
				else 
				OtherCount++;
			}
			
			System.out.println("김씨는 "+KimCount+" 명입니다");
			System.out.println("이씨는 "+LeeCount+" 명입니다");
			System.out.println("김씨, 이씨 외 성씨는 "+OtherCount+" 명입니다");
	}

}

