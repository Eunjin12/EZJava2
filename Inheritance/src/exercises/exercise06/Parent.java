/*
 * [Ȯ�ι���6]
 *  ��� ����� �ۼ��϶�.
 *  
 *  (���)
 *  1. System.out.println("parent(String nation) call");
 *  2. System.out.println("Parent() call");
 *  3. System.out.println("Child(String name) call");
 *  4. System.out.println("Child() call");
 */
package exercises.exercise06;

public class Parent {
	public String nation;
	
	public Parent() {
		this("���ѹα�");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("parent(String nation) call");
	}

}
