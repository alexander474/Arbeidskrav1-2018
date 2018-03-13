import java.util.Objects;

/**
 * This class would connect all the subclasses
 */
public class Meter {
    String registerNumber, placementCode;
    boolean status = false; // broken or okey (default is false)

    public Meter(String registerNumber, String placementCode, boolean status) {
        setRegisterNumber(registerNumber);
        setPlacementCode(placementCode);
        setStatus(status);
    }

    public Meter(){

    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public String getPlacementCode() {
        return placementCode;
    }

    public void setPlacementCode(String placementCode) {
        this.placementCode = placementCode;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    String statusCheck(){
        if(status){
            return "i orden";
        }
        return "ikke i orden";
    }

    public boolean equals(Meter m) {
        if (this == m) return true;
        if (m == null) return false;

        return equals(m.registerNumber);

    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nRegisternummer: " + registerNumber);
        sb.append("\nplasseringskode: " + placementCode);
        sb.append("\nStatus: " + statusCheck());
        return sb.toString();
    }
}
