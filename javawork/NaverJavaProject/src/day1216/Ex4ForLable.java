package day1216;

public class Ex4ForLable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 케이스에 따라 적절히 while, for, Loop, break, continue;를 사용해야 함
		
		Loop : // 레이블 명은 맘대로~~ 자바에만 있음
			for(int i=1; i<=3; i++)
			{
				for(int j=1; j<=4; j++)
				{
//					if(i==2)
//						continue Loop; // for문의 조건식인 i++로 이동, i==2 케이스를 출력하지 않음
//					if(j==3)
//						continue Loop; // i++로 이동, j==3 케이스를 출력하지 않음 / 3이 되면서 바깥으로 빠져나감
//					if(j==3)
//						break; //위와 같음
					if(j==3)
						break Loop; //j가 3이될 때 바깥쪽 for문을 빠져나가므로 종료됨(=i++ 반복 불가)
					System.out.println("i="+i+", j="+j);
				}
				
			}

	}

}
