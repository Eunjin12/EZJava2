package casting;

public class Bus extends Vehicle {
	int station;
	
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
		station++;
	}
	
	int getStation() {
		return station;
	}

}
