package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane stackPane = new StackPane();

        primaryStage.setTitle("Hello World");
        Button button = new Button();
       // Button button2 = new Button();
        //button2.setText("Guzi2");
        button.setText("Guzik");
        stackPane.getChildren().add(button);
        //stackPane.getChildren().add(button2);
        primaryStage.setWidth(500);
        primaryStage.setHeight(600);
        primaryStage.setOpacity(0.4);
        primaryStage.setScene(new Scene(stackPane, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
