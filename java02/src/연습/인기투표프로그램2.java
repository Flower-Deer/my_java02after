package 연습;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ImageIcon;

public class 인기투표프로그램2 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;		
		while(true) {
			//JOptionPane.showInternalInputDialog(null, "이번 주 인기 노래는?(1.아이유-라일락 2.프로미스나인-wego 3.스테이씨-ASAP)");
			String edit = JOptionPane.showInputDialog("이번 주 인기 노래는?(1.아이유-라일락 2.프로미스나인-wego 3.스테이씨-ASAP)");
			int num = Integer.parseInt(edit);
			if (num == 1) {
				num1++;
			}else if(num == 2) {
				num2++;
			}else if(num == 3) {
				num3++;
			}else {
				break;
			}
		}
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(192, 192, 192));
		f.setSize(500,900);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\정유진\\Desktop\\멀티캠퍼스\\image\\다운로드.jfif"));
		lblNewLabel.setBounds(37, 84, 213, 217);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("K-POP 인기 투표");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(110, 26, 287, 48);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\정유진\\Desktop\\멀티캠퍼스\\image\\다운로드 (1).jfif"));
		lblNewLabel_2.setBounds(37, 338, 213, 217);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\정유진\\Desktop\\멀티캠퍼스\\image\\다운로드 (2).jfif"));
		lblNewLabel_3.setBounds(37, 597, 213, 217);
		f.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("1. 아이유 - 라일락");
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_4.setBounds(262, 110, 212, 40);
		f.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("2.프로미스나인-we go");
		lblNewLabel_4_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_4_1.setBounds(262, 371, 212, 40);
		f.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("3.스테이씨 - ASAP");
		lblNewLabel_4_2.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_4_2.setBounds(262, 634, 212, 40);
		f.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lb1 = new JLabel(num1 +"표");
		lb1.setFont(new Font("굴림", Font.PLAIN, 30));
		lb1.setBounds(289, 185, 135, 69);
		f.getContentPane().add(lb1);
		
		JLabel lb2 = new JLabel(num2 +"표");
		lb2.setFont(new Font("굴림", Font.PLAIN, 30));
		lb2.setBounds(289, 445, 135, 69);
		f.getContentPane().add(lb2);
		
		JLabel lb3 = new JLabel(num3 +"표");
		lb3.setFont(new Font("굴림", Font.PLAIN, 30));
		lb3.setBounds(289, 698, 135, 69);
		f.getContentPane().add(lb3);
		f.setVisible(true);
	}
}
