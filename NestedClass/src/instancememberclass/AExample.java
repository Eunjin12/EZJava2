/*
 * A�� ���� Ŭ���� B�� ����ϱ� ���ؼ���
 * A�� �ν��Ͻ�ȭ �Ǿ� ��ü�� �Ǿ��� �� ����� �� �ִ�.
 */
package instancememberclass;

public class AExample {

	public static void main(String[] args) {
		A a = new A();
		
		/*
		 * ���� Ŭ���� ���� �� �޼ҵ� ����
		 */
		// A.B b = new A.B();
		A.B b = a.new B();
		b.methodB();
	}

}
