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
            System.out.println("ADDING [" + meter.getClass().getName().toUpperCase() + "] to list\n");
            meters.add(meter);
        }
    }

    /**
     * returns a meter object and prints out the info about a meter based on the register number
     * @param regNum
     * @return
     */
    public Meter getInstument(String regNum){
        for(Meter m : meters) {
            if (m.getRegisterNumber().equals(regNum)) {
                System.out.println("Henter instrument med regnummer " + m.getRegisterNumber() + ":");
                return m;
            }
        }
        System.out.println("[error] ["+regNum+"]" + " [dosen't exist]\n");
        return null;
    }

    public List<Meter> getAllInstuments(){
        return meters;
    }

    /**
     * Changes the placement info on the choosen meter based on the register number
     * @param regNum
     * @param newPlassering
     */
    public boolean changeInstrumentPlacement(String regNum, String newPlassering){
        for(Meter m : meters) {

            if (m.getRegisterNumber().equals(regNum)) {
                System.out.println("Setter instrument med regnummer " + m.getRegisterNumber() + " til plassering " + newPlassering + "\n");
                m.setPlacementCode(newPlassering);
                return true;
            }
        }
        return false;
    }

    /**
     * Changes the status on the meter based on the register number
     * @param regNum
     * @param newStatus
     */
    public boolean changeInstrumentStatus(String regNum, boolean newStatus){
        for(Meter m : meters) {
            if (m.getRegisterNumber().equals(regNum)) {
                System.out.println("Setter instrument med regnummer " + m.getRegisterNumber() + " til ikke i orden:\n");
                m.setStatus(newStatus);
                return true;
            }
        }
        System.out.println("[error] Couldn't alter the status or an instrument with that register number dosen't exist!!!");
        System.out.println("[error] ["+regNum+"]\n");
        return false;
    }

    /**
     * Deletes a meter based on the register number
     * @param regNum
     * @return
     */
    public boolean deleteInstrument(String regNum) {
        for (int i = 0; i < meters.size(); i++) {
            if (meters.get(i).getRegisterNumber().equals(regNum)) {
                System.out.println("Sletter instrument med regnummer [" + meters.get(i).getRegisterNumber()+"]");
                meters.remove(i);
                return true;
            }
        }
        System.out.println("[error] ["+regNum+"]" + " [dosen't exist]\n");
        return false;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Meter m : meters){
            sb.append(m);
        }
        return sb.toString();
    }
}