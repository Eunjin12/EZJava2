package polymorphism;

public class Novel extends Book {
	private String summary;
	
	public Novel() {}
	
	public Novel(String name, String category, String author, double price) {
		super(name, category, author, price); // 부모생성자 호출
	}
		
	public Novel(String name, String category, String author, double price, String summary) {
		super(name, category, author, price); // 부모생성자 호출
		this.setTitle(summary);
	}
	
	void setTitle(String summary) {
		this.summary = "NOVEL:" + summary;
	}
	
	String getsummary() {
		return summary;
	}

	public String toString() {
		String str = String.format("[Novel] 이름(%s), 분류(%s), 저자(%s), 가격(%f), 줄거리(%s)\n",
				name, category, author, price, summary);
		
		return str;
	}
}
