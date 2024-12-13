package day1212;

import java.util.Scanner;

public class Ex7Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 모든 클래스는 new로 생성
		
		Scanner sc = new Scanner(System.in); // 키보드로 입력한걸 스캔해라 = 콘솔에서 입력한걸 스캔해라
		String word;
//		System.out.println("문장을 입력해보세요");
//		word = sc.next(); //한 단어만 읽어옴
//		System.out.println("내가 입력한 단어는\""+word+"\"입니다.");
//		
//		word = sc.nextLine(); //엔터를 누르면 그 한줄을 통째로 읽어옴
//		System.out.println("내가 입력한 문장은\""+word+"\"입니다.");
		
		int age;
		System.out.println("나이를 입력하세요");
		age = sc.nextInt(); // 인티져로 읽어옴, 숫자 포함되면 안됨
		System.out.println("내 나이는"+age+"입니다");
		
		
	}

}
