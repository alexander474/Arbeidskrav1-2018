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

        Meter t = new Thermometer("reg124", "placement123", true, 50, 0);
        meterArchive.addInstrument(t);
        meterArchive.getInstument("reg124");


    }





}
