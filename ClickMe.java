import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickMe extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private Button btn;

    @Override
    public void start(Stage primaryStage) {
        // Create the button
        btn = new Button();
        btn.setText("Click me please!");
        btn.setOnAction(e -> buttonClick());

        // Add the button to a layout pane
        BorderPane pane = new BorderPane();
        pane.setCenter(btn);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("ClickMe Application");
        primaryStage.show();
    }

    private void buttonClick() {
        // Define what happens when the button is clicked
        btn.setText("You clicked me!");
    }
}
