package section06.s02;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;


public class RootController implements Initializable {
	@FXML private TextArea textArea1;
	@FXML private TextArea textArea2;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// Bindings.bindBidirectional(textArea1.textProperty(), textArea2.textProperty()); // 양방향 바인딩
		//textArea2.textProperty().bind(textArea1.textProperty()); // 단방향 바인딩(textArea1 -> textArea2)
		textArea1.textProperty().bind(textArea2.textProperty()); // 단방향 바인딩(textArea2 -> textArea1)
	}

}
