package p05.lecture;

public class A16CallByValue {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = i * 2;
		}

		print(arr1);

		int[] arr2 = new int[5];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = i * 100;
		}

		print(arr2);

		int[] arr3 = new int[4];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = i + 30;
		}

		print(arr3);
	}

	public static void print(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);

		}
	}
}
