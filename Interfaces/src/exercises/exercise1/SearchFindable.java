package exercises.exercise1;

public interface SearchFindable {
	public static final String hello = new String("Hello");
	
	void find(String text);
	void search(String url);
	void lookup(String topic);
	
	public static void info(SearchFindable sf) {
		sf.search("탐색");
		sf.find("찾기");
		sf.lookup("검색");
		System.out.println(SearchFindable.hello);
	}

}
