package section03.cloneobject;

public class MemberExample3 {

	public static void main(String[] args) {
		Member original = new Member("blue", "블루맨", "12345", 25, true);
		
		Member cloned = original; // 참조타입은 레퍼런스 주소를 참조
		
		int x =10;
		int y = x;
		System.out.printf("[원본] x(%d)\n", x);
		System.out.printf("[복제] y(%d)\n", y);
		
		y = 20;
		
		System.out.printf("[원본] x(%d)\n", x);
		System.out.printf("[복제] y(%d)\n", y);
		
		
		System.out.printf("[복제] (%s), (%s)\n", cloned.name, cloned.password);
		System.out.printf("[원본] (%s), (%s)\n", original.name, original.password);

		System.out.println("[변경] 패스워드: 54321");
		cloned.password = "54321";
		
		System.out.printf("[복제] (%s), (%s)\n", cloned.name, cloned.password);
		System.out.printf("[원본] (%s), (%s)\n", original.name, original.password);
	}

}
