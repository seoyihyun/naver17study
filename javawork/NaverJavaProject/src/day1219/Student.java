package day1219;

import java.util.Calendar;

public class Student {

	// 필드(멤버 변수) 선언
	private String stuName;
	private String stuAddress;
	private String stuBlood;
	private int stuBirthYear;
	private int stuScore;

	// Source > Getters and Setters > public 으로 제너럴 생성
	public String getStuName() {
		return stuName; 
	}
	public void setStuName(String stuName) { // 지역변수명=멤버변수명 똑같으면
		this.stuName = stuName; // this가 무조건 붙어야 함
	}
	public String getStuAddress() {
		return stuAddress;
	}
	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	// stuBlood에 대한 getter & setter
	public String getStuBlood() {
		return stuBlood;
	}
	public void setStuBlood(String stuBlood) {
		this.stuBlood = stuBlood;
	}
	// stuBirthYear에 대한 getter & setter
	public int getStuBirthYear() {
		return stuBirthYear;
	}
	public void setStuBirthYear(int stuBirthYear) {
		this.stuBirthYear = stuBirthYear;
	}
	// stuScore에 대한 getter & setter
	public int getStuScore() {
		return stuScore;
	}
	public void setStuScore(int stuScore) {
		this.stuScore = stuScore;
	}
	// 3개를 한번에 변경할 경우
	public void changeStudent(String stuName, String stuAddress, String stuBlood) {
		this.setStuName(stuName);
		this.setStuAddress(stuAddress);
		this.setStuBlood(stuBlood);
	}
	// stuScore에 대한 절대평가(A~F)를 반환하는 메소드
	public char getScoreGrade() {
		char grade = switch(stuScore/10) // 변경된 switch문법 사용
				{
				case 10, 9 -> 'A';
				case 8 -> 'B';
				case 7 -> 'C';
				case 6 -> 'D';
				default -> 'F';
				};
				return grade; // 하여 등급 반환
	}
	// stuBirthYear로 나이를 구해서 반환하는 메소드
	public int getAge() {
		// Calendar문법 사용해서 현재 년도 구하기
		Calendar cal = Calendar.getInstance(); // 캘린더의 인스턴스를 구하기? 
			int curYear = cal.get(Calendar.YEAR); // ? ? ? 
			return curYear-stuBirthYear;
		}
		
	}
