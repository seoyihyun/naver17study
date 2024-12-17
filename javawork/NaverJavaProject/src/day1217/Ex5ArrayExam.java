package day1217;

public class Ex5ArrayExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] data = {1, 20, -30, -40, 50};
		int max = data[0]; // 첫 데이터를 최대 값으로 지정
		int min = data[0]; 
		// 나머지 값들과 비교해서 max보다 더 큰 값이 나오면 그 값을 max에 저장할 예정
		
		for(int i=1; i<data.length;i++)
		{
			if(max<data[i]) // max가 더 작으면(반복) 
			{
				max=data[i]; // 젤 큰게 max가 됨
			}
			if(min>data[i])
			{
				min=data[i];
			}
		}
		System.out.println("max="+max);
		System.out.println("min="+min);
		
	}

}
