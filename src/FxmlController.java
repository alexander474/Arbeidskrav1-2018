import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class FxmlController implements Initializable{

    MeterArchive meterArchive = new MeterArchive();
    Reader reader = new Reader();
    @FXML
    Button startButton;
    @FXML
    Button clearButton;
    @FXML
    TextArea textArea;
    @FXML
    TextField registerNumber;
    @FXML
    TextField placement;

    @FXML
    public void handleStart(){
        System.out.println("Start is pressed\n");
        populateArchive();
        printMeters(textArea);

    }
    @FXML
    public void handleClear(){
        System.out.println("Clear is pressed\n");
        emtyArchive();
        textArea.clear();
        textArea.setText("Empty");
    }

    @FXML
    public void HandleGetInstrument(){
        printInstrument(getRegnumber());
    }
    @FXML
    public void HandleGetAllInstrument(){
        printMeters(textArea);
    }

    @FXML
    public void HandleTrue(){
        System.out.println("True is pressed\n");
        meterArchive.changeInstrumentStatus(getRegnumber(), true);
        printInstrument(getRegnumber());



    }
    @FXML
    public void HandleFalse(){
        System.out.println("False is pressed\n");
        meterArchive.changeInstrumentStatus(getRegnumber(), false);
        printInstrument(getRegnumber());


    }
    @FXML
    public void HandlePlacement(){
        System.out.println("Change placement is pressed\n");
        meterArchive.changeInstrumentPlacement(getRegnumber(), getNewPlacement());
        printInstrument(getRegnumber());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    /**
     * This will print all the meters in the list
     */
    void printMeters(TextArea textArea){
        String meters = "";
        for(Meter m : meterArchive.getAllInstuments()) {
            System.out.println(m.toString());
            meters += m.toString() + "\n";
        }
        textArea.setText(meters);
    }

    /**
     * Prints a instrument based on registernumber input
     * @param regNr
     */
    void printInstrument(String regNr){
        textArea.setText(meterArchive.getInstument(regNr).toString());

    }

    String getRegnumber(){
        return registerNumber.getText().toString().toUpperCase();
    }
    String getNewPlacement(){
        return placement.getText().toString().toUpperCase();
    }

    /**
     * This will populate the MeterArchive with data from the json file using the reader class
     */
    void populateArchive(){
        ArrayList<Meter> arrayList = reader.readMeter("Example.json");
        for(Meter m : arrayList)
            meterArchive.addInstrument(m);
    }

    void emtyArchive(){
        meterArchive.getAllInstuments().clear();
    }
}
