package phone;

public class DmbCellPhone extends CellPhone {
	int channel;
	
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb() {
		System.out.println("채널 (" + channel + ")에서 DMB 방송을 시작");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 (" + channel + ")로 변경");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송을 종료");
	}

}
