package p15.lecture;

import java.util.LinkedList;
import java.util.Queue;

public class A06Queue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();//인티저 타입의 큐를 선언
		//큐는 선입선출 
		queue.offer(9);
		queue.offer(6);
		queue.offer(3);
		System.out.println(queue);
		
		int first = queue.poll(); // queue의 poll문법 첫번째 넣었던
								  // 객체부터 꺼내온다	
		System.out.println(first);
		System.out.println(queue.poll()); // 순서대로 6,3 을 꺼내왔다.
		System.out.println(queue.poll());
		System.out.println(queue.poll()); // 마지막은 null값
		
		queue.offer(30);
		queue.offer(10);
		queue.offer(20);
		
		System.out.println(queue.peek()); // 맨먼저 넣었던걸 소환한다
		System.out.println(queue.peek());
		
		
		
	}
}
