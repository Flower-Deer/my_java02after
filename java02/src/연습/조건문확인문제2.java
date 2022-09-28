package 연습;

import java.util.Scanner;

public class 조건문확인문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("컴퓨터과목 점수 : ");
		int num = sc.nextInt();
		if (num >= 90) {
			System.out.println("A학점");
		}else if (num >= 80) {
			System.out.println("B학점");
		}else if (num >= 70) {
			System.out.println("C학점");
		}else if (num >= 60) {
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
	}

}
