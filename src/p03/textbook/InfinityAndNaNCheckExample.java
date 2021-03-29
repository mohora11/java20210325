package p03.textbook;

public class InfinityAndNaNCheckExample {
	public static void main(String[] args) {
		
		int x = 5;
		double y = 0.0;
		
		double z = x / y;
		//double z = x % y;
		
		System.out.println(Double.isInfinite(z)); //메소드는 더블이란값의 인피니티가 맞는가 true or false 로 출력
		System.out.println(Double.isNaN(z));	  //위와 같이 NaN이냐 T or F	
		
		System.out.println(z + 2); // 문제가 되는 코드
	}
}
