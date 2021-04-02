package p05.textbook.exercise;

public class Exercise07 {
	public static void main(String[] args) {
		int max = 0;
		int min = 1;
		int sum = 0;
		

		int[] array = { 1, 5, 3, 8, 2 };

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}

		}

		for (int i = 0; i < array.length; i++) {
			if (array[i] <= min) {
				min = array[i];
			}
		}

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		double avg = (double) sum / array.length;

		System.out.println(" max: " + max);
		System.out.println(" min: " + min);
		System.out.println(" 합계: " + sum);
		System.out.println(" 평균: " + avg);
	}
}
