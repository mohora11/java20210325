package p13.textbook.s130701;

public class Product<T, M> {
	private T kind;
	private M model;
	
	public T getKind() { return this.kind; }
	public M getModle() { return this.model; }
	
	public void setModel(M model) {
		this.model = model;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
}

class Tv {}
