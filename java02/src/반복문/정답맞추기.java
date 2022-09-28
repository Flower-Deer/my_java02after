package 반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 정답맞추기 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int target = r.nextInt(100);//0~99
		int count = 0;
		int x = 0;
		
		while(true) {
			String data = JOptionPane.showInputDialog("생각한 숫자 입력");
			int data2 = Integer.parseInt(data);
			count++;
			
			if (data2 == target) {
				System.out.println("정답입니다.!! 축하합니다.!!");
				System.out.println("정답은 " + target);
				break;
			}else {
				System.out.println("정답이 아닙니다...");
				if(data2> target) {
					System.out.println("너무 커요.");
				}else {
					System.out.println("너무 작아요.");
				}
				x++;
			}
		}
		JOptionPane.showMessageDialog(null,"도전횟수 : " + count);
		JOptionPane.showMessageDialog(null,"틀린횟수 : " + x);
		JOptionPane.showMessageDialog(null, "다음에 또 방문해주세요.");
		System.exit(0);//*프로그램 종료
	}
}
