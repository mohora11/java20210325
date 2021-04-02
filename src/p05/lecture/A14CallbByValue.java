package p05.lecture;

public class A14CallbByValue {
	public static void main(String[] args) {
		int i = 2;
		int j = 1;
		
		method1(i); //>1
		method1(j); //>2
		
		int[] arr1 = new int[3];
		int[] arr2 = new int[5];
		
		method2(arr1);//>3
		method2(arr2);//>4
	}
	
	public static void method1(int i) {
		System.out.println(i);
	}
	
	public static void method2(int[] arr) {
		System.out.println(arr.length);
	}
}
