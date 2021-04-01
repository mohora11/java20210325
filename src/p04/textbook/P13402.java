package p04.textbook;

public class P13402 {
	public static void main(String[] args) {

		while (true) {
			int v = (int) (Math.random() * 6) + 1;
			int k = (int) (Math.random() * 6) + 1;

			System.out.println("(" + v + "," + k + ")");
			if (v + k == 5) {
				break;
			}
		}

	}
}
