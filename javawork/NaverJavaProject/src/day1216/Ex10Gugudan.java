package day1216;

public class Ex10Gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i=2; i<=9; i++)
		{
			System.out.print("["+i+"단]\t");
		}
		System.out.println();
		System.out.println("=".repeat(62));
		
		for (int i = 1; i<=9; i++)
		{
			for(int j = 2; j<=9;j++)
			{
				System.out.print(j+"x"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		System.out.println("=".repeat(62));
		
		for (int i=2; i<=9; i++)
		{
			for(int j=1; j<=1; j++)
			{
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
		}
		System.out.println();
		for (int i=2; i<=9; i++)
		{
			for(int j=2; j<=2; j++)
			{
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
		}
		System.out.println();
		for (int i=2; i<=9; i++)
		{
			for(int j=3; j<=3; j++)
			{
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
		}
		System.out.println();
		for (int i=2; i<=9; i++)
		{
			for(int j=4; j<=4; j++)
			{
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
		}
		System.out.println();
		for (int i=2; i<=9; i++)
		{
			for(int j=5; j<=5; j++)
			{
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
		}
		System.out.println();
		for (int i=2; i<=9; i++)
		{
			for(int j=6; j<=6; j++)
			{
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
		}
		System.out.println();
		for (int i=2; i<=9; i++)
		{
			for(int j=7; j<=7; j++)
			{
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
		}
		System.out.println();
		for (int i=2; i<=9; i++)
		{
			for(int j=8; j<=8; j++)
			{
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
		}
		System.out.println();
		for (int i=2; i<=9; i++)
		{
			for(int j=9; j<=9; j++)
			{
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
			}
		}
		
	}

}
