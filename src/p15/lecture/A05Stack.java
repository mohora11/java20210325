package p15.lecture;

import java.util.Stack;

public class A05Stack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();//인티저 타입의 새로운 스택을 선언
		//Stack : 아래서부터 차곡차곡 쌓는다 생각하면 됨
		
		stack.push(3); //push 문법  Stack에서는 아이템을 넣을려면 push사용
		stack.push(5); // 첫째로 3, 둘째로 5, 셋째로 6을 넣음
		stack.push(6);
		
				
		int last = stack.pop(); //Stack pop 문법 가장 마지막 객체
		System.out.println(last);// 를 불러옴과 동시에 스택에서 제거
		
		last = stack.pop(); // 마지막 저장한 객체 이전의 객체를 불러옴
		System.out.println(last);
		
		last  = stack.pop(); // 여기서는 첫째로 저장한 3을 불러옴
		System.out.println(last);
		
//		last  = stack.pop();
//		System.out.println(last); exception 발생
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		
		last = stack.peek();
		System.out.println(last);
		
		last = stack.peek();
		System.out.println(last);
	}
}
