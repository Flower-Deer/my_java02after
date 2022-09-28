package 조건문;

public class IfElse테스트2 {

	public static void main(String[] args) {
		int jumsu = 85;
		//쓰레기값X 공백 or 0 (초기값)을 반드시 할당해주기
		String result = "";
		
		if (jumsu >= 90) {
			result = "A학점";
		}else if (jumsu >= 85 && jumsu <90) {
			result = "B+학점";
		}else if (jumsu >= 80 && jumsu <85) {
			result = "B-학점";
		}else if (jumsu >= 70 ) {
			result = "C학점";
		}else {
			result = "D학점";
		}
	
		System.out.println("당신의 학점은 " + result);
	}

}
