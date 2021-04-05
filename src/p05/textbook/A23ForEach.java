package p05.textbook;

public class A23ForEach {
	public static void main(String[] args) {
		// for each
		// 향상된  for 문
		
		int[] arr1 = {9, 8, 7, 6};
		
		// for
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		
		// for each
		for (int n : arr1) {
			System.out.print(n);
		}
	}
}
