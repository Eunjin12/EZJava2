package remocon;

public class SmartTV implements RemoteControl {
	private String model = "����ƮTV";
	private int channel;
	private int volume;
	
	@Override
	public void setChannel(int channel) {
		this.channel = channel;
		System.out.printf("ä�κ���:[%s] channel(%d)\n", this.model,this.channel);
	}
	
	@Override
	public void turnOn() {
		System.out.printf("[%s] SmartTV �ѱ�\n", this.model);
	}

	@Override
	public void turnOff() {
		System.out.printf("[%s] SmartTV ����\n", this.model);

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
		
		System.out.println("[" + this.model + "] SmartTV ���� :" + this.volume);
	}

}
