package day1217;

public class Ex15ArrayRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []numbers = new int[20];
		/*
		 *  배열에 1~50 사이의 난수 20개를 구해서 넣고
		 *  오름차순으로 정렬해서 출력을 하시오
		 */

		Loop :
			for(int i = 0; i<numbers.length;i++)
			{	
				// 난수 구하기
				numbers[i] = (int)(Math.random()*50)+1;	

				// 이 전에 발생한 값이랑 같을 경우 중복 제거 로직 추가
				for(int j=0; j<i; j++)
				{
					if(numbers[i]==numbers[j])
					{	
						i--;
						break; //방법1
						// continue Loop; (i++로 직접 이동, 방법2)
					}
				}
			}
		// 정렬
		for(int i=0; i<numbers.length; i++)
		{
			for(int j=i+1; j<numbers.length; j++)
			{
				if(numbers[i]>numbers[j])
				{
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		// 출력, 한줄에 5개씩만
		for(int i = 0; i<numbers.length; i++)
		{
			System.out.println(i+" : "+numbers[i]+"\t");
			if((i+1)%5==0)
				System.out.println();
		}
	}

}
