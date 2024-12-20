package day1213;

import java.util.Scanner;

public class Ex7While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		// 다시 입력하면 정수 값이 없어짐
		
		int score, total = 0, count = 0; //정수 변수 선언, 점수는 초기값이 있어야 거따가 더할 수 있음
		double avg;
		
		while(true)
		{ 
			System.out.print("점수를 입력해주세요(종료 희망 시 0 입력):");
			// 첨부터 0 넣으면 평균 값 NaN 출력
			score = sc.nextInt();
			
			if (score<0 || score>100) {
				System.out.println("잘못 입력된 점수입니다");
				continue;
			}
			if (score==0) // if를 while문 밖에 넣으면 score 갯수가 입력수+1됨
				break;
			
			count++; 
			total+=score;
		}
		avg = (double)total/count; // while문 밖에서 코딩 : 종료된 건에 대한 평균을 구해야 함
		
		System.out.println("총 입력한 점수 갯수 : "+count+"개");
		System.out.println("점수의 총 합계 :"+total+"점");
		System.out.printf("점수들의 평균 :%5.2f점\n",avg);
		
	}

}
