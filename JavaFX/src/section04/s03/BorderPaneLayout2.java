/*
 * BorderPane Container Layout
 * - top, bottom, left, right, center 영역에 배치하는 컨터이너
 * - 각 영역에는 하나의 컨트롤 또는 컨터이너만 배치
 */
package section04.s03;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BorderPaneLayout2 extends Application {

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("root2.fxml"));
		Scene scene = new Scene(root);
		
		primaryStage.setTitle("BorderPane(HBox) ContainerLayout");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

}
