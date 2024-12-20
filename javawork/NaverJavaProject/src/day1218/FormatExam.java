package day1218;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 생각나는김에 배움 .. 
		
		Date date = new Date();
		System.out.println(date); // Wed Dec 18 15:54:39 KST 2024
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		// M:월, m:분 H:24시간, h:12시간, E:요일, a:오전/오후 
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년MM월dd HH:mm EEE");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm EEEE");
		
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
		System.out.println(sdf3.format(date));
		System.out.println(sdf4.format(date));
		
		System.out.println("=".repeat(20));
		int num1 = 123456;
		int num2 = 89123;
		NumberFormat nf1 = NumberFormat.getInstance();
		System.out.println("num1 = "+nf1.format(num1));
		System.out.println("num2 = "+nf1.format(num2));
		
		System.out.println("=".repeat(20));
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();
		// 앞에 공백 있게 출력되는 이유는 한글(\)이 포함되는데 출력 못해서
		System.out.println("num1 = "+nf2.format(num1));
		System.out.println("num2 = "+nf2.format(num2));
		
				
		
		

	}

}
