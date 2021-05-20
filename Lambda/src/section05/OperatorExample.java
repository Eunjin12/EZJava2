/*
 * Operator 함수적 인터페이스
 * 
 * @FunctionalInterface
 * public interface IntBinaryOperator {
 *     int applyAsInt(int left, int right);
 * }
 */
package section05;

import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = { 70, 80, 90 };
		
	/*
	 * Binary Operation
	 * result = left + right;
	 */
		public static int maxOrMin(IntBinaryOperator operator) {
			int result = scores[0];
			for(int socre : scores) {
				result = operator.applyAsInt(result, socre);
			}
			return result;
		}
		
		public static void main(String[] args) {
			maxValue();
			minValue();
		}
		
		public static void maxValue() {
			int max = maxOrMin
				((a,b) -> {
					if(a >= b) {
						return a;
				}
				else {
					return b;
				}
			}
		);
			
			System.out.println("max: " + max);
	}
		
		public static void minValue() {
			int min = maxOrMin((a,b) -> {
				if(a <= b) {
					return a;
				}
				else {
					return b;
				}
			});
			
			System.out.println("min: " + min);
		}

}
