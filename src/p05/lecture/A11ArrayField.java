package p05.lecture;

public class A11ArrayField {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];

		System.out.println(arr1.length);
		System.out.println(arr2.length);

//		arr1[0] = 10;
//		arr1[1] = 11;
//		arr1[2] = 12;
		for (int k = 0; k < 3; k++) {
			arr1[k] = k + 10;
//			System.out.println("arr1[" + k + "]" + " = " + (k +10) );
		}
//
//		arr2[0] = 100;
//		arr2[1] = 200;
//		arr2[2] = 300;
//		arr2[3] = 400;
//		arr2[4] = 500;
		
		
		for (int k = 0; k < 5; k++) {
			arr2[k] = (k +1) * 100;
//			System.out.println("arr2[" + k + "]" + " = " + 100 * (k + 1));
		}

		System.out.println("arr1 출력");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

		System.out.println("arr2 출력");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println(arr2[3]);
		System.out.println(arr2[4]);

		System.out.println("arr1 출력 (for)");
		// for (int i = 0; i < 3; i++) {
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

		System.out.println("arr2 출력 (for)");
		for (int j = 0; j < 5; j++) {
			System.out.println(arr2[j]);
		}
	}
}
