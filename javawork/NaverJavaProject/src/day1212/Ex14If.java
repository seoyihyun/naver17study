package day1212;

import java.util.Scanner;

public class Ex14If {

	public static void main(String[] args) {
		// void : 리턴 사용 시 메인 메서드 종료

		Scanner sc = new Scanner(System.in);
		
		int score;
		String grade;
		
		System.out.println("점수를 입력해주세요");
		score = sc.nextInt();
		
// 점수가 0~100의 값을 벗어나면 메서드를 종료
// 방법 1
		
		if(!(score>=0 && score<=100)) // 0과 100 사이가 아닐 경우
		{
			System.out.println("값의 범위를 벗어났습니다");
			return; //현재 메서드 종료
		}
		
//		if(score<0 || score>100); :0보다 작거나 100보다 큰 값일 경우
//		{
//			System.out.println("값의 번위를 벗어났습니다");
//			return;
//		}
	
		if(score>=90 & score<101)
			grade = "A";
		else if(score>=80 & score<90)
			grade = "B";
		else if(score>=70 & score<80)
			grade = "C";
		else if(score>=60 & score<70)
			grade = "D";
		else
			grade = "F";
		
		System.out.printf("%d 점의 학점은 %s 입니다", score, grade);
	}

}
