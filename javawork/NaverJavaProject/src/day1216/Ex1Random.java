package day1216;

import java.util.Random;

public class Ex1Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 난수번호를 생성하는 2가지 케이스 
		 * 1. use method "Math.random()" : new 사용하지 않음
		 * 2. use class "Random" : new와 nextInt 사용
		 * 
		 * 메소드 생성 시 new 사용하지 않음
		 */
		
		System.out.println("< Math.random() create i what 0.0 <=i && i<1.0 >");
		for(int i=1; i<=5; i++) {
			System.out.println(Math.random());
		}
		
		System.out.println("< create 0~9 number >"); // 중복난수번호 허용
		for(int i=1; i<=5; i++) {
			int n=(int)(Math.random()*10);
			System.out.println(n);
		}
		System.out.println("< create 0~99 number >"); // 중복난수번호 허용
		for(int i=1; i<=5; i++) {
			int n=(int)(Math.random()*100);
			System.out.println(n);
		}
		System.out.println("< create 1~10 number >"); // 중복난수번호 허용
		for(int i=1; i<=5; i++) {
			int n=(int)(Math.random()*10)+1; // 초기값을 1로 설정 : +1
			System.out.println(n);
		}
		System.out.println();
		System.out.println("Random 클래스를 이용해서 난수 구하기");
		Random r = new Random();
		
		System.out.println();
		System.out.println("0~9까지의 난수 구하기");
		for(int i = 1; i<=5; i++) {
			int n = r.nextInt(10);
			System.out.println(n + " ");
		}
		System.out.println();
		System.out.println("1~10까지의 난수 구하기");
		for(int i = 1; i<=5; i++) 
		{
			int n = r.nextInt(10)+1;
			System.out.println(n + " ");
		}
		
		System.out.println();
		System.out.println("A~Z(65~90) 까지의 난수 구하기");
		for(int i=1; i<=5; i++)
		{
			int n=r.nextInt(26)+65; // 65부터 시작 = 65로 초기 값 설정 : +65, 90까지 = 91로 설정 : int(26)
			System.out.println((char)n + " ");
		}
		
	}
	
}



