public class Apple
{

		public static void main(String []args)
		{
			System.out.println(args[0]);
			System.out.println(args[1]); 

			System.out.println("두수를 더해보자");
			System.out.println(args[0]+args[1]); 

			int su1=Integer.parselnt(args[0]); 
			int su2=Integer.parselnt(args[1]);
			System.out.println("두수의 합은 "+(su1+su2)+"입니다");
		}

}