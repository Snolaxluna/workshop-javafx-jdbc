package application;

import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage){
        try {
            BorderPane root = new BorderPane();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}