package day1211;

public class Ex3DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1=3.6f;//float의 경우 변수 값 뒤에 f를 붙여야 4바이트로 저장됨(출력문 상관없음)
		double f2=5.6;//변수 값 뒤에 따로 붙일거 없음
		
		System.out.println("f1="+f1);
		System.out.println("f2="+f2);
		System.out.println("f1+f2="+f1+f2);
		System.out.println("f1+f2="+(f1+f2));
		
		float f3=2.123456789f;
		double f4=2.123456789;
		
		System.out.println("f3="+f3);//유효성있는 숫자까지만 소수 자리 출력
		System.out.println("f4="+f4);//15자리 정도 까지는 소수 자리 출력
		System.out.println("f3+f4="+(f3+f4));//println은 자동으로 줄넘김이 되서 나옴, 줄넘김 안할거면 ln 빼
		System.out.println("f3+f4="+f3+f4);
		
		//pritnf:jdk5부터 추가된 기능, 줄넘김 불가, 변환기호를 이용한 출력문
		//- 실수형:%f
		//- \n:줄넘김, n번 사용 시 n줄 줄넘김
		//- \t:탭넘김
		//- \\:역슬래시 한번만 출력
		//- \\":"출력
		System.out.printf("f3=%2.3f\nf4=%2.5f\n",f3,f4);//변환기호 개수만큼 변수명 나열, 소수영역 설정
		
	}

}
