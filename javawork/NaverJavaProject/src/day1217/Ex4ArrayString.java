package day1217;

public class Ex4ArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 값을 안넣고 인덱스만 구성 -> 값으로 null 출력
		
		// 1번 방안으로 값 출력
		String [] str1;
		str1 = new String[4];
		str1[0] = "Hello";
		str1[3] = "Kitty";
		
		for(int i=0; i<str1.length; i++)
		{
			System.out.println("str1["+i+"]="+str1[i]);
		}
		System.out.println("=".repeat(20));
		
		// 2번 방안으로 값 출력
		String [] str2;
		str2 = new String[] {"green", "pink", "red", "yellow"};
		for(String s:str2)
		{
			System.out.println(s);
		}
		System.out.println("=".repeat(20));
		
		// 3번 방안으로 값 출력
		String [] str3 = {"kim", "lee", "seo", "kang"};
		for(String s:str3)
			System.out.println(s);

	}

}
