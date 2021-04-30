package remocon;

public interface RemoteControl {
	// ���
	public static final int RC_VOLUME = 5;
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// �ڵ����� �߻� �޼ҵ�(abstract method)�� �ǹǷ� ������ ���� �� ����.
	public void turnOn();
	public void turnOff();
	public void setVolumn(int volume);
	
	/*
	 * ���� �߰�(SmartTV ��)
	 * 1. ����Ʈ �޼ҵ带 ���ؼ� �������̽��� Ȯ��
	 * 2. ���� ȣȯ���� ���� 
	 */
	default public void setChannel(int channel) {
		System.out.println("ä�κ���");
	}
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("�������");
		}
		else {
			System.out.println("��������");
		}
	}
	
	static void changeBattery() {
		System.out.println("���͸� ��ȯ");
	}
	
	static void control(RemoteControl rc) {
		rc.turnOn();
		rc.setMute(true);
		rc.setVolumn(5);
		rc.turnOff();
	}

}
