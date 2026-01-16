/*
Program written by CoPilot to test JavaFX using the following prompt:

Can you write the program HelloFX.java, using pom.xml, that will create a popup window using JavaFX that has text that says:
"Hello Professor!
JavaFX successfully Installed!"

*/

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloFX extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a label with the text
        Label label = new Label("Hello Professor!\nJavaFX successfully Installed!");
        label.setStyle("-fx-font-size: 18px; -fx-text-alignment: center;");
        
        // Create a VBox container to hold the label
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        root.setStyle("-fx-padding: 20; -fx-border-color: #cccccc;");
        root.getChildren().add(label);
        
        // Create a scene and set it on the stage
        Scene scene = new Scene(root, 400, 200);
        
        // Configure and display the window
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


