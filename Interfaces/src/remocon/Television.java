package remocon;

public class Television implements RemoteControl {
	private int volume;
	private String model;
	
	Television() {}
	Television(String model) {
		this.model = model;
	}

	@Override
	public void turnOn() {
		System.out.printf("[%s] TV �ѱ�\n", this.model);
	}

	@Override
	public void turnOff() {
		System.out.printf("[%s] TV ����\n", this.model);

	}

	@Override
	public void setVolumn(int volume) {
		
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} 
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println("[" + this.model + "] TV ���� :" + this.volume);
	}
	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		// RemoteControl.super.setMute(mute);
		if(mute) {
			System.out.printf("[%s] �������\n", this.model);
		}
		else {
			System.out.printf("[%s] ��������\n", this.model);
		}
	}

}
