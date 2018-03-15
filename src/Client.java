
public class Client {

    MeterArchive meterArchive;
    public Client(){
        meterArchive = new MeterArchive();
    }


    /**
     * This method will make test methods with different meters and add it to the arraylist. it will also run some of
     * the change placement, change status and delete methods.
     */
    public void mainMethod(){
        populateMeterArchive();

        // getting instruments
        meterArchive.getInstument("V1000");
        meterArchive.getInstument("V1001");
        meterArchive.getInstument("V1002");
        meterArchive.getInstument("T2000");
        meterArchive.getInstument("T2001");
        meterArchive.getInstument("T2002");
        meterArchive.getInstument("K3000");
        meterArchive.getInstument("K3001");
        meterArchive.getInstument("K3002");
        meterArchive.getInstument("L4834");

        // changes the instrument placement
        meterArchive.changeInstrumentPlacement("V1001", "M232MM");
        meterArchive.changeInstrumentPlacement("V1000", "R101H9");

        // changes the instrument status
        meterArchive.changeInstrumentStatus("K3001", false);
        meterArchive.changeInstrumentStatus("KV02", false);

        // deletes a instrument
        meterArchive.deleteInstrument("T2002");
        meterArchive.deleteInstrument("K300");

        // getting instruments that have been changed in some sort
        meterArchive.getInstument("V1000");
        meterArchive.getInstument("V1001");
        meterArchive.getInstument("T2002");
        meterArchive.getInstument("K3001");
    }

    /**
     * Populates the meterArchive with dummy data
     */
    void populateMeterArchive(){
        // making and adding instruments
        meterArchive.addInstrument(new Weight("V1000", "R101H1", true, 0.1, 10.0));
        meterArchive.addInstrument(new Weight("V1001", "R101H2", true, 0.1, 100.0));
        meterArchive.addInstrument(new Weight("V1002", "R101H3", true, 0.1, 1000.0));
        meterArchive.addInstrument(new Thermometer("T2000", "R101H4", true, 100, 0.1));
        meterArchive.addInstrument(new Thermometer("T2001", "R101H5", true, 200, 1.0));
        meterArchive.addInstrument(new Thermometer("T2002", "R101H6", true, 300, 100));
        meterArchive.addInstrument(new Clock("K3000", "R101H7", true, 1.0 ));
        meterArchive.addInstrument(new Clock("K3001", "R101H8", true, 0.01 ));
        meterArchive.addInstrument(new Clock("K3002", "R200H20", true, 0.001 ));
    }
}
