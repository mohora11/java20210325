package p08.lecture.ex2;

public interface MyInterface {
	// public static final 필드
	public static final int MY_FIELD1 = 1;
	int MY_FIELD2 = 2; //public static final 이 항시 적용되기에
					   //생략가능
	
	String str = "김";
	// public static 메소드 (클래스 메소드)

	public static void staticMethod1() {
		System.out.println("static Method1");
	}
	static void staticMethod2() {
		System.out.println("static method2");
	}
	
	// public abstract 메소드 (인스턴스 메소드)
	
	public abstract void method1(); //abstract는 ;이걸로끝내야함 중괄호 ㄴ
	void method2(); //앞에 public abstract는 생략가능
	
	// public default 메소드 (인스턴스 메소드)
	
	public default void defaultMethod1() {
		System.out.println("default method1");
	}
	
	default void defaultMethod2() {
		System.out.println("default method2");
	}
}
