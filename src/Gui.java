import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Gui extends Application {

    MeterArchive meterArchive = new MeterArchive();
    Reader reader = new Reader();
    Scene scene1;


    public Gui(){

    }

    public void start(Stage primaryStage){


        //Text show
        TextArea info = new TextArea("");
        info.scrollLeftProperty();
        info.setPrefHeight(400);
        info.setPrefWidth(300);

        //Start button
        Button start = new Button();
        start.setText("Start");
        start.setOnAction(e -> {
            System.out.println("Populating archive...");
            populateArchive();
            printMeters(info);
        } );

        //Scene 1
        StackPane stackPane = new StackPane();
        scene1 = new Scene(stackPane, 800,800);
        stackPane.getChildren().addAll(info, start);

        primaryStage.setTitle("Instruments");
        primaryStage.setScene(scene1);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }

    /**
     * This will print all the meters in the list
     */
    void printMeters(TextArea info){
        String meters = "";
        for(Meter m : meterArchive.getAllInstuments()) {
            System.out.println(m.toString());
            meters += m.toString() + "\n";
        }
        info.setText(meters);
    }

    /**
     * This will populate the MeterArchive with data from the json file using the reader class
     */
    void populateArchive(){
        ArrayList<Meter> arrayList = reader.readMeter("Example.json");
        for(Meter m : arrayList)
            meterArchive.addInstrument(m);
    }

}
