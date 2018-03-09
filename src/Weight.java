public class Weight extends Meter {
    double minWeight, maxWeight; //gram

    public Weight(String registerNumber, String placementCode, boolean status, double minWeight, double maxWeight) {
        super(registerNumber, placementCode, status);
        setMaxWeight(maxWeight);
        setMinWeight(minWeight);
    }

    public Weight(){

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
        sb.append(super.toString());
        sb.append(maxWeight);
        sb.append(minWeight);
        return sb.toString();
    }
}
