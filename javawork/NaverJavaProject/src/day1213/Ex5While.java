package day1213;

public class Ex5While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		// while은 조건이 맞지 않으면 0번 실행 후 out
		while(a<10) {
			System.out.println("while loop");
		}
		
		// do while은 일단 1번 실행 후 조건 비교 후 out
		do {
			System.out.println("do~while loop");
		}while(a<10);
		
		
		// 1~10까지 출력		
		
		// 방법1)
		a = 1;
		while(a<=10) { //a가 10까지 될 동안
			System.out.printf("%3d", a++); //3자리수에 a++만큼의 값 출력
		}
		System.out.println();
		
		// 방법2) true일 동안 a++(후치) 만큼 출력
		a = 1;
		while(true) {
			System.out.printf("%3d",a++);
			if(a>10)
				break;
		}
		System.out.println();
		
		// 방법3) a<10일 동안 ++a(선치) 만큼 출력
		a = 0;
		while(a<10) { // ;을 문장으로 인식하기 때문에 while 뒤에 ; 사용 시 무한루프됨
			System.out.printf("%3d",++a);
			if(a>10)
				break;
		}
		System.out.println();
		
		// 방법4) do while 사용
		a = 1;
		do {
			System.out.printf("%3d", a++);
		}while(a<=10);

	}

}

		
