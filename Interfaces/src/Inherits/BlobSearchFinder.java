package Inherits;

public class BlobSearchFinder implements SearchFindable {
	@Override
	public void search(String url) {
		System.out.printf("SearchFinder:search(%s)\n",  url);

	}
	
	@Override
	public void find(String text) {
		System.out.printf("SearchFinder:search(%s)\n",  text);

	}
}

