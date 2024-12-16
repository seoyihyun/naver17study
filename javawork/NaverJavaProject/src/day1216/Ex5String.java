package day1216;

import javax.annotation.processing.SupportedSourceVersion;

public class Ex5String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("String 클래스의 멤버 메소드에 대한 공부");
		
		String str1 = "Apple";
		String str2 = "Have a nice day!";
		String str3 = "Orange";
		String str4 = new String("Apple");
		
		System.out.println("str1 ="+str1);
		System.out.println("str2 ="+str2);
		System.out.println("str3 ="+str3);
		
		// 공백 포함 길이 파악 : .length()
		System.out.println("str2의 길이 : "+str2.length()); 
		System.out.println("str1의 0번째 글자:"+str1.charAt(0));
		System.out.println("str3의 3번쨰 글자:"+str3.charAt(3));
		System.out.println();
		
		// 글자의 위치 파악 : .indexOf()
		System.out.println("str1에서 l의 위치는 :"+str1.indexOf('l')); //글자로 쓰면 아스키코드로 인식, charAt과는 반대
		System.out.println("str2에서 첫번째 a의 위치는 :"+str2.indexOf('a')); //첫번째 a의 위치 : indexOf
		System.out.println("str2에서 마지막 a의 위치는 :"+str2.lastIndexOf('a')); //마지막 a의 위치 : LastIndexOf
		System.out.println("str3dptj x의 위치는 :"+str3.indexOf('x')); //해당 문자가 없을 경우는 -1 발생
		System.out.println();
		
		// 객체 타입에서 주소 비교  == 동등연산자
		System.out.println(str1 ==str4);
		System.out.println(str3 =="Orange");
		System.out.println(str1 =="apple"); 
		System.out.println();
		
		// 정확한 문자열끼리의 비교 : .equals()
		System.out.println(str1.equals(str4));
		System.out.println(str1.equals("apple")); // 대소문자까지 모두 동일해야 true
		System.out.println(str1.equals("A pple")); // 띄어쓰기까지 모두 동일해야 true
		System.out.println(str1.equalsIgnoreCase("apPle")); // 대소문자 상관없이 철자만 맞으면 true, 띄어쓰기 다르면 false
		System.out.println();
		
		// 문자열 비교 : .compareTo()
		int n = str1.compareTo("Apple");
		System.out.println(n); // 대소문자까지 같을 경우 0 출력?
		System.out.println(str1.compareTo(str3));
		
		n = str1.compareTo("Banana");
		System.out.println(n); // str1이 str2보다 작을 경우 마이너스 값 출력
		// 'A'와 'B'를 비교, 1차이라서 -1 출력, 출력되는게 음수인지 양수인지가 중요
		
		n = str3.compareTo(str1);
		System.out.println(n); //"Orange", "Apple"의 "O"와 "A"를 비교, 14는 알파벳 순서 차이
		System.out.println();
		
		// 모두 대문자로 변환 : .toUpperCase()
		System.out.println(str2.toUpperCase());
		
		// 모두 소문자로 변환 : .toLowerCase()
		System.out.println(str2.toLowerCase());
		System.out.println();
		
		// str이 ~로 시작하면 true : .startsWith()
		System.out.println("Have로 시작? "+str2.startsWith("Have"));
		System.out.println("Happy로 시작 ?"+str2.startsWith("Happy"));
		
		// str이 ~로 끝나면 true : .endsWith()
		System.out.println("Day!로 끝남? "+str2.endsWith("day!!"));
		
		// 문자열 반복 : .repeat()
		System.out.println("=".repeat(10));
		System.out.println(str1.repeat(5));
		
		// 문자열 변환 : .replace(,)
		System.out.println(str2.replace("a", "*")); //보안 마스킹할 때 쓸듯 
		System.out.println(str2.replace("Nice", "Happy"));
		
		// substring 순번부터 끝 또는 설정 순번까지 문자 추출 : .substring(,)
		System.out.println(str2.substring(7)); //끝까지
		System.out.println(str2.substring(7,11)); //10번째까지
		
		
		// split으로 문자열 분리(배열) : .split / []array
		String str5 = "red, green, blue, yellow, gray, black";
		String []array = str5.split(","); // str5의 어레이를 콤마(,)를 기준으로 분리
		for (String a : array)
			System.out.println(a);
		
		// 앞 뒤 공백 제거 : .trim
		String str6 = "  Hello  ";
		System.out.println("*"+str6+"*");
		System.out.println("*"+str6.trim()+"*");
		
		// 다양한 타입의 데이터를 String 타입으로 변환 : .valueOf
		String s1 = String.valueOf(100);
		String s2 = String.valueOf(true);
		String s3 = String.valueOf(34.6);
		String s4 = String.valueOf('A');
		System.out.println(s1+s2+s3+s4);
		
	}

}
