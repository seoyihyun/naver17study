package day1212;

public class Ex2Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int su1=10;
		int su2=4;
		
		System.out.println(su1+su2);
		System.out.println(su1-su2);
		System.out.println(su1*su2);
		System.out.println(su1/su2); //몫이 int타입으로 출력, 2.00이 아니라 2로 출력됨
		System.out.println(su1%su2); //나머지
		
		// 소수자리까지 나오게 하기 double로 캐스팅
		System.out.println((double)(su1/su2)); //한거번에하면 0나옴
		System.out.println((double)su1/su2); //하나에만 붙이던
		System.out.println(su1/(double)su2);
		System.out.println((double)su1/(double)su2); //둘다 붙이던

		System.out.println("==========================");
		
		//돈의 단위 별 금액 추출
		int money=3456789;
		
		System.out.println("만원:"+money/10000+"개");
		System.out.println("천원:"+((money-(money-6789))/1000)+"개");
		System.out.println("천원:"+money%10000/1000+"개");
		System.out.println("백원:"+money%1000/100+"개");
		System.out.println("십원:"+money%100/10+"개");
		System.out.println("일원:"+money%10+"개");
		
		
		
		

	}

}
