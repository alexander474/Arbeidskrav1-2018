import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class Gui extends Application {
    Scene scene1;

    public Gui(){

    }

    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("SceneBuilder.fxml"));
        scene1 = new Scene(root, 1000,800);
        primaryStage.setTitle("Instruments");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }
}