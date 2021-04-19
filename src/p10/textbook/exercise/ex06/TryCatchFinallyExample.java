package p10.textbook.exercise.ex06;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String[] strArray = { "10", "2a" };
		int value = 0;
		for(int i = 0; i <= 2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스를 초과했음");
			} catch (NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			} finally {
				System.out.println(value);
			}
		}
		// 첫번째 실행은 다 통과해서 finally 실행되어 10이 나오고
		// 두번째 실행은 배열의 두번째 자리인 2a가 숫자로 변환이 안되므로 실행
		// 세번째는 finally 실행으로 10이 나옴
		// 네번째는 배열의 길이를 초과하므로 인덱스를 초과했음이 실행
		// 다섯번째는 finally가 실행
		
	}
}
