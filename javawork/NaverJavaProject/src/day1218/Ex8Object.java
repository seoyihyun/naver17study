package day1218;

class Orange
{
	public static final String MESSAGE = "Happy";
	
	private String name; // String은 초기값 null
	private int age; // int는 초기값 0
	
	public void showData()
	{
		// 인스턴스 멤버 메서드는 this라는 인스턴스 변수를 가지고 있음
		// this.main 이런 식으로 접근 가능(this는 경우에 따라 생략 가능)
		// static 멤버 메서드에는 this가 없음!
		System.out.println("이름 : "+this.name+" 나이 : "+this.age);
		System.out.println("이름 : "+name+" 나이 : "+age); // 생략 가능
	}
	
	// setter method : 값을 변경하기 위한 목적
	public void setName(String name)
	{	
		// 같은 구역에 멤버와 같은 이름의 변수(name = name;)일 경우 멤버변수 앞에 this를 붙여야 함
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age; // this.age에 age 파라미터를 받아옴
	}
}

public class Ex8Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Orange.MESSAGE);
		
		Orange orange = new Orange();
//		System.out.println(orange.name); 에러 : private 변수는 직접 접근 불가
		// private에 접근할 수 있는 방법?
		orange.showData(); // public의 출력문으로 알아냈음;
		
		// 값 변경
		orange.setName("김씨");
		orange.setAge(35);
		orange.showData();

	}

}
