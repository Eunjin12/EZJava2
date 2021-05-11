/*
 * 사용자 정의 예외 클래스
 * Exception을 상속하게 되면 일반적인 예외처리를 위한 예외 클래스
 */
package userexception;

public class UserRuntimeException extends RuntimeException {
	UserRuntimeException() {}
	UserRuntimeException(String message) {
		super(message);
	}
}
