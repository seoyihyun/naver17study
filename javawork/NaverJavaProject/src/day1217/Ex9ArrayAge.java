package day1217;

public class Ex9ArrayAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] datas = {12,34,54,20,33,59,41,44,27,21};
		System.out.println("인원 수 : "+datas.length);
		/*
		 * 위의 배열 데이터를 분석하여 10대부터 50대까지의 각각 인원수를 구하시오
		 * 배열 변수 []age 사용
		 * 0번지에는 10대 인원수 ???
		 * 예시
		 * 10대:1명 20대:3명
		 */
		
		int [] age = new int[5];
		
		for(int i=0; i<datas.length; i++)
		{	
			//연령별 인원 수 구하기
			//10대일 경우 0번지 증가, 20대일 경우 1번지 증가...
			age[datas[i]/10-1]++; 
			//10~19부터 10으로 나누면 무조건 1임, 10대는 0번지일거니까 -1
		}
		for(int i=0; i<age.length;i++)
		{
			System.out.println((i+1)*10+"대 :"+age[i]+"명");
		}

	}

}
