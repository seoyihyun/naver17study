package day1212;

public class Ex4Opeator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 관계연산자(< > <= >= == !=), 논리연산자(&&,||,!)
		// 결과값은 무조건 boolean형으로 출력 (true or false)
		
		int kor=89,eng=100,math=89;
		boolean f=false; //실패가 기준
		
		System.out.println(kor>eng);
		System.out.println(kor<eng);
		System.out.println(kor==eng);
		System.out.println(kor!=eng);
		
		System.out.println(kor>eng && ++ eng>math);
		// 1번째 조건에서 false이기 때문에 2번째 조건 미검증(데이터 조회,저장하지 않음
		// -> and조건에서 true가 나올 수 없음
		System.out.println(eng); //데이터 미저장 : 100
		
		System.out.println(kor>eng || ++eng>math);
		// 1번째 조건에서 false가 나오면 2번째 조건 검증(데이터 조회,저장)
		// -> or조건에서 true가 나올 수 있음
		System.out.println(eng);//101
		System.out.println(!f);
		
	}

}
