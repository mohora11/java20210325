package p15.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A03ArrayList {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0] = 99;
		arr1[1] = 100;
		arr1[2] = 101;
		
		arr1 = Arrays.copyOf(arr1, 4);//arr1 배열의 4번째 자리를 만듦
		System.out.println(Arrays.toString(arr1));// 4번째 자리는 만들어졌으나 객체값은 0임
		arr1[3] = 102; //배열 4번째 자리에 102라는 객체를 집어넣음
		
		System.out.println(Arrays.toString(arr1));
				
		List<Integer> list = new ArrayList<>();
		list.add(99);
		list.add(100);
		list.add(101);
		list.add(102);
		
		System.out.println(list);
		
	}
}
