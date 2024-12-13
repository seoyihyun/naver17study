package day1211;

public class Ex1DataType {
	public static void main(String[]args) {
		byte a=127;
		byte b=(byte)128; //(byte) : 강제 형변환 - cast 연산자
		byte c=(byte)200; //127 넘는 것은 모두 2의 보수로 나옴
		byte d=(byte)161;
				
		System.out.println("a="+a); //127
		System.out.println("b="+b); //-128 : 범위를 벗어나므로 틀린 값이 나옴
		System.out.println("c="+c); //-56 : -2의 보수로 나온 값
		System.out.println("d="+d);
	}
}
