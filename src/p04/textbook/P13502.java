package p04.textbook;

public class P13502 {
	public static void main(String[] args) {
//		String line = "";
//		
//		for (int i = 0; i < 5; i++) {
//			line += "*";
//			System.out.println(line);
//		} for 한번만 쓰고 출력 ㅎㅎ
		for (int x = 1; x <= 5; x++) {
			for (int y = 1; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
