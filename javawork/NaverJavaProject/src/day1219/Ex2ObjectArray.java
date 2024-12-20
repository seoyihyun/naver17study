package day1219;

import java.util.Scanner;

public class Ex2ObjectArray {
	
	public static void dataInput(Student s) {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름 입력");
		String name = sc.nextLine();
		System.out.println("학생 주소 입력");
		String addr = sc.nextLine();
		System.out.println("학생 혈액형 입력");
		String blood = sc.nextLine();
		
		s.changeStudent(name, addr, blood);
		System.out.println();
	}
	public static void showTitle() {
		System.out.println("이름\t혈액형\t주소");
		System.out.println("=".repeat(20));
	}
	
	public static void writeStudent(Student s) {
		System.out.println(s.getStuName()+"\t"+s.getStuBlood()+"\t"+s.getStuAddress());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int inwon;
		Student [] stuArray;
		
		System.out.println("인원 수 입력");
		inwon = Integer.parseInt(sc.nextLine());
		stuArray = new Student [inwon];
		
		for(int i=0; i<stuArray.length; i++) {
			stuArray[i] = new Student();
			dataInput(stuArray[i]);
		}
		// 제목 및 내용 출력
		showTitle();
		for(int i=0; i<stuArray.length; i++) {
			writeStudent(stuArray[i]);
		}

	}

}
