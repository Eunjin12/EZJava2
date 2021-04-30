/*
 * [확인문제7]
 * 출력 결과를 작성하라.
 *  - 다형성
 *  - 생성된 구현 객체는 SnowTire이기 때문에 부모 객체로 
 *    SnowTire 객체를 받더라도 SnowTire.run() 메소드가 실행
 *  - SnowTire.run()은 재정의 됨
 *  1. 결과는 같다.
 *  
 */
package exercises.exercise07;

public class Tire {
	public void run() {
		System.out.println("일반 타이어가 굴러갑니다.");
	}

}
