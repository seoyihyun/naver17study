package day1212;

import java.util.Scanner;

public class Ex13If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int x, y, z, max;
		
		System.out.println("숫자 3개를 입력해주세요");
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		if(y>z)
			max=y;
		else if (x>y)
			max=x;
		else
			max=z;
		
		System.out.println("더 큰 수는"+max+"입니다");
	}

}
