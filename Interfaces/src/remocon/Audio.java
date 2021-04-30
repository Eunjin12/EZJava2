package remocon;

public class Audio implements RemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("Audio �ѱ�");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio ����");

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
		System.out.println("Audio ����: " + this.volume);
	}

}
