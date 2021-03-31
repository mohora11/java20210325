package p04.textbook;

public class ForMultiplicationTableExample2 {
	public static void main(String[] args) {
		String txt = "";
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				txt += "*";
			}
			txt += "\n";
		}
		System.out.println(txt);
		
		System.out.println("===============");
		
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------2");
		for (int i = 4; i >= 0; i--) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------3");
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("----------------------------4");
		for (int i = 0; i <= 4; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
