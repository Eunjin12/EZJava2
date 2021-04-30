/*
 * [확인문제5]
 * 다음의 예제에서 컴파일 에러가 나는 이유는?
 *  - 부모의 디폴트 생성자가 없다.
 *  - 자식의 생서자에서 부모의 생성자를 super(...)로 호출해야 한다.
 *  - 클래스의 생성자를 정의하게 되면 항상 디폴트 생성자를 만드는 것을 권고
 *  - 자식 클래스에서 부모의 필드를 초기화 할 때는 super()를 호출하여 
 *    부모 클래스에서 처리하도록 유도하는 것을 권고
 */
package exercises.exercise05;
	
	public class Parent {
	public String name;
	
	public Parent() {}
	public Parent(String name) {
		this.name = name;
	}

}
