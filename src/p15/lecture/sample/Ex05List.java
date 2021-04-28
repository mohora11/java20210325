package p15.lecture.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex05List {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(4, 5, 9, 10);
		List<Integer> list2 = Arrays.asList(-3, -8, -10, -99, -22);
		List<Integer> list3 = Arrays.asList(8888, 9999, 222, 111);
		List<Integer> list4 = Arrays.asList(3030, 223, 123);

//		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<List<Integer>> list = new ArrayList<>();

		list.add(list1);
		list.add(list2);
		list.add(list3);
		list.add(list4);

		int max = max(list);
		System.out.println(max);

		max = max2(list);
		System.out.println(max);

		List<Integer> flatList = flat(list);
		System.out.println(flatList.size()); // 16
		System.out.println(flatList.get(15)); // 123
	}

	private static List<Integer> flat(List<List<Integer>> list) {
		List<Integer> list11 = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.get(i).size(); j++) {
				list11.add(list.get(i).get(j));
//		List<Integer> flat = new ArrayList<>();
//		for (List<Integer> sub : list) {
//			for (Integer item : sub) {
//				flat.add(item);
			}
		}
		return list11;
//		return flat;
	}

	private static int max2(List<List<Integer>> list) {
		int max = Integer.MIN_VALUE;

		for (List<Integer> sub : list) {
			for (int item : sub) {
				if (item > max) {
					max = item;
				}
			}
		}
		return max;
	}

	private static int max(List<List<Integer>> list) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < list.size(); i++) {
			List<Integer> subList = list.get(i);
			// 여기 for문까지는 list안의 list 원소 list1~list4를 확인하여 sublist를 도출
			for (int j = 0; j < subList.size(); j++) {
				int item = subList.get(j);
				// 여기 for문에서는 sublist에서 각 모든 원소를 확인
				if (item > max) {
					max = item;
					// if 문에서 sublist의 각 원소를 intminval과 비교하여 제일큰값 도출
				}
			}
		}
		return max; // max를 도출해냄
	}
}
