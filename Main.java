package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			GridPane grid = new GridPane();
			grid.setVgap(5);
			grid.setHgap(5);
			
			Text title = new Text("SCHEDULE VISUALIZER");
			title.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
			grid.add(title, 50, 10);
			TextArea text = new TextArea();
			text.setMinSize(600, 300);
			grid.add(text, 50,20);
			
			Button submit = new Button("SUBMIT");
			grid.add(submit, 50, 30);
			Scene scene = new Scene(grid,1100,600, Color.SILVER);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
