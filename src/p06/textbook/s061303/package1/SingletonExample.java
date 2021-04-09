package p06.textbook.s061303.package1;

public class SingletonExample {
	public static void main(String[] args) {

		/*
		 * Singleton obj1 = new singleton(); Singleton obj2 = new singleton();
		 */

		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		} else {
			System.out.println("다른 Singleton 객체 입니다.");
		}
	}
}
