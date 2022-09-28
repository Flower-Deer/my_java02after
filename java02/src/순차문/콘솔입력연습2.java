package 순차문;

import java.sql.Date;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 콘솔입력연습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		int age2 = age + 1;
		
		System.out.println("내년 나이는 " + age2);
		
//		Scanner sc = new Scanner(System.in);
//		JButton b1 = new JButton();
//		JFrame f = new JFrame();
//		JTextField t1 = new JTextField();
//		JTextArea t2 = new JTextArea();
//		Random r = new Random();
//		Date d = new Date(0);
	}

}
