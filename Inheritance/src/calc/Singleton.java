package calc;

public class Singleton {
	
	public static void main(String[] args) {
		  Calc calc = new Calc(10);
		  int sum = calc.compute(100);
		  System.out.println("Calc:sum=" + sum);
		 
		}
}
