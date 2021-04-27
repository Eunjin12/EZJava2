package polymorphism;

public class Novel extends Book {
	private String summary;
	
	public Novel() {}
	
	public Novel(String name, String category, String author, double price) {
		super(name, category, author, price); // �θ������ ȣ��
	}
		
	public Novel(String name, String category, String author, double price, String summary) {
		super(name, category, author, price); // �θ������ ȣ��
		this.setTitle(summary);
	}
	
	void setTitle(String summary) {
		this.summary = "NOVEL:" + summary;
	}
	
	String getsummary() {
		return summary;
	}

	public String toString() {
		String str = String.format("[Novel] �̸�(%s), �з�(%s), ����(%s), ����(%f), �ٰŸ�(%s)\n",
				name, category, author, price, summary);
		
		return str;
	}
}