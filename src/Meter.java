/**
 * This class would connect all the subclasses
 */
public abstract class Meter {
    String registerNumber, placementCode;
    boolean status; // broken or okey

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(registerNumber);
        sb.append(placementCode);
        sb.append(status);
        return sb.toString();
    }
}
