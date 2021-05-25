/*
 * StackPane Container Layout
 * - ��Ʈ���� ���ļ� �״� ������ ��ġ ���̾ƿ�
 * - ī�� ���̾ƿ�
 * - �״� ������ ���� ���� ���� �Ʒ��� ��ġ
 * - �� �������� �״� ��Ʈ���� �ֻ�ܿ� ��ġ
 * - �������̸� �� ���� ��Ʈ�Ѹ� ���̰� �ȴ�.
 * - ���̾� ������ ��ġ
 */
package section04.s07;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StaclPaneLayout extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("GridPane ContainerLayout");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
