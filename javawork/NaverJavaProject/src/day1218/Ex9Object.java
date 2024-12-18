package day1218;

class car
{
	// 얘는 static이지만 메서드를 통해 변경
	static String carCompany = "현대";
	
	private String carName;
	private int carPrice;
	
	// 생성자 선언
	public static void setCarCompany(String carCompany)
	{
		// static 메서드에서는 static 변수만 접근 가능
		car.carCompany = carCompany;
	}
	
	public void setCarName(String carName)
	{
		this.carName = carName;
	}
	public void setCarPrice(int carPrice)
	{
		this.carPrice = carPrice;
	}
	
	// getletter method : 값을 보내는 것이 목적
	public String getCarName()
	{
		return this.carName; // this 생략 가능
	}
	public int getCarPrice()
	{
		return carPrice;
	}
	
	// 두개 동시에 호출
	public void setData(String carName, int carPrice)
	{
		this.setCarName(carName);
		this.setCarPrice(carPrice);
	}
	
}

public class Ex9Object {
	
	public static void writeCarInfo(car myCar)
	{
		System.out.println("자동차명 : "+myCar.getCarName());
		System.out.println("가격 : "+myCar.getCarPrice());
		System.out.println("=".repeat(30));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("현재 자동차 회사 명 : "+car.carCompany);
		car.setCarCompany("삼성");
		System.out.println("변경된 자동차 회사 명 : "+car.carCompany);
		
		car car1 = new car();
		car1.setCarName("그랜저");
		car1.setCarPrice(3900);
		
		car car2 = new car();
		car2.setCarName("쏘나타");
		car2.setCarPrice(3200);
		
		car car3 = new car();
		car3.setCarName("mini");
		car3.setCarPrice(5000);
		
//		System.out.println("car1 자동차명 : "+car1.getCarName());
//		System.out.println("car1 자동차 가격 : "+car1.getCarPrice());
//		System.out.println("car2 자동차명 : "+car2.getCarName());
//		System.out.println("car2 자동차 가격 : "+car2.getCarPrice());
		
		// 본 class 내에 신규 생성한 static 변수로 호출
		writeCarInfo(car1);
		writeCarInfo(car2);
		writeCarInfo(car3);
		
		

	}

}
