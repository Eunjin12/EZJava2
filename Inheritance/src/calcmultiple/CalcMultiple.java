package calcmultiple;

// import calcminus.CalcMinus; // package.ClassName
import calcminus.CalcMinus; // calcminus 패키지에 있는 모든 클래스를 임포트(포함)

public class CalcMultiple extends CalcMinus {
	public CalcMultiple() {
		super();
	}
	
	public CalcMultiple(int sum) {
		super(sum);
	}
	
	public int computeMultiple(int x) {
		this.sum *= x;
		return this.sum;
	}
	

}
