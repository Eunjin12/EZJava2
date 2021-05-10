package exercises.exercise6;

public class Chatting {
	void startChat(String chatId) {
		/*
		 * �͸� ���� ��ü���� ���� ������ ����ϰ� �Ǹ�
		 * �� ������ final Ư���� ���� �ǹǷ� ���� ������ �� ����.
		String nickName = null;
		nickName = chatId;
		 */
		final String nickName = chatId;
		
		Chat chat = new Chat() { // �͸� ���� ��ü���� nickName�� ���
			@Override
			public void start() {
				while(true) {
					String inputData = "�ȳ��ϼ���";
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
