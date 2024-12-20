package day1212;

import java.util.Scanner;

public class Ex12Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		/*
		 * 이름(name)과 java, html, spring의 3과목 점수를 입력받은 후
		 * 총점(sum)과 평균(avg), 등급(grade), 합격 여부를 출력하시오
		 * 
		 * 등급은 평균이 90 이상이면 "우등 장학생"
		 * 80 이상이면 "50프로 장학금
		 * 나머지는 "노력"이라고 출력
		 * 
		 * 합격 여부는 3과목이 50 이상이고 평균이 모두 70이상이면 "합격입니다"
		 * 나머지는 "불합격입니다" 라고 출력 (출력문에서 직접 조건연산자로 출력)
		 */
		
		Scanner sc = new Scanner(System.in);
		String name, grade;
		int java, html, spring, sum;
		double avg;
		
		System.out.println("java 점수를 입력해주세요");
		java = sc.nextInt();
		
		System.out.println("html 점수를 입력해주세요");
		html = sc.nextInt();
		
		System.out.println("spring 점수를 입력해주세요");
		spring = sc.nextInt();
		
		sum = java+html+spring; //(int)java + (int)html + (int)spring;
		avg = sum/3; //(double)java + (int)html + (int)spring;
		
		System.out.printf("당신의 평균은 "+"%5.1f점\n", avg);
		System.out.println((avg>=90?"우등 장학생":avg>=80?"50% 장학금":"노력")+"에 해당됩니다");
		
		grade = (int)java>=50 & (int)html>=50 & (int)spring>=50 & avg>=70?"합격입니다":"불합격입니다";
		
		System.out.println(grade);
		
		

	}

}
