package day1217;

public class Ex13NumberSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] data = {4,1,5,3,2};
		
		// selection sort
		for(int i=0; i<data.length-1;i++) //-1을 안하고 끝까지 가도 상관은 없음
		{
			for(int j=i+1; j<data.length;j++) // j는 i 다음꺼
			{
//				if(data[i]<data[j]) // 내림차순 정렬
				if(data[i]>data[j]) // 오름차순 정렬
				{
					int temp = data[i]; // 새로운 변수 설정하고
					data[i] = data[j]; // 옮기기
					data[j] = temp;
				}
			}	
		}
		for(int i=0; i<data.length;i++)
			System.out.println(i+":"+data[i]);
	}

}
