package day1217;

public class Ex2Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 배열 선언
		char []ch;
		ch = new char[4]; // 0~3번 인덱스까지 데이터를 넣을 수 있음
		System.out.println("배열크기 : "+ch.length); // 배열의 길이 구하기
		
		// 배열에 데이터 넣기
		ch[0] = 'H';
		ch[1] = 65;
		ch[2] = 'x';
		ch[3] = 't';
		
		// 출력 #1
		for(int i=0; i<ch.length;i++) // 배열은 =를 붙일 수 없음
			System.out.println("ch["+i+"]="+ch[i]);
		
		// 출력 #2 : 값만 출력
		for(char a:ch) 
			System.out.println(a);
		
		System.out.println("=".repeat(10));
		
		// 2. 배열 바로 선언 후 값을 목록으로 저장
		char [] ch2 = new char[5]; // 크기 생성
		ch2 = new char[] {'a','n','x','y','u'}; // 값 저장
		for(int i=0; i<ch.length;i++)
		{
			System.out.println("ch2["+i+"]="+ch2[i]);
		}
		
		// 3. 배열 선언과 목록 저장을 동시에 진행
		System.out.println("=".repeat(10));
		char [] ch3 = {'s','r','t','v','i'};
		for(char a:ch3) // ch3의 값만 가져오기
		{
			System.out.println(a);
		}
	}

}
