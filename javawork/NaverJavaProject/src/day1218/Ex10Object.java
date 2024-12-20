package day1218;

import java.text.NumberFormat;

public class Ex10Object {
	
	public static void showTitle()
	{
		System.out.println("번호\t자동차명\t가격");
		System.out.println("=".repeat(30));
	}
	
	// 생성자 선언
	public static void writeCar(int num, car myCar)
	{		
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(num+"\t"+myCar.getCarName()+"\t"+nf.format(myCar.getCarPrice()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car writeCar = new car();
		System.out.println("차 이름 : "+writeCar.getCarName());
		System.out.println("차 가격 : "+writeCar.getCarPrice());
		
		// 객체 배열
		car [] cars = new car[5]; // 배열 할당 시 객체는 무조건 초기값이 null이기 때문에 호출이 안됨
		// 호출 가능을 위해선 배열 5개의 각 car 객체 별도 생성 필요
		for(int i =0; i<cars.length; i++)
			cars[i] = new car();
		
		cars[0].setData("그랜저", 5000);
		cars[1].setData("아반떼", 4000);
		cars[2].setData("모닝", 3000);
		cars[3].setData("미니", 2000);
		cars[4].setData("아우디", 1000);
		
		// 제목부터 출력
		showTitle();
		// 내용 출력
		for(int i = 0; i<cars.length; i++)
		{
			writeCar(i+1, cars[i]);
		}
		/*
		 * 다른 방법으로 출력
		 * int n=0;
		 * for(car car:cars)
		 * {
		 * writeCar(++n, car);
		 */
		
		

	}

}
