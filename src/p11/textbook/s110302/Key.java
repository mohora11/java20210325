package p11.textbook.s110302;

public class Key { 
	public int number; 

	public Key(int number) {//Key란 객체를 만들었다
		this.number = number;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Key) {
			Key compareKey = (Key) obj; //강제형변환 
			if (this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return number;
	}
}
