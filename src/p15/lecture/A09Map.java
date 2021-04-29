package p15.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A09Map {
	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
		
		map.put(2, 99);
		map.put(3, 6);
		map.put(8, 77);
		
		System.out.println(map.size());
		
		map.put(8, 99); //세번째 put 한거의 v값이 77에서 99로 변경됨
		
		System.out.println(map.size()); // 그래서 역시 길이는 3
		
		System.out.println(map.get(2)); // 키가 2 값인 벨류 99를 보여줌
		System.out.println(map.get(8)); // 이하는 같음
		
		Set<Integer> keys = map.keySet();
		
		for (Integer key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
		
		map.remove(8);
		System.out.println(map.size()); // 키값이 8인 엔트리를 삭제함
		
		Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
		
		for(Map.Entry<Integer, Integer> entry : entries) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
		

	}
}
