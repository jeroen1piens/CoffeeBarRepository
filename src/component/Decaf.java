package component;

public class Decaf extends Beverage {
    public Decaf() {
        setDescription("Decaf");
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
