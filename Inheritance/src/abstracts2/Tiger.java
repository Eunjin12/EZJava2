package abstracts2;

public class Tiger extends Animal {
	Tiger() {
		this.kind = "ȣ����";
	}
	
	@Override
	public void move() {
		System.out.println("ȣ���� �Ȱų� �޸���.");
	}
	
	@Override
	public void sound() {
		System.out.println("ȣ���̴� ǥȿ�Ѵ�.");
	}
	
	public void breathe() {
		System.out.println("ȣ���̵� ȣ���� �Ѵ�.");
	}
}
