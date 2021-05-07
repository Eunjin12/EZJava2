/*
 * [��ø �������̽�]
 * - Ŭ���� �ȿ� �������̽��� ����
 * - Ŭ������ ���ӵ� �������̽��� ����
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
			this.touchlistener.onTouch("�ӹ� �Ϸ�!");
		}
	}
	
	interface OnClickListener {
		void onClick();
	}

}
