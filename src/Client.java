import java.util.ArrayList;

public class Client {

    MeterArchive meterArchive;
    Meter meter;


    public Client(){

    }

    public static void main(String[] args) {
        Client cl = new Client();
        cl.mainMethod();
    }

    public void mainMethod(){
        meterArchive = new MeterArchive();

        //vekt * 3
        //termometer * 3
        //klokke * 3
        Meter weight1 = new Weight("V1000", "R101H1", true, 0.1, 10.0);
        Meter weight2 = new Weight("V1001", "R101H2", true, 0.1, 100.0);
        Meter weight3 = new Weight("V1002", "R101H3", true, 0.1, 1000.0);
        Meter thermometer1 = new Thermometer("T2000", "R101H4", true, 100, 0.1);
        Meter thermometer2 = new Thermometer("T2001", "R101H5", true, 200, 1.0);
        Meter thermometer3 = new Thermometer("T2002", "R101H6", true, 300, 100);
        Meter clock1 = new Clock("K3000", "R101H7", true, 1.0 );
        Meter clock2 = new Clock("K3001", "R101H8", true, 0.01 );
        Meter clock3 = new Clock("K3002", "R101H9", true, 0.001 );

        meterArchive.addInstrument(weight1);
        meterArchive.addInstrument(weight2);
        meterArchive.addInstrument(weight3);
        meterArchive.addInstrument(thermometer1);
        meterArchive.addInstrument(thermometer2);
        meterArchive.addInstrument(thermometer3);
        meterArchive.addInstrument(clock1);
        meterArchive.addInstrument(clock2);
        meterArchive.addInstrument(clock3);

        meterArchive.getInstument("V1000");
        meterArchive.getInstument("V1001");
        meterArchive.getInstument("V1002");
        meterArchive.getInstument("T2000");
        meterArchive.getInstument("T2001");
        meterArchive.getInstument("T2002");
        meterArchive.getInstument("K3000");
        meterArchive.getInstument("K3001");
        meterArchive.getInstument("K3002");

        meterArchive.changeInstrumentPlacement("V1001", "M232MM");
        meterArchive.changeInstrumentStatusToFalse("K3001");
        meterArchive.deleteInstrument("T2002");


    }





}
