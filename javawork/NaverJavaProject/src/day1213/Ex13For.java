package day1213;

import java.util.Scanner;

public class Ex13For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 문제 2
 * 5명의 나이를 입력 후
 * 40세 이상과 40세 미만이 각각 몇명인 지 출력하고
 * 평균 나이도 같이 출력하시오(for문 사용)
 * 
 */
		Scanner sc = new Scanner(System.in);
		
		int count1=0, count2=0, sum=0, age;
		double avg;
		
		
		for(int i=1; i<=5; i++) {
			System.out.println(i + " input");
			age = sc.nextInt(); // for -> scanner
			// 0~100 range out, re input
			// continue : for -> i++fh move
			
			if(age<0 || age>=100) {
				System.out.println("re input");
				i--; // discount
				continue;
			}
			
			sum +=age;
			
			if(age>=40)
				count1++;
			else
				count2++;
		}
		avg = (double)sum/5;
		System.out.println(count1);
		System.out.println(count2);
		System.out.println(avg);
	
	}

}
