package day1219;

import java.util.StringTokenizer;

public class Ex9StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String msg = "red|green|yellow|white|black";
		// |로 분리해서 출력
		// split 사용
//		String []arr = msg.split("|");
//		for(String a : arr) {
//			System.out.print(a);
//		}System.out.println();
		
//		StringTokenizer st = new StringTokenizer(msg,"|");
//		System.out.println("분리할 총 토큰 수 : "+st.countTokens());
//		
//		for(int i=0; i<st.countTokens(); i++) {
//			System.out.println(st.nextToken());
//		}
//		
//		// 방법1
//		int count = st.countTokens();
//		for(int i=0; i<count; i++) {
//			System.out.println(st.nextToken());
//		}System.out.println();
//		
//		StringTokenizer st2 = new StringTokenizer(msg,"|");
//		// 방법2
//		while(st2.hasMoreTokens()) {
//			System.out.println(st2.nextToken());
//		}System.out.println();
//		
//		// split을 더 잘 사용하니까 이걸로 다시한번 출력해보자
//		String []arr3 = msg.split("\\|"); // \\| : 정규표현식
//		System.out.println(arr3.length);
//		for(String a : arr3)
//			System.out.println(a);
		
		// 아래 데이터를 . 으로 분리하여 출력하시요(split)
		String msg2 = "가.나.다.라.마";
		StringTokenizer st3 = new StringTokenizer(msg2,".");
		String []arr4 = msg2.split("\\.");
		System.out.println(arr4);
		for(String a1 : arr4)
			System.out.println(a1);
		

	}

}
