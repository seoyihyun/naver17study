package day1219;

public class ExStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Happy";
		// String -> StringBuffer
		StringBuffer sb = new StringBuffer(str);
		// 인스턴스 변수인 경우 변수명만 출력했을 때 자동으로 toString()이 호출됨
		// toString을 갖고 있지 않은 경우는 값이 아닌 주소가 출력됨
		System.out.println(sb);
		System.out.println(sb.toString());
		
		// String은 값 자체를 변경할 수는 없지만 StringBuffer는 문자열 변경(편집)이 가능함
		// 추가 나열 : append
		sb.append('A'); 
		sb.append(100);
		sb.append("고양이");
		System.out.println(sb);
		
		// 삭제 : delete
		sb.delete(5, 9); // 5~8 인덱스가 제거됨
		System.out.println(sb);
		
		// 중간 삽입 : insert
		sb.insert(3, "java"); 
		System.out.println(sb);
		
		// 변경 : replace
		sb.replace(3, 7, "Hello");
		System.out.println(sb);
		
		// 데이터를 json 데이터로 변환
		String name ="캔디";
		int age = 23;
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("{\"name\":");
		sb2.append("\""+name+"\",");
		System.out.println(sb);
		
	}

}
