package p09.lecture;

public class A06AnonymousClass {
	public static void main(String[] args) {
		int locaVar = 3;
		
//		locaVar = 4; //안됌 이미 final이 묵시적으로 적용되어있음
		
//		args = new String[] {}; //파라미터 역시 위 내용과 같음
		
		MyInterface i1 = new MyInterface() {
			void method() {
				System.out.println(locaVar);
				System.out.println(args);
			}
		};
	}
}
