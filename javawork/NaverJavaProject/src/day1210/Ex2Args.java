package day1210;

public class Ex2Args {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("첫번째값:"+args[0]);
		System.out.println("두번째값:"+args[1]);
		
		System.out.println(args[0]+args[1]);
		
		int a1=Integer.parseInt(args[0]);
		int a2=Integer.parseInt(args[1]);
		
		System.out.println("두 수의 합은 "+(a1+a2)+" 입니다");
		
		System.out.println("3번째:"+args[2]);
		System.out.println("4번째:"+args[3]);
		
		System.out.println(args[2]+args[3]);
		
		int a3 = Integer.parseInt(args[2]);
		int a4 = Integer.parseInt(args[3]);
		
		System.out.println("두 수의 합 = "+(a3+a4));
	}

}
