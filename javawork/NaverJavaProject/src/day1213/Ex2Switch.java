package day1213;

import java.util.Scanner;

public class Ex2Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc=new Scanner(System.in);
//		char ch;
		
//		System.out.println("알파벳을 한글자 입력해주세요");
//		ch = sc.nextLine().charAt(0); //입력한 문자열 중 첫 글자를 char 타입으로 반환하는 메서드
//		
//		switch(ch)
//		{
//		case 'a': // 해당 케이스에는 break가 없기 때문에 다음 명령 실행
//		case 'A':
//			System.out.println("Apple");
//			break;
//		case 'b':
//		case 'B':
//			System.out.println("Banana");
//			break;
//		case 'c':
//		case 'C':
//			System.out.println("Computer");
//			break;
//		default :
//			System.out.println("a,b,c가 아닌 알파벳");
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("영어 단어를 입력해주세요");
		String msg = sc.nextLine(); //String이니까 "" 처리 필요
		
		// 버전을 낮출 경우 오류남(Switch에서 문자열 사용 불가, int, char 이딴거만 가능)
		
		switch(msg) {
		case "red":
		case "RED":
		case "Red":
			System.out.println("빨강색");
		break;
		
		case "green":
		case "GREEN":
		case "Green":
			System.out.println("초록색");
		break;
		
		default:
		
			
		
		}

	}

}