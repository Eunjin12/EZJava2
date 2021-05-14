package section08.strings;

public class StringSplitExample2 {

	public static void main(String[] args) {
		String text = "010-1234-4567";
		
		String[] tels = text.split("-");
		
		System.out.println("tels.length=" + tels.length);
		
		for(int cnt = 0; cnt < tels.length; cnt++) {
			String name = tels[cnt];
			System.out.printf("tels[%d]=%s\n", cnt, name);
		}

	}

}
