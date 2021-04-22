package p11.textbook.s110701;

public class ByteToStringExample {
	public static void main(String[] args) {
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4); // 6번째 74부터 포함 4개
		System.out.println(str2); 			   // 여기서 알 수 있는건
											   // space bar는 32 ㅍㅍ
	}
}
