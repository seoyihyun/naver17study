package day1212;

import java.util.Scanner;

public class Ex15If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*
		 * 상품(product)과 수량(amount), 단가(price) 을 입력받은 후 
		 * 총 금액(total)을 출력하시오
		 * 상품이 5개 미만일 시 10%dc된 가격 출력
		 * 
		 * (출력 예시)
		 * 상품명 : 바나나킥
		 * 수량 : 5개
		 * 단가 : 1000원
		 * 총금액 : 5000원
		 * 
		 * 10% dc된 금액은 4500원입니다 알럿 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String product;
		int amount, price, total;
		
		System.out.println("상품명을 입력하세요");
		product = sc.nextLine();
		System.out.println("수량을 입력하세요");
		amount = sc.nextInt();
		System.out.println("가격을 입력하세요");
		price = sc.nextInt();
		
		if(amount<5)
			total = (int)((amount*price)*0.9);
		
		else
			total = amount*price;
		
		System.out.println("상품명 : "+product);
		System.out.println("수량 : "+amount+"개");
		System.out.println("가격 : "+price+"원");
		System.out.println("결제 금액은 "+total+"원 "+(amount<5?"(할인 적용)":"")+" 입니다");
		
	}

}
