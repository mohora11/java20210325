package p07.textbook.s070701;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1(); // Child.java에서 수정한적이 없어서 Parent.java 메소드가 실행
		parent.method2(); // 오버라이드되어 Child.java안의 메소드가 실행됨
		//parent.method3(); // 안됨 
	}
}
