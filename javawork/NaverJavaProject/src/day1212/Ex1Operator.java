package day1212;

public class Ex1Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 증감연산자, ++변수(전치 연산자:1순위), 변수++(후치 연산자:끝순위)
		
		int a,b,m,n;
		a=b=5;
		m=++a; //6 : a=6 저장 후 m=6 적용 및 출력
		n=b++; //5 : b=5 출력 후 n=5 적용 및 출력
	
		System.out.printf("a=%d, b=%d, m=%d, n=%d\n", a,b,m,n); 
		
		a=b=m=n=5;
		m+=a++*++b; //5*7, a++ : 5저장 및 6출력(후 저장? / ++b : 6+1=7출력(후 저장?/ m=35 / n=5
		
		//뒤에 연산을 추가로 할 경우 데이터 저장
		
		System.out.printf("a=%d, b=%d, m=%d, n=%d\n", a,b,m,n);
		
		n=a++ + ++b; //6+7, 위에서 6출력해서 a=6 / 위에서 7 출력해서 b=6 +1=7됨
		
		// a는 뒤에 별도 변수 선언 없이 그대로 추가연산할 경우 7이 됨
		
		System.out.printf("a=%d, b=%d, m=%d, n=%d\n", a,b,m,n);
		
		a=5;
		System.out.println(a++);//5 : 먼저 출력 후 뒤에 추가 연산 있을 시 6이 됨
		System.out.println(++a);//7 : 먼저 증가 후 출력
		
		a=b=m=n=5;
		a*=b-- - ++n*3; 
		System.out.printf("a=%d, b=%d, m=%d, n=%d\n", a,b,m,n);
		//a=a*{(b--)-(++n*3)} -> 5{(5-1=4)-(6*3=18)} = 5*(-12)= -60?
		
		a=1;
		b=2;
		m=3;
		n=4;
		
		b*=(m++)-(n--)+(++a);
		// 2 (3 - 4 + 2) = 2
		System.out.println(b);

	}

}
