public class Bottle extends Product {
    private double volume;

    public Bottle(String name, double cost, double volume) {
        super(name, cost);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + ", volume: " + volume;
    }
}
