package application;
import java.io.IOException;

import classes.*;
import controller.loginController;
import view.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException {		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/LP3/gerenciamento-bar/src/view/t_login.fxml"));
		loginController controller = (loginController) loader.getController();
		Parent root = loader.load();		
		Scene scene = new Scene(root, 300, 200);
		primaryStage.setTitle("JavaFX App");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
