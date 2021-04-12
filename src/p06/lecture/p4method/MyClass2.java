package p06.lecture.p4method;

public class MyClass2 {
	int a; //필드값
	
	void method1(int b) {
		int c = 99;
		int a = 10000; // 지역변수  필드값과 지역변수 둘다 값이 지정될때 지역변수가 우선
		System.out.println("a:" + a);
		System.out.println("this.a:" + this.a); //this를 사용하면 필드값을 불러올수있음
		System.out.println("b:" + b);
		System.out.println("c:" + c);
		
	}
}
