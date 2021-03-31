package p04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		// 1 ~ 10
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		
		// 1 ~ 10 홀수만
		for(int a = 1; a <10; a += 2) {
			System.out.println(a);
		}
		// 1 ~ 10 짝수만
		for(int b = 2; b <= 10; b += 2) {
			System.out.println(b);
		}
		// 10 ~ 1
		for(int c = 10; c >= 1; c--) {
			System.out.println(c);
		}
		// 10~1 짝수만
		for(int d = 10; d >= 1; d -= 2) {
			System.out.println(d);
		}
		// 10~1홀수만
		for(int e = 9; e >= 1; e -= 2 ) {
			System.out.println(e);
		}
	}
}
