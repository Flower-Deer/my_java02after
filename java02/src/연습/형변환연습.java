package 연습;

public class 형변환연습 {

	public static void main(String[] args) {
		int a = 100; //방4개
		byte b = 50; //1개
		a = b; //byte -->int 타입변환
		//큰공간 <-- 작은공간데이터(자동형변환)
		
		int c = 200; //4개
		b = (byte)c;
		//작은공강 <-- 큰공간대이터(강제형변환)
		//(작은공간이름)변수
		//조심할 것 : 작은 공간에 들어갈 수 있는 '범위'여야한다.
		//byte = -128~127
		System.out.println(b); //-56이 나온다 >오류
	}
}