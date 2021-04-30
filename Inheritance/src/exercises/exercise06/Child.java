package exercises.exercise06;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name; // 부모의 생성자가 호출된다.
		System.out.println("Child(String name) call");
	}

}
