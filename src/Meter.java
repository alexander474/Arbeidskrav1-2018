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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Meter meter = (Meter) o;

        return status == meter.status &&
                Objects.equals(registerNumber, meter.registerNumber) &&
                Objects.equals(placementCode, meter.placementCode);
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n Registernummer: " + registerNumber);
        sb.append("\n plasseringskode: " + placementCode);
        sb.append("\n Status: " + status);
        return sb.toString();
    }
}
