
import java.util.List;
import java.util.ArrayList;


public class MeterArchive {

    List<Meter> meters; // makes a list of Meter

    public MeterArchive(){
        meters = new ArrayList<>(); // makes the list of Meter to an ArrayList that can hold the instruments/meters

    }


    /**
     * Adds a new instrument/meter. takes the parameter of what type of meter you want.
     * @param meter
     */
    public void addInstrument(Meter meter){
        if(meter != null) {
            meters.add(meter);
        }
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

    /**
     * returns a meter object and prints out the info about a meter based on the register number
     * @param regNum
     * @return
     */
    public Meter getInstument(String regNum){
        for(int i=0; i<meters.size(); i++) {
            if (meters.get(i).getRegisterNumber() == regNum) {
                System.out.println("Henter instrument med regnummer " + meters.get(i).getRegisterNumber() + ":");
                System.out.println(meters.get(i));
                return meters.get(i);

            }
        }
        System.out.println("[error] you tried to access a instrument that dosen't exist\n");
        return null;
    }

    /**
     * Changes the placement info on the choosen meter based on the register number
     * @param regNum
     * @param newPlassering
     */
    public void changeInstrumentPlacement(String regNum, String newPlassering){
        for(int i=0; i<meters.size(); i++) {

                if (meters.get(i).getRegisterNumber() == regNum) {
                    System.out.println("Setter instrument med regnummer " + meters.get(i).getRegisterNumber() + " til plassering " + newPlassering + "\n");
                    meters.get(i).setPlacementCode(newPlassering);
                }
        }
    }

    /**
     * Changes the status on the meter based on the register number
     * @param regNum
     * @param newStatus
     */
    public void changeInstrumentStatus(String regNum, boolean newStatus){
        for(int i=0; i<meters.size(); i++) {
            if (meters.get(i).getRegisterNumber() == regNum) {
                System.out.println("Setter instrument med regnummer " + meters.get(i).getRegisterNumber() + " til ikke i orden:\n");
                meters.get(i).setStatus(newStatus);
            }
        }
    }

    /**
     * Deletes a meter based on the register number
     * @param regNum
     * @return
     */
    public boolean deleteInstrument(String regNum) {
        for (int i = 0; i < meters.size(); i++) {
            if (meters.get(i).getRegisterNumber() == regNum) {
                System.out.println("Sletter instrument med regnummer " + meters.get(i).getRegisterNumber());
                System.out.println("Instrument med regnummer " + meters.get(i).getRegisterNumber() + " er nå slettet\n");
                meters.remove(i);
                return true;
            }
        }
        System.out.println("[error] you tried to delete a instrument that dosen't exist!!!");
        return false;
    }
}
