[확인문제8]

8. A, B, C, D, E, F 클래스가 있을 때 빈칸에 들어 올 수 없는 코드는?
정답: 2번
해설: 부모 객체를 자식 객체로 강제 캐스팅은 안됨
-----------------------------------------------
<보기>
B b =

메소드 선언: void method(B b) {...}
메소드 호출: method(      ) 
-----------------------------------------------
 1) new B()
 2) (B) new A()  //강제 타입 변환
 3) new D()      //자동 타입 변환
 4) new E()      //자동 타입 변환