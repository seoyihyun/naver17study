package day1218;

class Book
{	
	// 필드 선언
	String bookModel = "한국사";
	String bookColor;
	int bookPage;
	
	// 생성자 선언 ? 
	public Book(String bookColor, int bookPage)
	{
		this.bookColor = bookColor;
		this.bookPage = bookPage;
	}
}

public class ObjectNewPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 생성
		Book b1 = new Book("파랑색", 250);
		// 객체 데이터 읽기
		System.out.println(b1.bookModel);
		System.out.println(b1.bookColor);
		System.out.println(b1.bookPage);
		
		// 또 다른 객체 생성
		Book b2 = new Book("빨강색", 150);
		// 또 다른 객체 데이터 읽기
		System.out.println(b2.bookModel);
		System.out.println(b2.bookColor);
		System.out.println(b2.bookPage);
		
		
		

		
		

	}

}
