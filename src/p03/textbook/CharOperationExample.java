package p03.textbook;

public class CharOperationExample {
	public static void main(String[] args) {
		char c1 = 'A' + 1;
		char c2 = 'A';
		//char c3 = c2 + 1;		//컴파일 에러 이러면 int로 읽게됨 
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		//System.out.println("c3: " + c3);
		char c3 = (char) (c1+1); // 그리하여 char로 강제타입변환 (char)로 선언해주면 c가 출력됨
		System.out.println(c3);
	}
}
