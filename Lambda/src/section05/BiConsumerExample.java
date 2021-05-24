/*
 * [ǥ�� API�� �Լ��� �������̽�]
 * Consumer �Լ��� �������̽�
 * public interface Consumer<T,U> {
 * 	 void accept(T t, U u);
 * }
 */
package section05;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<String, String> biConsumer = (t,u) -> System.out.println(t + u);
		biConsumer.accept("Java", "8");
		
		BiConsumer<String, Integer> biInteger = (t,u) -> System.out.println(t + u);
		biInteger.accept("Java", 8);
		
	}

}