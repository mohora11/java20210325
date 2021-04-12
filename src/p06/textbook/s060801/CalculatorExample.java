package p06.textbook.s060801;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte a = 10;
		byte b = 4;
		double result2 = myCalc.divide(a, b);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
		
		
	}
}
