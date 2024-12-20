package day1218;

class Color
{
	// 필드 선언
	public static final String color = "red";
	private String name;
	private int code;
	
	// 생성자 선언 : 값을 변경하기 위함
	// set letter
	public void setName(String name)
	{
		this.name = name;
	}
	public void setCode(int code)
	{
		this.code = code; // code 파라미터를 받아옴
	}
	public void showData() // 출력
	{
		System.out.println("이름:"+name+"\t코드:"+code);
	}
	
	// 아래class에 새로운 출력문을 생성할 때
	public String getName()
	{
		return this.name;
	}
	public int getCode()
	{
		return this.code;
	}
	public void setData(String name, int code) // 호출?
	{
		this.setName(name);
		this.setCode(code);
	}
}

public class ObjectExamPractice {
	
	// 본 class 내 신규 출력문 생성
	public static void writeColor(Color myColor)
	{
		System.out.println(myColor.getName());
		System.out.println(myColor.getCode());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Color color = new Color();
		color.showData(); // 출력문임
		color.setName("다홍색");
		color.setCode(3);
		color.showData();
		
		Color c1 = new Color();
		c1.setName("레드");
		c1.setCode(5);
		writeColor(c1); // 출력문
		
		

	}

}
