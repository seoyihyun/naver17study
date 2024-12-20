package day1219;

class Orange {
	// 멤버변수 선언
	private String name;
	private String color;
	private int age;
	
	// 생성자 선언 : 오렌지를 몇개 생성하든 초기 값은 아래와 같게 됨
	Orange() { 
		this.name = "로로";
		this.color = "노랑";
		this.age = 30;
		
		// 생성자에서 다른 생성자를 호출할 때 this() 사용
		// this("로로", "노랑", 30) 으로 해도 됨 -> 인자 동일한 생성자 호출
	}
	// 생성자 선언 : 이름하고 컬러만 유동적이게 만들고싶다? 파라미터를 받을게
	Orange(String name, String color) {
		this.name = name;
		this.color = color;
		this.age = 30;
	}
	
	// 출력 구조 선언
	public void writeMember()
	{
		System.out.println("name="+name+", color="+color+", age="+age);
	}
	public void writeMember(int n) {
		if(n==1) {
			System.out.println("이름 : "+name);
			System.out.println("좋아하는 색 : "+color);
			System.out.println("나이 : "+age);
		} else if(n==2) {
			System.out.println(name+"님은"+color+"색 좋아해요");
		} else {
			System.out.println("1, 2 만 가능");
		}
	}
}

public class Ex4Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Orange orange1 = new Orange();
		orange1.writeMember();
		
		Orange orange2 = new Orange("민시","파랑");
		orange1.writeMember();
		
		Orange orange3 = new Orange();
		orange3.writeMember(1); // int
		orange3.writeMember(2); // int
		orange3.writeMember(3); // int

		
		
		
		
		

	}

}
