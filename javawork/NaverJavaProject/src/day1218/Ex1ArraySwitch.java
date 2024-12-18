package day1218;

import java.util.Scanner;

public class Ex1ArraySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		 * 인원 수를 입력 후 인원 수 만큼 이름과 자바, 스프링 두 점수를 입력하여
		 * 총점, 평균, 평균에 대한 등수, 평균에 대한 등급을 구하시오
		 * (등급 : 9,10 : 우수장학생, 8 : 일반 장학생, 나머지 : 해당 없음)
		 */
		
		int inwon;
		int []java, spring, rank, sum;
		String []name, grade;
		double[] avg;
		
		// 인원 수부터 읽은 후 각 배열에 메모리 할당하기
		System.out.println("인원 수를 입력해주세요");
		inwon = Integer.parseInt(sc.nextLine());

		java = new int[inwon];
		spring = new int[inwon];
		sum = new int[inwon];
		rank = new int[inwon];
		
		name = new String[inwon];
		grade = new String[inwon];
		
		avg = new double[inwon];
		
		// 입력하기, 총점 및 평균 구하기
		for(int i=0; i<inwon;i++)
		{
			System.out.println((i+1) + "번째 이름 입력");
			name[i] = sc.nextLine();
			System.out.println((i+1) + "번째 자바 점수와 스프링 점수 입력");
			java[i] = Integer.parseInt(sc.nextLine());
			spring[i] = Integer.parseInt(sc.nextLine());
			
			sum[i] = java[i] + spring[i];
			avg[i] = sum[i]/2.0;
			System.out.println();			
		}
		
		// 등수 구하기
		for(int i=0; i<inwon; i++)
		{
			rank[i] = 1;
			for(int j=0; j<inwon; j++)
				if(avg[i]<avg[j]) // 점수가 낮을 수록 높은 랭크
				rank[i]++;
		}
		
		// 등급 구하기
		for(int i = 0; i<inwon; i++)
//			switch((int)avg[i]/10)
//			// 점수를 10으로 나누면 10 이하의 숫자로 떨어짐, 해당 숫자를 그레이드화 
//			{
//			case 10 :
//			case 9 : 
//				grade[i] = "우수 장학생";
//				break;
//			case 8 :
//				grade[i] = "일반 장학생";
//				break;
//			default : 
//				grade[i] = "해당 없음";
//			}
			// switch 방법 2) jdk 12,13에서 추가된 문법
			grade[i] = switch((int)avg[i]/10)
			{
			case 10,9 -> "우수 장학생";
			case 8 -> "일반 장학생";
			default -> "해당 없음";
			};
		
		// 출력하기
		System.out.println("번호\t이름\t자바\t스프링\t총점\t평균\t등수\t등급");
		System.out.println("=".repeat(70));
		for(int i=0; i<inwon; i++)
		{
			System.out.println((i+1)+"\t"+name[i]+"\t"+java[i]+"\t"+spring[i]+
					"\t"+sum[i]+"\t"+avg[i]+"\t"+rank[i]+"\t"+grade[i]);
		}

	}

}
