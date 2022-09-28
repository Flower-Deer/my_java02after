package 조건문;

public class SwitchCase테스트 {
	public static void main(String[] args) {
		//shwich문 : 정수(long(X)), 문자1, 문자열 만가능
		String name = "자바";
		
		//if와 달리 자체 break가 없음
		switch(name) {
		case "파이썬" :
			System.out.println("1103호로!");
			break;
		case "자바" :
			System.out.println("1104호로!");
			break;
		case "리눅스" :
			System.out.println("1102호로!");
			break;
		default : //else와 동일, '*생략가능'
			System.out.println("카운터에가서 문의하세요.");
			break;
		}
		
	}
}
