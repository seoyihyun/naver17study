package day1218;

import java.util.Random;
import java.util.Scanner;

public class Ex2Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또 가격은 1천원, 1천원 당 1장
		Scanner sc = new Scanner(System.in);
		int money;
		int [] lotto = new int[6];
		Random r = new Random();

		// 금액 입력하기
		System.out.println("금액을 입력해주세요");
		money = sc.nextInt();
		// 1천원 미만이면 종료
		if(money < 1000)
		{
			System.out.println("**금액이 부족합니다**");
			return; // 프로그램 종료
		}
		// 금액만큼 로또 숫자 발생 후 출력(오름차순)
		for(int i=1; i<=(money/1000); i++)
		{	
			System.out.printf("%3d회 : ",i);
			
			// lotto 배열에 1~45 난수 발생, 중복 체크
			for(int j=0; j<lotto[i].length; j++)
			{
				lotto[i] = (int)Math.random()*45+1;
				for(int z=0; z<j; z++)
				{
					if(lotto[j]==lotto[z])
					{
						j--;
						break; // 중복 체크
					}
				}
			}
			// 오름차순 정렬
			for(int i=0; i<lotto.length-1; i++)
			{	
				for(int j=i+1; j<lotto[i].length; j++)
				{
					if(lotto[j]>lotto[i])
					{
						int temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				}
			}
			for(int i=0; i<lotto.length; i++)
			{
				System.out.printf("%3d",lotto[i]);
			}
		}

	}

}
