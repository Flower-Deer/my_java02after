package 연습;

import java.util.Scanner;

public class p255 {

	public static void main(String[] args) {
		//1번
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 1 :");
		int num1 = sc.nextInt();
		System.out.print("숫자 2 :");
		int num2 = sc.nextInt();
		
		if(num1 > num2) {
			System.out.println("숫자1이 더크다");
		}else if (num2 > num1) {
			System.out.println("숫자2가 더크다");
		}else {
			System.out.println("같다");
		}
		
		
		//2번
		System.out.println("당신이 좋아하는 과목은?");
		String data =sc.next();
		switch(data) {
			case "자바":
				System.out.println("JSP로 점프");
				break;
			case "파이썬":
				System.out.println("장고로 점프");
				break;
			default :
				System.out.println("무조건 열심히!!");
		}
		
		
	}

}
