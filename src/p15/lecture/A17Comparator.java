package p15.lecture;

import java.util.Comparator;
import java.util.TreeSet;

public class A17Comparator {
	public static void main(String[] args) {
		TreeSet<Dog> set = new TreeSet<>(new DogComparator());
		set.add(new Dog(99));
		set.add(new Dog(88));
		set.add(new Dog(96));
		set.add(new Dog(100));
		
		System.out.println(set);
	}
}

class DogComparator implements Comparator<Dog> {
	@Override
	public int compare(Dog o1, Dog o2) {
		// o1이 o2보다 크면 양수
		// o1이 o2보다 작으면 음수
		// o1이 o2와 같으면 0
		return o1.id - o2.id; // o2.id - o1.id 면 큰거부터 나옴
	}
}

class Dog {
	public int id;
	
	public Dog(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + "]";
	}
	// 스킵가능 15.5.3 757p
	//			15.7   771p
	//			15.8   773p
	// 			15.5   750p 필수는아님
	
}