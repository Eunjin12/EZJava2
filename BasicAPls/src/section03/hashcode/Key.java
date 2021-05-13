package section03.hashcode;

public class Key {
	public int number;
	public int age;
	
	public Key(int number, int age) {
		this.number = number;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.printf("Keyequals(%d), number(%d)\n", super.hashCode(), this.number);
		if(obj instanceof Key) {
			Key key = (Key)obj;
			if(this.number == key.number && this.age == key.age) {
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		System.out.printf("Key:hashCode(%s), number(%d), age(%d)\n", super.hashCode(),this. number,this.age);
		return Integer.parseInt(String.valueOf(this.number) + String.valueOf(this.age));
	}
	
	/*
	@Override
	public int hashCode() {
		System.out.printf("Key:hashCode(%s), number(%d)\n", super.hashCode(),this. number);
		return this.number;
	}*/
}
