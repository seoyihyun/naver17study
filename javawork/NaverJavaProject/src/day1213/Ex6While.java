package day1213;

public class Ex6While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 65; //char로 변환 시 ascii코드 적용
		while (a<=90) {
//			System.out.printf("%2c", a++); //변환기호가 c이기 때문에 a++가 char로 출력
			System.out.print(((char)a++)+" "); //a++에 변환기호 char을 써서 char로 출력
		}
		System.out.println();
		
		int i = 65;
		while(i<=90 ) {
			System.out.printf("%c", i++); // i가 1씩 증가
		}
		System.out.println();
		
		char b = 'a';
		// do~while 문을 활용해서 a~z를 출력하시오 
		// 엑 모르겠다 !!
		
		do {
			System.out.print(b++);
		}while (b<='z');
		System.out.println();
		
		int n = 0;
		while(n<=10) {
			n++; // ++된 후 if 검증
			if(n%2==0)
				continue; // 조건식으로 이동(while 이나 do while에서)
			System.out.printf("%2d\n", n); // 짝수는 출력 안되는 코드
		}
		}
	}
