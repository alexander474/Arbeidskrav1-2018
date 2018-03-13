public class Thermometer extends Meter{
    double maxTemperature, minTemperature; //Celcius

    public Thermometer(String registerNumber, String placementCode, boolean status, double maxTemperature, double minTemperature) {
        super(registerNumber, placementCode, status);
        setMaxTemperature(maxTemperature);
        setMinTemperature(minTemperature);
    }

    public Thermometer(){

    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(double maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public double getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Termometer");
        sb.append(super.toString());
        sb.append("\nmax temperatur: " + maxTemperature);
        sb.append("\nmin temperatur: " + minTemperature + "\n");
        return sb.toString();
    }
}
