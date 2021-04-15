package p08.textbook.s080601;

public class Example {
	public static void main(String[] args) {
		ImplementaionC impl = new ImplementaionC();
		
		InterfaceA ia = impl;
		ia.methodA();
		System.out.println();
		
		InterfaceB ib = impl;
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
	}
}
