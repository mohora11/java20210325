package p07.lecture.p3method_override;

public class Child extends Parent {
	
	@Override // annotation
	public void method1() {
		// 재정의 메소드의 이름이 같아야함
		System.out.println("method1 - child");
		super.method1();
		
	}

}
