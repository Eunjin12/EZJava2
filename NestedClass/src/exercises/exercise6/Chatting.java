package exercises.exercise6;

public class Chatting {
	void startChat(String chatId) {
		/*
		 * 익명 구현 객체에서 로컬 변수를 사용하게 되면
		 * 그 변수는 final 특성을 갖게 되므로 값을 변경할 수 없다.
		String nickName = null;
		nickName = chatId;
		 */
		final String nickName = chatId;
		
		Chat chat = new Chat() { // 익명 구현 객체에서 nickName을 사용
			@Override
			public void start() {
				while(true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}

}
