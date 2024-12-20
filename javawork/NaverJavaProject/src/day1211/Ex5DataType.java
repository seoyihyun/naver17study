package day1211;

public class Ex5DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바에서 char 타입은 2바이트 (한글 한글자도 저장 가능)
		// char 사용 시 문자는 '' 만 사용 가능, ""사용 시 문자열로 인식,printf 시 %c 사용
		char ch1='A';
		char ch2='가';
		char ch3='나';
		char ch4='다';
		System.out.println("ch1="+ch1);
		System.out.println("ch2="+ch2);

		//printf로 출력 시 변환기호 1글자:%c, 문자열:%s
		System.out.printf("ch1=%c\tch2=%c\n",ch1,ch2);
		System.out.printf("ch1=%s\tch2=%s\n",ch1,ch2);
		System.out.printf("ch1=%d\tch2=%d\n",(int)ch1,(int)ch2);//ascii code로 변환되서 출력, (int)char
		System.out.printf("ch3=%s\nch4=%s/n",ch3,ch4);
		
		int a=65;
		System.out.println(a);//65
		System.out.println(a+32);//97
		System.out.println((char)a);//A
		System.out.println((char)(a+32));//a
		
		//printf 사용
		System.out.printf("%c, %c, %c, %c",a,a,a,a);
		System.out.printf("%c, %c, %c, %c\n\n",a,a+2,a+33,a+40);//ascii code로 변환되서 출력
		
		//printf, ascii code를 사용해서 문자 출력
		System.out.printf("%c%c%c%c%c\n",a+7,a+36,a+43,a+43,a+46);//Hello, %c에 콤마 안쓰면 출력안됨
		System.out.printf("%c%c%c!\n",a+24,a+4,a+18);//YES!, !도 출력됨
		
		
		
		
	}

}
