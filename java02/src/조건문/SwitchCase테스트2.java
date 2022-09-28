package 조건문;

import java.util.Date;

public class SwitchCase테스트2 {

	public static void main(String[] args) {
		//f2
		Date date = new Date();
		int yeat = date.getYear();
		int month = date.getMonth() + 1; //1을 더해줘야 함
		int day = date.getDay(); //0일요일~6토요일
		switch(day) {
		case 0 : case 6 :
			System.out.println("주말이니까 놀자");
			break;
		default:
			System.out.println("자바 공부하러 가자.");
			}
		}
		
}
