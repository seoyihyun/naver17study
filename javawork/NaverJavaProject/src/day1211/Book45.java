package day1211;

public class Book45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 45페이지
		// 정수타입_long 타입
		// Long 타입에 아주 큰 숫자를 대입하려면 뒤에 l또는L 붙여야 함
		
		long value1 = 10;
		long value2 = 10000000000000L;
		
		System.out.println(value1);
		System.out.println(value2);
		
		// 46페이지
		// 문자 타입_char 타입
		
		char number1 = 'B';
		char number2 = 66; //''사용 불가, 해당 문자 출력
		
		System.out.println("number1 is "+number1);
		System.out.println("number2 is "+number2);
		
		// 47페이지
		// 실수 타입_float & double
		
		double x = 0.25;
		double y = -3.14;
		double z = 5e2; //5*10^2 => e=10, 2=제곱(-일 경우 5e-2로 작성)
		
		System.out.println("double x is "+x);
		System.out.printf("double y is "+"%-2.2f\t",y);
		System.out.printf("double z is "+"%2.2f\n",z); //설정한 소수영역보다 숫자가 클 경우 걍 그거 큰 숫자 출력
		
		float a = 1.456789123456f; // 아님 (float)0.23567 해도됨
		double b = 1.456789123456;
		
		System.out.println(a);
		System.out.printf("%f\n",a); // printf를 사용했을 때 더 짧게 나옴
		System.out.println(b);
		System.out.printf("%f",b);
		
		//59 페이지
		// 강제 변환
		
		//작->큰
		
		int intvalue = 100;
		byte bytevalue = (byte)intvalue;
		
		System.out.println(bytevalue);
		
		//큰->작
		
		long longscore = 300;
		int intscore = (int)longscore;
		
		System.out.println(intscore);
		
		
		
		
		
		String c = String.valueOf(10);
		String d = String.valueOf(20);
		System.out.println(c+d);
		
		
		
		
		
		
		
		
	}

}

