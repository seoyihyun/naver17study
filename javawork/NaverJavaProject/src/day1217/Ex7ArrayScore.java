package day1217;

import java.util.Scanner;

public class Ex7ArrayScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 인원수를 입력 후 그 인원 수만큼의 이름과 점수를 입력하고
		 * 등수, 총점, 평균을 구하여 출력하시오
		 */

		Scanner sc = new Scanner(System.in);
		int count;
		int [] score, rank; //몇명이 들어올 지 몰라서 선언만 해놈[]
		String [] name;
		int sum=0;
		double avg;
		
		System.out.print("인원 수를 입력하세요 ");
		count = Integer.parseInt(sc.nextLine()); // 문자열로 변환
		// 각 변수에 인원 수 만큼 배열 할당
		score = new int[count];
		rank = new int[count];
		name = new String[count];
		
		// 이름과 점수 입력
		for(int i=0; i<score.length;i++)
		{
			System.out.print((i+1)+"번째 이름을 입력하세요 ");
			name[i] = sc.nextLine();
			System.out.print("점수를 입력하세요 ");
			score[i] = Integer.parseInt(sc.nextLine());
		
			// 합계 구하기
			sum += score[i];
		}
		
		// 평균 구하기
		avg = (double)sum/count;
		
		// 등수 구하기
		for(int i=0; i<score.length;i++)
		{	
			rank[i] = 1;
			for(int j=0; j<score.length;j++)
				if(score[i]<score[j])
					rank[i]++;
		}
		
		// 출력하기
		System.out.println((count)+"명의 합계는"+sum+"이고 평균은"+avg+"입니다");
		System.out.println("번호\t이름\t점수\t등수");
		System.out.println("=".repeat(30));
		for(int i=0; i<count; i++)
		{
			System.out.println(i+1+"\t"+name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
		
	}

}
