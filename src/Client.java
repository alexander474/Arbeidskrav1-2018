import java.util.List;

public class Client {

    MeterArchive meterArchive;
    DummyData dummyData;

    public Client(){
        meterArchive = new MeterArchive();
        dummyData = new DummyData();
        transferData(dummyData.meterArchive);
    }


    /**
     * This method will make test methods with different meters and add it to the arraylist. it will also run some of
     * the change placement, change status and delete methods.
     */
    public void mainMethod(){


        dummyData.populateMeterArchive();
        dummyData.getInstruments();
        printMeters();
        dummyData.changeInstrumentPlacements();
        dummyData.changeInstrumentStatus();
        dummyData.deleteInstruments();
        printMeters();
    }

    void transferData(MeterArchive meterArchive){
        this.meterArchive = meterArchive;
    }

    void printMeters(){
        for(Meter m : meterArchive.getAllInstuments()) {
            System.out.println(m.toString());
        }
    }
}
