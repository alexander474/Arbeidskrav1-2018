import java.util.ArrayList;
import java.util.List;

public class Client {

    MeterArchive meterArchive;
    DummyData dummyData;
    Reader reader;

    public Client(){
        meterArchive = new MeterArchive();
        dummyData = new DummyData();
        //transferData(dummyData.meterArchive);
        reader = new Reader();
    }


    /**
     * This method will make test methods with different meters and add it to the arraylist. it will also run some of
     * the change placement, change status and delete methods.
     */
    public void mainMethod(){
        populateArchive();
        printMeters();
        meterArchive.changeInstrumentStatus("V1000", false);
        meterArchive.deleteInstrument("T2000");
        meterArchive.changeInstrumentPlacement("K2000", "N2M48V");


        /**
         * These lines gets the info from the dummy class
        dummyData.populateMeterArchive();
        dummyData.getInstruments();
        dummyData.changeInstrumentPlacements();
        dummyData.changeInstrumentStatus();
        dummyData.deleteInstruments();
        printMeters();
         **/
    }

    void transferData(MeterArchive meterArchive){
        this.meterArchive = meterArchive;
    }

    void printMeters(){
        for(Meter m : meterArchive.getAllInstuments()) {
            System.out.println(m.toString());
        }
    }

    void populateArchive(){
        ArrayList<Meter> arrayList = reader.readMeter("Example.json");
        for(Meter m : arrayList)
        meterArchive.addInstrument(m);
    }
}
