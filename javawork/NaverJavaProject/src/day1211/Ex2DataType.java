package day1211;

public class Ex2DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=90;
		int eng=93;
		System.out.println("합계="+kor+eng);//String+int+int : 묵시적형변환에 의해 ()가 없을 경우 int에 대해 String 처리
		System.out.println("합계="+(kor+eng));//()에 우선 계산이 되어서 int+int=int가 됨(숫자로 계산됨)
	
		//진법 변환
		int a=056;//맨 앞자리에 0이 올 시 8진수로 인식
		int b=0x12a;//0x일 시 16진수로 인식
		int c=0x11a;
		
		int d=047;
		int e=0xa9;
		int f=052;
		
		int g=0b1011; //2진수는 0b, 0과 1로만 작성
		int h=0456; //8진수는 0, 0~7로만 작성
		int i=0x3b9; //16진수는 0x, 0~9로만 작성
		
		System.out.println("a="+a);//8진수를 10진수로 변경:5*8+6*1(8^0)=46
		System.out.println("b="+b);//16진수를 10진수로 변경:1*16^2+2*16^1+10*16^0=256+32+10=298
		System.out.println("c="+c);//16진수를 10진수로 변경:1*16^2+1+16^1+10*16^0=256+16+10=282
		
		System.out.println("d="+d);//8진수를 10진수로 변경:4*8^1+7*8^0=32+7=39
		System.out.println("e="+e);//16진수를 10진수로 변경:10*16^1+9*16^0=160+9=169
		System.out.println("f="+f);//8진수를 10진수로 변경:5*8^1+2*8^0=42
		
		System.out.println("g="+g);//2->10 : 1*2^3 + 0*2^2 + 1*2^1 + 1*2^0 = 11
		System.out.println("h="+h);//9->10 : 4*8^2 + 5*8^1 + 6*8^0 = 256 + 40 + 6 = 302 
		System.out.println("i="+i);//16->10 : 3*16^2 + 11*16^1 + 9*16^0 = 953
		
		


	}

}
