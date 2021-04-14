package p08.lecture.ex1;

public class A01Interface {
	public static void main(String[] args) {
		Cat c1 = new Cat();
		Malamute d1 = new Malamute();
		
		KindaCat k1 = c1;
		Pet p1 = c1;
		p1.sit();
		c1.sit(); //인터페이스로 c1과 d1을 묶어서 sit기능 사용
		
		
		KindaDog k2 = d1;
		Pet p2 = d1;
		p2.sit();
		d1.sit();
		
//		Pet p3 = new Pet(); // x 인터페이스는 인스턴스를 만들수없다		
	}
}
