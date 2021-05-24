/*
 * minBy(), maxBy() 정적 메소드
 */
package section05;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {
		minByOpertor();
		maxByOpertor();
		minByOpertor2();
		maxByOpertor2();
	}
	
	public static void minByOpertor() {
		BinaryOperator<Fruit> operator = BinaryOperator.minBy( (a,b) -> Integer.compare(a.price, b.price) );
		Fruit fruit = operator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println("가격비교:min=" + fruit.name + "," + fruit.price);
	}
	
	public static void maxByOpertor() {
		BinaryOperator<Fruit> operator = BinaryOperator.maxBy( (a,b) -> Integer.compare(a.price, b.price) );
		Fruit fruit = operator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println("가격비교:max=" + fruit.name + "," + fruit.price);
	}
	
	public static void minByOpertor2() {
		BinaryOperator<Fruit> operator = BinaryOperator.minBy( (a,b) -> a.name.compareTo(b.name) );
		Fruit fruit = operator.apply(new Fruit("바나나", 10000), new Fruit("수박", 10000));
		System.out.println("이름비교:min=" + fruit.name);
	}
	
	public static void maxByOpertor2() {
		BinaryOperator<Fruit> operator = BinaryOperator.maxBy( (a,b) -> a.name.compareTo(b.name) );
		Fruit fruit = operator.apply(new Fruit("파인애플", 6000), new Fruit("수박", 10000));
		System.out.println("이름비교:max=" + fruit.name);
	}
	

}

class Fruit {
	String name;
	int price;
	
	Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
}
