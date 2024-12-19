package day1219;

import java.util.Scanner;

public class Ex11MyCarArray {

	public static void writeMyCar(MyCar myCar) {
		System.out.println(myCar.getCarName()+myCar.getCarPrice()
		+myCar.getCarColor()+myCar.getPayDay());
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner sc = new Scanner(System.in);
			MyCar [] myCar;
			int count;
			/*
			 *  입력할 배열 갯수를 입력 후 메모리 할당
			 *  
			 */
			System.out.println("등록할 자동차 갯수는?");
			count = Integer.parseInt(sc.nextLine());
			
			myCar = new MyCar[count];
			
			// 데이터 입력
			for(int i=0; i<myCar.length; i++) {
				System.out.println("자동차명은?");
				String carName = sc.nextLine();
				System.out.println("자동차 색상은?");
				String carColor = sc.nextLine();
				System.out.println("자동차 가격은?");
				int carPrice = Integer.parseInt(sc.nextLine());
				
				// MyCar 생성
				myCar[i] = new MyCar(carName, carPrice, carColor);
				System.out.println();
			}
				
				// 출력
				for(MyCar my : myCar)
					writeMyCar(my);
				
			

		}

	}
