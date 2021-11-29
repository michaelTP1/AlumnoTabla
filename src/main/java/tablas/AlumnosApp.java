package tablas;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AlumnosApp extends Application{

	Controller controller;	
	
	@Override
	
	public void start(Stage primaryStage) throws Exception {
		controller=new Controller();
		primaryStage.setScene(new Scene(controller.getRoot()));
		primaryStage.show();
	}


	public static void main(String[] args) {
		launch(args);
	}
}
