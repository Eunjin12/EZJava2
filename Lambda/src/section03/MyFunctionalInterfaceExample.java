/*
 * 인터페이스의 익명구현객체 선언
 */
package section03;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		MyFunctionalInterface myfunc = new MyFunctionalInterface() {
			@Override
			public void method() {
				System.out.println("MyFunctionalInterface의 익명 구현 객체");
			}
		};
		
		myfunc.method();
		
		localImplements();
		
		callInnerClass();
	}
	
	/*
	 * 로컬 구현 클래스
	 */
	public static void localImplements() {
		class MyFunctionalClass implements MyFunctionalInterface {
			@Override
			public void method() {
				System.out.println("MyFunctionalInterface의 로컬 구현 클래스");
			}
		}
		
		MyFunctionalClass myfunc = new MyFunctionalClass();
		myfunc.method();
	}
	
	public static void callInnerClass() {
		MyFunctionalClass myfunc = new MyFunctionalInterfaceExample.MyFunctionalClass();
		myfunc.method();
	}
	
	/*
	 * Static Inner Class: 클래스 안에 클래스
	 */
	static class MyFunctionalClass implements MyFunctionalInterface {
		@Override
		public void method() {
			System.out.println("Mstatic MyFunctionalInterface의 Inner Class");
		}
	}
}
