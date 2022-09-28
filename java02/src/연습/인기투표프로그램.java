package 연습;

import java.util.Scanner;

public class 인기투표프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		System.out.println("지정번호 이외의 다른번호 클릭 시 종료합니다.");
		while(true) {
			System.out.print("입력 (1)아이유, (2)유재석, (3)방탄 >> ");
			int num = sc.nextInt();
			if (num == 1) {
				num1++;
			}else if(num == 2) {
				num2++;
			}else if(num == 3) {
				num3++;
			}else {
				System.out.println("시스템 종료");
				System.out.println("아이유 : " + num1);
				System.out.println("유재석 : " + num2);
				System.out.println("방탄 : " + num3);
				System.exit(0);
			}
		}
		
	}

}
