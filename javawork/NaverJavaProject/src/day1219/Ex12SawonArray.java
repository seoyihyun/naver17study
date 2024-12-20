package day1219;

import java.text.NumberFormat;
import java.util.Scanner;

public class Ex12SawonArray {

	// 멤버변수 쓸일 없을때만 static 사용 // 이라면서 main에서 호출하려면 static이 필요한듯
	// 제목 출력 구조 선언하기
	public static void showTitle() {
		System.out.println("사원명\t직급\t월급\t수당\t가족수당  세금  실수령액");
		System.out.println("=".repeat(63));
	}
	// writeSawon(Sawon sawon) : 한개의 사원 데이터 출력 구조 선언하기
	public static void writeSawon(Sawon sawon) { // 사원1의 파라미터를 받음 = Sawon sawon
		NumberFormat nf = NumberFormat.getInstance(); 
		System.out.println(sawon.getSawonName()+"\t"+sawon.getSawonPosition()+"\t"+sawon.getGibonPay()
		+"\t"+sawon.getSudang()+"\t"+sawon.sawonFamsudang()+"\t"+sawon.getTax()+"\t"+sawon.getNetPay());
		// 멤버변수 씀! -> static
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int inwon;
		
		// 인원수를 입력 후 인원수만큼 배열 메모리 할당
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력해주세요");
		inwon = Integer.parseInt(sc.nextLine());
		Sawon[] mySawon = new Sawon[inwon];
		
		// 배열에 데이터 입력 후 생성자를 통해 데이터 저장하기
		for(int i=0; i<mySawon.length; i++) {
			System.out.println("사원명을 입력해주세요");
			String sawonName = sc.nextLine();
			System.out.println("직급을 입력해주세요");
			String sawonPosition = sc.nextLine();
			System.out.println("가족수를 입력해주세요");
			int sawonFamsu = Integer.parseInt(sc.nextLine());
			// 사원 생성 방법1
//			mySawon[i] = new Sawon();
//			mySawon[i].setSawonName(sawonName);
//			mySawon[i].setSawonPosition(sawonPosition);
//			mySawon[i].setSawonFamsu(sawonFamsu);
			// 사원 생성 방법2
			mySawon[i] = new Sawon(sawonName,sawonPosition,sawonFamsu);	
		}
		// 제목 출력
		showTitle();
		
		// 반복문을 통해 데이터를 출력하는 메소드 호출
		for(Sawon s : mySawon)
			writeSawon(s);

	}

}
