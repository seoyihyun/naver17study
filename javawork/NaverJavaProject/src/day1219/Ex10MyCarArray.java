package day1219;

public class Ex10MyCarArray {

	public static void showTitle() {
		System.out.println("자동차명\t가격\t색상\t구입일");
		System.out.println("======================================");
	}

	public static void writeMyCar(MyCar myCar) {
		System.out.println(myCar.getCarName()+"\t"+myCar.getCarPrice()+"\t"
				+myCar.getCarColor()+"\t"+myCar.getPayDay());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCar m1 = new MyCar();
		System.out.println(m1); // mycar class에서 toString이 있을 경우 자동 호출됨

		MyCar m2 = new MyCar("소나타", 3900, "진주색");
		System.out.println(m2);

		// 방법 1
		System.out.println("객체 배열 생성");
		MyCar []carArray1 = {
				new MyCar(),
				new MyCar("그랜저", 5600, "검정색"),
				new MyCar("bmw", 6700, "흰색")
		};

		// 방법 2
		MyCar [] carArray2 = new MyCar[3]; // 메모리 할당, 초기값=null
		carArray2[0] = new MyCar();
		carArray2[1] = new MyCar("그랜저", 5600, "검정색");
		carArray2[2] = new MyCar("bmw", 6700, "흰색");

		// 제목 출력
		showTitle();

		// for문으로 데이터 출력
		for(MyCar my:carArray1)
			writeMyCar(my);
		System.out.println("======================================");
		for(int i = 0; i<carArray2.length; i++)
			writeMyCar(carArray2[i]);


	}

}
