/*
 * [????????]
 * 
 */
package section03.deepclone;

import java.util.Arrays;

public class Member2 implements Cloneable {
	public String name;
	public int age;
	public int[] scores;
	public Car car;
	
	public Member2(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car =car;
	}
	/*
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member2 cloned = (Member2)super.clone();
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		cloned.car = new Car(this.car.model);
		return cloned;
	}
	 */

	public Member2 getMember() {
		Member2 clonedMember = null;
		
		try {
			clonedMember = (Member2)clone();
			clonedMember.scores = Arrays.copyOf(this.scores, this.scores.length);
			clonedMember.car = new Car(this.car.model);
		}
		catch(CloneNotSupportedException e) {
			System.out.println("Member Object is not supported");
		}
		return clonedMember;
	}
	

}
