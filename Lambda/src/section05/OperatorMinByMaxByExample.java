/*
 * minBy(), maxBy() ���� �޼ҵ�
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
		Fruit fruit = operator.apply(new Fruit("����", 6000), new Fruit("����", 10000));
		System.out.println("���ݺ�:min=" + fruit.name + "," + fruit.price);
	}
	
	public static void maxByOpertor() {
		BinaryOperator<Fruit> operator = BinaryOperator.maxBy( (a,b) -> Integer.compare(a.price, b.price) );
		Fruit fruit = operator.apply(new Fruit("����", 6000), new Fruit("����", 10000));
		System.out.println("���ݺ�:max=" + fruit.name + "," + fruit.price);
	}
	
	public static void minByOpertor2() {
		BinaryOperator<Fruit> operator = BinaryOperator.minBy( (a,b) -> a.name.compareTo(b.name) );
		Fruit fruit = operator.apply(new Fruit("�ٳ���", 10000), new Fruit("����", 10000));
		System.out.println("�̸���:min=" + fruit.name);
	}
	
	public static void maxByOpertor2() {
		BinaryOperator<Fruit> operator = BinaryOperator.maxBy( (a,b) -> a.name.compareTo(b.name) );
		Fruit fruit = operator.apply(new Fruit("���ξ���", 6000), new Fruit("����", 10000));
		System.out.println("�̸���:max=" + fruit.name);
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
