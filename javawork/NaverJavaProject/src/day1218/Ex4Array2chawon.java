package day1218;

public class Ex4Array2chawon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열에 선언 시 초기값 지정
		
		int [][] arr1 =
		{
			{1,2,3},
			{4,5,6,7}, // 콤마로 연결 / 가로 작성 가능
			{8,9,10}
		};
		System.out.println("행 갯수 : "+arr1.length);
		System.out.println("0번 행의 열 갯수 : "+arr1[0].length);
		System.out.println("1번 행의 열 갯수 : "+arr1[1].length);
		System.out.println("2번 행의 열 갯수 : "+arr1[2].length);
		
		// 값만 출력하기
		for(int i = 0; i < arr1.length; i++)
		{
			for(int j = 0; j < arr1.length; j++)
				System.out.print(arr1[i][j]+"\t");
		}

	}

}
