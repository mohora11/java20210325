package p11.lecture.regex;

import java.util.regex.Pattern;

public class A01RegularExpression {
	// 정규표현식
	// 문자열의 패턴을 표현하는 문자열
	// meta-character, quantifier

	public static void main(String[] args) {
		String regex1 = "a";
		String str1 = "a";

		boolean p1 = Pattern.matches(regex1, str1);
		System.out.println(p1);

		regex1 = "java";
		str1 = "java";

		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "9";
		str1 = "0";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d"; // 숫자를 표현함
		str1 = "8";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d";
		str1 = "89";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d\\d";
		str1 = "67";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d{3}";
		str1 = "351";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d{3,}";
		str1 = "912301231";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "010-\\d{4}-\\d{4}";
		str1 = "010-9876-3333";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d{3,5}"; // 숫자열이 3~5개만 true
		str1 = "22";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d+"; // \d{1,} 이 표현과 같음 적어도 한개 이상 있어야함
		str1 = "";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d*"; // \d{0,} 이 표현과 같음 적어도 0개 이상 있어야함
		str1 = "";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "\\d?"; // \d{0,1}
		str1 = "9";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "010-?\\d{4}-?\\d{4}"; // -? -패턴이 0또는 1개가 있어야함
		str1 = "010-9876-3333";
		String str2 = "01098763333";
		String str3 = "010-98763333";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));

		regex1 = "\\w";
		str1 = "a";
		str2 = "T";
		str3 = "8";
		String str4 = "_";
		String str5 = " ";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));

		regex1 = "\\w\\d+";
		str1 = "e12314123";
		str2 = "2934134123";
		str3 = "_123121231";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));

		regex1 = "(java)";
		str1 = "java";
		System.out.println(Pattern.matches(regex1, str1));

		regex1 = "(java)+";
		str1 = "javajavajava";
		str2 = "javajavajavaj";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));// false

		regex1 = "(java|python)";
		str1 = "java";
		str2 = "python";
		str3 = "spring";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3)); // false

		regex1 = "(java|python)+";
		str1 = "java";
		str2 = "python";
		str3 = "pythonjavajavapython";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));

		regex1 = ".";
		str1 = "$";
		str2 = ".";
		str3 = " ";
		str4 = "9";
		str5 = "_";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));

		regex1 = "\\.";
		str1 = "$"; // false
		str2 = ".";
		str3 = " "; // false
		str4 = "9"; // false
		str5 = "_"; // false
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));

		regex1 = "[abc]";
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4)); // false

		regex1 = "[^abc]";
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		System.out.println(Pattern.matches(regex1, str1)); // false
		System.out.println(Pattern.matches(regex1, str2)); // false
		System.out.println(Pattern.matches(regex1, str3)); // false
		System.out.println(Pattern.matches(regex1, str4));

		regex1 = "[a-z]";
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		str5 = "A";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5)); // false

		regex1 = "[a-zA-Z]";
		str1 = "a";
		str2 = "b";
		str3 = "c";
		str4 = "d";
		str5 = "A";
		String str6 = "7";
		System.out.println(Pattern.matches(regex1, str1));
		System.out.println(Pattern.matches(regex1, str2));
		System.out.println(Pattern.matches(regex1, str3));
		System.out.println(Pattern.matches(regex1, str4));
		System.out.println(Pattern.matches(regex1, str5));
		System.out.println(Pattern.matches(regex1, str6)); // false

		regex1 = "[가-힣]+";
		str1 = "김";
		System.out.println(Pattern.matches(regex1, str1));
		
		regex1 = "\\p{IsHangul}+";
		str1 = "김이박철ㅋㅋㅋㅋㅋ";
		System.out.println(Pattern.matches(regex1, str1));
	}

}
