package p11.textbook.exercise.ex11;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4); // Byte 타입까진 == 이 되는데
										  // 그 이상이 되면 equals를 사용해서
										  // 맞는지 확인
	}
	
}
