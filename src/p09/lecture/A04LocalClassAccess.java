package p09.lecture;

public class A04LocalClassAccess {
	void method(int param) {
		// param과 localVar는 묵시적 final(effectively final)
		int localVar = 3; // final이라고 생각해야됨
//		localVar = 4; 값을 변경할 수 없음
//		param = 1;
		class LocalClass {
			void mothod1() {
				System.out.println(localVar);
				System.out.println(param);
			}
		}
	}
}
