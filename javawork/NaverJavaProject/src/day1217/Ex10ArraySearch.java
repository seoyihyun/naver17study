package day1217;

import java.util.Scanner;

public class Ex10ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 데이터(문자, 숫자) 찾기
		
		int [] datas = {1,3,18,6,7,8,20,13,16,11};
		int searchNum;
		boolean find;

		/*
		 * 숫자를 입력하면 그 숫자가 몇번째 있는 지 출력
		 * 없을경우 해당 숫자가 없습니다 라고 출력
		 * 0 입력 시 검색 종료(while문 사용)
		 */
		
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			find = false; // 입력 값을 찾았을 경우 true로 변경
			System.out.println("검색할 숫자는?(종료코드 : 0)");
			searchNum = sc.nextInt();
			if(searchNum==0)
				System.out.println("프로그램 종료");
				break;
		}
		for(int i=0; i<datas.length;i++)
		{
			if(searchNum==datas[i])
			{
				find=true;
				System.out.println((i+1)+"번째에 있습니다");
				break;
			}
		}
		
		// 못찾았을 경우
		if(!find) // find==false
		{
			System.out.println("해당 숫자는 없습니다");
		}

	}

}
