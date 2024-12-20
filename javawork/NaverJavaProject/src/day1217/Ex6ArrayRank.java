package day1217;

public class Ex6ArrayRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 등수 구하기  동점은 동순위 부여
		
		int[]score = {56, 89, 100, 89, 67};
		int[]rank = new int[score.length];
		
		for(int i=0; i<score.length;i++) // 얘를 기준으로 
		{	
			rank[i]=1; // 1부터 증가 시작
			
			for(int j=0;j<score.length;j++) // 얘를 비교하면서 rank
			{
				if(score[i]<score[j])
					rank[i]++; // 높으면 +1
			}
		}
		System.out.println("번호\t점수\t등수");
		System.out.println("=".repeat(20));
		
		for(int i=0; i<score.length; i++)
			System.out.println(i+1+"\t"+score[i]+"\t"+rank[i]);

	}

}
