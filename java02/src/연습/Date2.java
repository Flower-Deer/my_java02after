package 연습;

import java.util.Date;

public class Date2 {

	public static void main(String[] args) {
		Date date = new Date();
		
		int month = date.getMonth();
		int day = date.getDay();
		
		switch(month){
			case 2:
				System.out.println("28일까지");
				break;
			case 4: case 6: case 7: case 11:
				System.out.println("30일까지");
				break;
			default :
				System.out.println("31일까지");
		}
	}

}
