package 연습;

import java.util.Date;

public class Date1 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int h = date.getHours();
		if (h < 11) {
			System.out.println("굿모닝");
		}else if (h < 15) {
			System.out.println("굿애프터눈");
		}else {
			System.out.println("굿나잇");
		}
	}

}
