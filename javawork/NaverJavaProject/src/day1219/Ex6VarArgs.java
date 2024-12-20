package day1219;

public class Ex6VarArgs {
	
	// 멤버변수를 안쓰면 static 사용
	// 1. 갯수마다 오버로딩 메소드 생성
	public static void writecolor(String color1) {
		System.out.println("color1="+color1);
	}
	public static void writecolor(String color1, String color2) {
		System.out.println("color1="+color1+" color2="+color2);
	}
	public static void writecolor (String color1, String color2, String color3) {
		System.out.println("color1="+color1+" color2="+color2+" color3="+color3);
	}
	
	// 3. variable arguments 기능을 이용해서 여러 문자열을 인자로 보내기 
	public static void writeName(String ... name) {
		// ... : 갯수 상관 없이 String으로 들어온걸 모두 배열 타입으로 전달
		System.out.print("name의 length : "+name.length+"\t");
		System.out.println();
		
		if (name.length==0)
			System.out.println("멤버가 없습니다");
		else
			System.out.println("**멤버 목록**");
			for(String n:name)
				System.out.println(n);
			System.out.println("=".repeat(10));
	}

	public static void main(String[] args) {
		
		// 2. 출력
		writecolor("red");
		writecolor("red", "orange");
		writecolor("red", "orange","yellow");

		// 4. 출력
		writeName();
		writeName("가가");
		writeName("가가", "나나");
		writeName("가가", "나나", "다다");
		writeName("가가", "나나", "다다", "라라");
	    
	}

}
