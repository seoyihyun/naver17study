package day1218;

class Drink 
{	
	// 필드 선언
	String model = "우유";
	String color = "노랑색";
	int bottle = 250;
}

public class ObjectFieldPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 필드값 읽기
		Drink milk = new Drink();
		System.out.println("모델 :"+milk.model);
		System.out.println("색깔 :"+milk.color);
		System.out.println("1병 :"+milk.bottle);
		
		// 필드값 변경
		milk.color = "핑크색";
		System.out.println("색깔 :"+milk.color);
		

	}

}
