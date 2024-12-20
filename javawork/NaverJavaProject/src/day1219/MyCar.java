package day1219;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyCar {
	private String carName;
	private int carPrice;
	private String payDay;
	private String carColor;

	// 생성되는 시간을 payDay에 넣기
	public MyCar() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		payDay = sdf.format(new Date());

		carColor = "흰색";
	}
	public MyCar(String carName, int carPrice, String carColor) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		payDay = sdf.format(new Date());

		this.carName = carName;
		this.carPrice = carPrice;
		this.carColor = carColor;
	}
	@Override // 똑같은걸 그대로 구현하는 제너레이터 ? 
	public String toString() {
		return "MyCar [carName=" + carName + ", carPrice=" + carPrice +
				"\nguipDay=" + payDay + ", carColor="
				+ carColor + "]";
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}
	public String getPayDay() {
		return payDay;
	}
	public void setPayDay(String payDay) {
		this.payDay = payDay;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}


}
