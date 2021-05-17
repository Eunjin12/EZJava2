package section03;

public class ProductExample {

	public static void main(String[] args) {
		Product<Tv, String> ptv = new Product<>();
		ptv.setKind(new Tv());
		ptv.setModel("smrtTV");
		
		Tv tv = ptv.getKind();
		String tvModel = ptv.getModel();
		System.out.printf("Tv(%s)(%s)\n", tv, tvModel);

	}

}
