import java.util.ArrayList;

public class Client {

    MeterArchive meterArchive;
    Meter meter;


    public Client(){

    }

    public static void main(String[] args) {
        Client cl = new Client();
        cl.testMethod();
    }

    public void testMethod(){
        meterArchive = new MeterArchive();

        Meter t = new Thermometer("123", "placement123", true, 50, 0);
        meterArchive.addInstrument(t);
        Meter c = new Clock("456", "placement123", true, 60 );
        meterArchive.addInstrument(c);
        Meter w = new Weight("789", "placement123", true, 0, 100);
        meterArchive.addInstrument(w);
        meterArchive.getInstument("123");
        meterArchive.getInstument("456");
        meterArchive.getInstument("789");


    }





}
