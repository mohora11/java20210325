package p05.lecture;

import java.util.Arrays;

public class A30ARraySumMethod {
	public static void main(String[] args) {
		int[] arr1 = {8, 7, 6, 5, 4, 3};
		int[] arr2 = {99, 88, 77, 66, 55, 44};
		
		int[] arr3 = sum(arr1, arr2);
		System.out.println("arr3:" + Arrays.toString(arr3));
		
		int[] arr4 = {1, 2, 3}; // 21행의 a에 적용됨
		int[] arr5 = {5, 6, 7};	// 22행의 b에 적용됨
		int[] arr6 = sum(arr4, arr5); //return c에 적용됨
		
		System.out.println("arr6:" + Arrays.toString(arr6));
	}
							// js의 function == java의 method
	public static int[] sum(int[] a, int[] b) {
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		int[] c = new int[a.length]; //c에서 ctrl + 2을 누르면
									 //같은 c는 다 수정가능 rename in file
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
		}
		
		System.out.println(Arrays.toString(c));
		
		return c; // 메소드 종료, 오른쪽 값 반환(c의 참조값)
				  // 여기서 c는 sum(arr1, arr2); 로 치환됨		
	}
}
