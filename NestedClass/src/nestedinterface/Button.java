/*
 * [중첩 인터페이스]
 * - 클래스 안에 인터페이스를 정의
 * - 클래스에 종속된 인터페이스로 한정
 */
package nestedinterface;

public class Button {
	OnClickListener listener;
	OnTouchListener touchlistener;
	
	Button() {
		System.out.println("Button Class: Constructor...");
	}
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void setOnTouchListener(OnTouchListener listener) {
		touchlistener = listener;
	}
	
	void touch() {
		if(this.listener != null) {
			this.listener.onClick();
		}
		
		if(this.touchlistener != null) {
			this.touchlistener.onTouch("임무 완료!");
		}
	}
	
	interface OnClickListener {
		void onClick();
	}

}
