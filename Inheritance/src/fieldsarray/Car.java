package fieldsarray;

public class Car {
	
	Tire[] tires = {
		new Tire("�տ���", 6),
		new Tire("�տ�����", 2),
		new Tire("�ڿ���", 3),
		new Tire("�ڿ�����", 4)
	};
	
	int run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		
		for(int i=0; i < tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return (i+1);
			}
		}
		
		return 0;
	}
		
		void stop() {
			System.out.println("[�ڵ����� ����ϴ�.]");
		}
		
		String getLocation(int loc) {
			if(loc >= 1 && loc <= 4) {
			Tire tire = this.tires[loc-1];
			return tire.location;
		}
			return null;
		}
		
		void changeTire(Tire tire, int loc) { 
			System.out.println(tire.location + " HankookTire�� ��ü");
			if(loc >= 1 && loc <= 4) {
			this.tires[loc-1] = tire;
			}
		}
	}
 

