package day1212;

public class Ex5Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 조건(삼항)연산자 : 조건식1 ? T : F (값)
		// 조건이 n개일 경우 : 조건식1 ? T(조건식2)? T(조건식3)? T : F
		
		int x,y,max;
		x=5;
		y=13;
		
		max=x>y?x:y;
		System.out.println("max="+max);
		
		int z=20;
		max=x>y&&x>z? x:y>x&&y>z? y:z;
		System.out.println("max="+max);
		
		int score = 89;
		char grade;
		//수식을 구현 : 90이상이면 A 80이상이면 B 70이상이면 C 60 이상이면 D 나머지면 F
		
		grade=(char) (score>=90?'A':'B');
		System.out.println(grade);
		
		grade=(char) (score>89? 'A':score>79 && score<90? 'B':score>69 && score<80? 'C': score>59 && score<70? 'D':'F');
		System.out.println(score+"점은"+grade+"입니다.");
		
		grade=score>=90?'A':score>=80?'B':score>=70?'C':score>=60?'D':'F';
		System.out.println(score+"점은"+grade+"입니다.");
		
		// 점수가 90이상이면 Good 아니면 Try 출력
		System.out.println(score+"점수는"+(score>=90?"Good!":"Try"));
	}

}
