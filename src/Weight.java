public class Weight extends Meter {
    double minWeight, maxWeight; //gram

    public Weight(String registerNumber, String placementCode, boolean status, double minWeight, double maxWeight) {
        super(registerNumber, placementCode, status);
        setMaxWeight(maxWeight);
        setMinWeight(minWeight);
    }

    public Weight(){
        setMinWeight(0);
        setMaxWeight(0);
    }

    public double getMinWeight() {
        return minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vekt");
        sb.append(super.toString());
        sb.append("\nmax vekt: " + getMaxWeight());
        sb.append("\nmin vekt: " + getMinWeight() + "\n");
        return sb.toString();
    }
}
