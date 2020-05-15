
package chapter5jpa;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Chapter5JPA extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Pane tableListView = FXMLLoader.load(getClass().getResource("jpa.fxml"));
        Scene scene = new Scene(tableListView);
        primaryStage.setTitle("Streams App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }

}
