package application;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Cursor;
import javafx.scene.ImageCursor;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;

public class Main extends Application {

	private AnchorPane rootLayout;

	public Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {
		try {

			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("JackSkeleton");
			this.primaryStage.setX(200);
			this.primaryStage.setY(200);
			Thread.sleep(0);
			primaryStage.show();

			initRootLayout();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void initRootLayout() {
		try {

			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Main.class.getResource("../view/Layouts.fxml"));
			rootLayout = (AnchorPane) loader.load();

			Scene scene = new Scene(rootLayout, 640, 480);
			
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

			scene.getStylesheets().add("http://fonts.googleapis.com/css?family=Shadows+Into+Light");
			Font.loadFont(getClass().getResourceAsStream("../resources/fonts/HipsterishFontNormal.ttf"), 20);

			primaryStage.setScene(scene);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}