package p11.textbook.s111002;

import java.util.regex.Pattern;

public class PatternExample {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}"; 
		                //02나01 - 숫자한자리로 3이나 4자리수 
						//					숫자 한자리로 무조건 4자리
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
				  //글자로 여러개가 올수있다.
				  //  @ 이 나옴
				  //     글자로 여러개가 옮
				  //         . 이 나옴
				  //  		  다시 문자로 여러개
		data = "anget@navercom";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		} else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
