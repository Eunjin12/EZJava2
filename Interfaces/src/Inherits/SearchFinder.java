package Inherits;

public class SearchFinder implements SearchFindable, Searchable {

	@Override
	public void search(String url) {
		System.out.printf("SearchFinder:search(%s)\n",  url);

	}
	
	@Override
	public void find(String text) {
		System.out.printf("SearchFinder:search(%s)\n",  text);

	}
}
