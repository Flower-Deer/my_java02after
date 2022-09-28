package 연습;

import java.util.Scanner;

import javax.sound.sampled.Line;

public class 콘솔확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		System.out.println("내년 나이는 " + age + "세");
		
		System.out.print("키를 입력 >> ");
		double st = sc.nextDouble();
		st += 10;
		System.out.println("당신의 키는 " + st);
		
		System.out.print("저녁을 먹었는지 입력 (true/false) >> ");
		boolean food = sc.nextBoolean();
		if(food == true) {
			System.out.println("배가 부르시겠군요");
		}else {
			System.out.println("배가 고프시겠군요");
		}
		
		System.out.print("올해의 목표는 >> ");
		sc.nextLine();
		String moc = sc.nextLine();
		System.out.println("올해의 목표는 " + moc);
	}

}
