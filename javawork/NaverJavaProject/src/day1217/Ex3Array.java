package day1217;

public class Ex3Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]arr1;
		arr1 = new int[5];
		
		arr1[0]=23;
		arr1[3]=50;
		// 나머지 인덱스에는 초기값 0이 저장됨
		
		for(int i=0; i<arr1.length;i++) // arr1의 length까지 반복 = arr1의 인덱스인 4까지 반복
		{
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		System.out.println("=".repeat(20));
		
		int[]arr2 = new int[5];
		arr2 = new int[]{1,2,3,4,5};
		for(int i=0; i<arr2.length;i++) // arr1의 length까지 반복 = arr1의 인덱스인 4까지 반복
		{
			System.out.println("arr1["+i+"]="+arr2[i]);
		}
		System.out.println("=".repeat(20));
		
		int[]arr3 = {10, 20, 30, 40, 50};
		for(int i=0; i<arr3.length;i++)
		{
			System.out.println("arr3["+i+"]="+arr3[i]);
		}
	}
}
