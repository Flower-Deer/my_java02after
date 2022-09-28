package 연습;

public class For정리문제 {

	public static void main(String[] args) {
		//1-1
		int sum = 0;
		for(int i=33; i<=222; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//1-2
		int sum2 = 0;
		for(int i=55; i<=4500; i+=2) {
			sum2 += i;
		}
		System.out.println(sum2);
		
		//1-3
		int sum3 = 0;
		for(int i=0; i<=6000; i+=5) {
			sum3 += i;
		}
		System.out.println(sum3);
		
		//2번
		int num = 0;
		for(int i=0; i<=1000; i+=3) {
			if(i%5 ==0) {
				num += 0;
			}else if(num >= 100) {
				break;
			}else {
				num += i;
			}
		}
		System.out.println(num);
	}

}
