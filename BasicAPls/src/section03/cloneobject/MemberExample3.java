package section03.cloneobject;

public class MemberExample3 {

	public static void main(String[] args) {
		Member original = new Member("blue", "����", "12345", 25, true);
		
		Member cloned = original; // ����Ÿ���� ���۷��� �ּҸ� ����
		
		int x =10;
		int y = x;
		System.out.printf("[����] x(%d)\n", x);
		System.out.printf("[����] y(%d)\n", y);
		
		y = 20;
		
		System.out.printf("[����] x(%d)\n", x);
		System.out.printf("[����] y(%d)\n", y);
		
		
		System.out.printf("[����] (%s), (%s)\n", cloned.name, cloned.password);
		System.out.printf("[����] (%s), (%s)\n", original.name, original.password);

		System.out.println("[����] �н�����: 54321");
		cloned.password = "54321";
		
		System.out.printf("[����] (%s), (%s)\n", cloned.name, cloned.password);
		System.out.printf("[����] (%s), (%s)\n", original.name, original.password);
	}

}
