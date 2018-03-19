
public class Clock extends Meter {
    double minTimeIntervall; // sekunder

    public Clock(String registerNumber, String placementCode, boolean status, double minTimeIntervall) {
        super(registerNumber, placementCode, status);
        setMinTimeIntervall(minTimeIntervall);
    }

    public Clock(){
        setMinTimeIntervall(0);
    }

    public double getMinTimeIntervall() {
        return minTimeIntervall;
    }

    public void setMinTimeIntervall(double minTimeIntervall) {
        this.minTimeIntervall = minTimeIntervall;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Klokke");
        sb.append(super.toString());
        sb.append("\ntidsintervall: " + getMinTimeIntervall() + " s\n");
        return sb.toString();
    }
}

