package p09.textbook.s090401;

public class Button {
	OnClickListener listener;
	
	
	void touch() {
		listener.onClick();
	}
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	interface OnClickListener {
		void onClick();
	}
}
