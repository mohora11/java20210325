package p05.lecture;

public class A08CallByValue {
	public static void main(String[] args) {
		int i = 3;
		int j = 3;
		method1(i); // 3 /1
		method1(j); // 3 /2

		String s = "java";
		String u = new String("java");
		String t = "ss";
		System.out.println(System.identityHashCode(s)); // 366712642 /3
		method2(s); //< /4 /5
		System.out.println(System.identityHashCode(u)); // 1829164700 /6
		method2(u); //< /7 /8
		method2(t);
	}

	public static void method1(int a) {
		System.out.println(a);
	}

	public static void method2(String s) {
		System.out.println(s); // java /4 /7
		System.out.println(System.identityHashCode(s));// 366712642 /5 /8

	}
}