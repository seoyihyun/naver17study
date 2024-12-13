package day1211;

public class Ex6DateType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String은 기본형 x, 객체타입 = 처리할 수 있는 메소드를 가지고 있음
		// String은 "" 또는 new String("") 사용
		
		String str1="Hello";
		String str2=new String("Happy");
		
		String str3="Study";
		String str4=new String("Java");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("\t"+str1);
		
		//printf에서 문자열의 변환기호는 %s
		System.out.printf("%s\n", str1);
		System.out.printf("%30s\n", str1);
		System.out.printf("%40s\n", str1);
		System.out.printf("**%-8s\n", str1);//**제외8자리 중 왼쪽정렬하며 나머지는 빈값으로 처리
		System.out.printf("**%8s\n", str1);//**제외8자리 중 오른쪽정렬하며 나머지는 빈값으로 처리
		System.out.printf("%8s**\n", str1);
		
		System.out.println(str3+str4);
		System.out.printf("오늘은 %10s\t",str3);
		System.out.printf("%-10s\n",str4);
		
		System.out.printf("오늘은 **%-10s\t",str3);
		System.out.printf("%10s**\n",str4);
		
		
		
	}

}
