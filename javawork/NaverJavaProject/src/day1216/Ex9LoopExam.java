package day1216;

public class Ex9LoopExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 다중 for문을 이용해서 * 찍기
		 */
		
		for(int i=1; i<=5;i++) // 행에 대한 반복
		{
			for(int j=1; j<=5; j++) // 열에 대한 반복
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=".repeat(15));
		
		for(int i=1; i<=5;i++) 
		{
			for(int j=1; j<=i; j++) // j가 i가 될 때까지
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=".repeat(15));
		
		for(int i=1; i<=5;i++) // 
		{
			for(int j=i; j<=5; j++) // 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("=".repeat(15));
	}
	
}
