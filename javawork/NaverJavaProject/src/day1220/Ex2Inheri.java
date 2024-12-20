package day1220;
class SuperObj2 {
	
	private String schoolName; // 자식클래스도 접근할 수 없는 변수

	public SuperObj2() { // public 생성자, private을 스트링으로 선언
		schoolName = "정담고";
	}
	public SuperObj2(String schoolName) {
		this.schoolName = schoolName; // 본 클래스의 String을 호출
	}
	public void write() { // 출력 메소드 생성
		System.out.println("학교명 : "+schoolName);
	}
}

class SubObj2 extends SuperObj2 {
	private String studentName;

	public SubObj2() {
		studentName = "이름없음"; //?
	}

	SubObj2(String schoolName, String studentName) { // 디폴트 생성자
		super(schoolName); // 부모가 가진 스트릿 생성자로 부모의 프라이빗 변수에 접근
		this.studentName = studentName;
	}
	// 부모가 이미 write를 가져서 난 못가짐.. 오버라이딩 하자
	@Override
	public void write() {
		super.write(); // super 호출
		System.out.println("학생 이름 : "+studentName);
	}
}

class SubObj22 extends SuperObj2 {
	private String teacherName;
	
	public SubObj22() {
		teacherName = "이름없음";
	}
	
	SubObj22(String schoolName, String teacherName) {
		super(schoolName);
		this.teacherName = teacherName;
	}
	@Override
	public void write() {
		super.write();
		System.out.println("선생 이름 : "+teacherName);
	}
}

public class Ex2Inheri {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubObj2 s1 = new SubObj2();
		SubObj2 s2 = new SubObj2("강남고", "홍길동");
		SubObj22 s3 = new SubObj22("안양고", "김로로");
		SubObj22 s4 = new SubObj22("롸롸고", "강미미");
		s1.write();
		s2.write();
		s3.write();
		s4.write();



	}

}
