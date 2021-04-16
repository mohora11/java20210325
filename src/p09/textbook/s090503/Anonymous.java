package p09.textbook.s090503;

public class Anonymous {
	private int field;
	
	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;
		
		field = 10;
		
		//arg1 = 20; 묵시 final 사용안됨
		//arg2 = 20;
		
		//var1 = 30; 묵시 final 사용안됨
		//var2 = 30;
		
		Calculatable calc  = new Calculatable() {
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		
		System.out.println(calc.sum());
	}
}
