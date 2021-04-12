package p06.lecture.p5static;

public class MyClass2 {
	
	// class field(= static field) 스태틱, 클래스 필드 메소드를 묶어서 스태틱 or 클래스 멤버
	static int i;
	
	// instance field //인스턴스 필드,메소드 묶어서 인스턴스 멤버
	int j;
	
	// class method (= static method)
	static void method() {
		System.out.println("method()");
	}
	
	// instance method
	void method1() {
		System.out.println("method1()");
	}
}
