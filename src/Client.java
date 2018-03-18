import javafx.application.Application;

import java.util.ArrayList;
import java.util.List;

public class Client {

    MeterArchive meterArchive;
    DummyData dummyData;
    Reader reader;

    public Client(){
        meterArchive = new MeterArchive();
        dummyData = new DummyData();
        transferData(dummyData.meterArchive);
        reader = new Reader();
    }


    /**
     * This method will run different methods from meterArchive and print meters
     */
    public void mainMethod(){
        dummyData.populateMeterArchive();
        dummyData.getInstruments();
        dummyData.changeInstrumentPlacements();
        dummyData.changeInstrumentStatus();
        dummyData.deleteInstruments();
        printMeters();

    }

    /**
     * This will transfer data from one MeterArchive to another one. this is only used if you use the dummydata
     * @param meterArchive
     */
    void transferData(MeterArchive meterArchive){
        this.meterArchive = meterArchive;
    }

    /**
     * This will print all the meters in the list
     */
    void printMeters(){
        for(Meter m : meterArchive.getAllInstuments()) {
            System.out.println(m.toString());
        }
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
