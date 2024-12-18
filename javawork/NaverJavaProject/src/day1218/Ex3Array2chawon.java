package day1218;

public class Ex3Array2chawon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2차원 배열은 행과 열로 할당(열 갯수는 행마다 다를 수 있음)
		
		// 구조 할당하기
//		int [][] arr1 = new int[2][3];
		
		// 각 행마다 열 갯수를 다르게 구조 할당하기
		int [][]arr1 = new int [2][]; // 행 갯수만 선 지정
		// 각 행의 열 갯수를 지정
		arr1[0] = new int[3];
		arr1[1] = new int[4];
		
		System.out.println("행 갯수 : "+arr1.length);
		System.out.println("1번 행 열 갯수 : "+arr1[0].length);
		System.out.println("2번 행 열 갯수 : "+arr1[1].length);
		
		// 2차원 배열에 값 저장하기
		arr1[0][0] = 100;
		arr1[1][1] = 90;
		arr1[1][1] = 95;
		
		for(int i = 0; i<arr1.length; i++) // 행
		{
			for(int j = 0; j<arr1[i].length; j++) // 열
			{
				System.out.printf("%d, %d : %d\t",i,j,arr1[i][j]);
				// 행, 열 : 의 값(arr1[i][j])
			}
			System.out.println();
		}


	}

}
