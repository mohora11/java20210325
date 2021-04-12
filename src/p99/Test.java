package p99;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력::");
		String a = scanner.next();
		String b = scanner.nextLine();
		
		System.out.println("a:" + a);
		System.out.println("b:" + b);
		
		scanner.close();
	}
}
