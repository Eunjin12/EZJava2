package section03;

public class AddFunctionalInterfaceExample2 {
	public static void main(String[] args) {
	AddFunctionalInterface addFunc = (int a, int b) -> {
		int result = a + b;
		return result;
	};
	
	int result = addFunc.add((int)3.0, (int)4.0);
	System.out.println("result: " + result);
	
	}
	
}
