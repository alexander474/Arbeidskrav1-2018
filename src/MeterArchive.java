
import java.util.List;
import java.util.ArrayList;


public class MeterArchive {

    List<Meter> meters;

    public MeterArchive(){
        meters = new ArrayList<>();

    }


    public void addInstrument(Meter meter){
        meters.add(meter);
    }

    private void addClock(Meter meter){
        Clock clock = new Clock();
        meters.add(meter);
    }
    private void addThermometer(Meter meter){
        Thermometer thermometer = new Thermometer();
        meters.add(meter);
    }
    private void addWheight(Meter meter){
        Weight weight = new Weight();
        meters.add(meter);
    }

    public Meter getInstument(String regNum){
        for(int i=0; i<meters.size(); i++) {
            if (meters.get(i).getRegisterNumber() == regNum) {
                System.out.println("Henter instrument med regnummer " + meters.get(i).getRegisterNumber() + ":");
                System.out.println(meters.get(i));
                return meters.get(i);

            }
        }
        return null;
    }

    public void changeInstrumentPlacement(String regNum, String newPlassering){
        for(int i=0; i<meters.size(); i++) {
            if (meters.get(i).getRegisterNumber() == regNum) {
                System.out.println("Setter instrument med regnummer " + meters.get(i).getRegisterNumber() + " til plassering " + newPlassering + "\n");
                meters.get(i).setPlacementCode(newPlassering);
            }
        }
    }

    public void changeInstrumentStatusToFalse(String regNum){
        for(int i=0; i<meters.size(); i++) {
            if (meters.get(i).getRegisterNumber() == regNum) {
                System.out.println("Setter instrument med regnummer " + meters.get(i).getRegisterNumber() + " til ikke i orden:\n");
                meters.get(i).setStatus(false);
            }
        }
    }


    public boolean deleteInstrument(String regNum) {
        for (int i = 0; i < meters.size(); i++) {
            if (meters.get(i).getRegisterNumber() == regNum) {
                System.out.println("Sletter instrument med regnummer " + meters.get(i).getRegisterNumber());
                System.out.println("Instrument med regnummer " + meters.get(i).getRegisterNumber() + " er nå slettet\n");
                meters.remove(i);
                return true;
            }
        }
        return false;
    }
}
