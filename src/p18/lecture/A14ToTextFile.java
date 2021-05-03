package p18.lecture;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class A14ToTextFile {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output4.txt";
		Scanner scanner = new Scanner(System.in);
		
		Writer wr = new FileWriter(file);
		
		String line = "";

		System.out.println(line);

		while (!line.equals("종료")) {
			System.out.print("입력>");
			line = scanner.nextLine();
			wr.write(line + "\n");
		}
		
		wr.close();
		scanner.close();
	}
}
