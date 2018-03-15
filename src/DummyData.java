public class DummyData{
    MeterArchive meterArchive;

    public DummyData(){
        meterArchive = new MeterArchive();
    }


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

    /**
     * Getting instruments
     */
    void getInstruments(){
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
    }

    /**
     * Changes the placements of some instruments
     */
    void changeInstrumentPlacements(){
        // changes the instrument placement
        meterArchive.changeInstrumentPlacement("V1001", "M232MM");
        meterArchive.changeInstrumentPlacement("V1000", "R101H9");
    }

    /**
     * Changes the status of some instruments
     */
    void changeInstrumentStatus(){
        // changes the instrument status
        meterArchive.changeInstrumentStatus("K3001", false);
        meterArchive.changeInstrumentStatus("KV02", false);
    }

    /**
     * Deletes some instruments
     */
    void deleteInstruments(){
        // deletes a instrument
        meterArchive.deleteInstrument("T2002");
        meterArchive.deleteInstrument("K300");
    }
}
