package p09.lecture;

public class A05ThisKeyword {
	int i = 0;
	
	void method() {
		System.out.println(this.i);
	}
	
	class InnerClass {
		int i = 3;
		
		void method1() {
			int i = 4;
			
			System.out.println(i); // Inner클래스의 메소드 값
			System.out.println(this.i); // A05클래스 중첩클래스 Inner클래스 필드값
			System.out.println(A05ThisKeyword.this.i); // A05클래스의 필드값
		}
	}
}
