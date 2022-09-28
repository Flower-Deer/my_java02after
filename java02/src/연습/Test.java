package 연습;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pre = 0; //앞
		int post = 0; //뒤
		while(true) {
			System.out.println("숫자 두개를 입력해주세요");
			int x = sc.nextInt();
			int y = sc.nextInt();
			if(x>y) {
				System.out.println("앞 숫자가 더 큽니다.");
				pre++;
			}else if(x<y) {
				System.out.println("뒷 숫자가 더 큽니다");
				post++;
			}else {
				System.out.println("같습니다.");
			}
			
			System.out.print("계속할까요? o,x : ");
			String ox = sc.next();
			char exit = ox.charAt(0);
			if(exit == 'o') {
				System.out.println("한번 더 🤞");
			}else {
				System.out.println("앞이 큰 경우는 " + pre + "회");
				System.out.println("뒤가 큰 경우는 " + post + "회");
				System.out.println("bye bye 😜");
				System.exit(0);
			}
		}
	}
}
