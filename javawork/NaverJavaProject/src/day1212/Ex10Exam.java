package day1212;

import java.util.Scanner;

public class Ex10Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 상품(sang)과 수량(su), 단가(dan) 을 입력받은 후 
		 * 총 금액(total)을 출력하시오
		 * 상품이 5개 미만일 시 10%dc된 가격 출력
		 */
		
		try (Scanner sc = new Scanner(System.in)) {
			String sang;
			int su;
			int dan;
			int total; //한줄로 써도댐
			
			System.out.println("상품명을 입력해주세요");
			sang = sc.nextLine();
			
			System.out.println("수량을 입력해주세요");
			su = sc.nextInt();
			
			System.out.println("단가를 입력해주세요");
			dan = sc.nextInt();
			
			total = su<5?su*dan:(int)((su*dan)*0.9); // 기본 가격 검증?
			
			System.out.println(sang+" "+su+"개의 총 금액은"+total+"원"+(su<5?"":"(할인됨)"+" 입니다"));
			// 문구 출력 시 조건문 검증?
		}
		

	}

}
