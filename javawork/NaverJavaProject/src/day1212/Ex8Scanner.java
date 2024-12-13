package day1212;

import java.util.Scanner;

public class Ex8Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		String sangpum;
		int price;
		
		System.out.println("상품 가격 입력"); 
		price=sc.nextInt(); // **숫자만 읽고 엔터는 버퍼로 들어감
		sc.nextLine(); //넥스트로하면 엔터까지 못가져오니까 nextline 사용, 버퍼의 엔터를 읽어서 없앰
		
		System.out.println("상품명 입력");
		sangpum=sc.nextLine(); //엔터를 버퍼로 읽음(없을 경우 키보드로부터 읽음)
		
		System.out.println(sangpum+"상품 가격은"+price+"원입니다");
		
		

	}

}
