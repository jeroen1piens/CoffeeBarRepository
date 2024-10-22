package component;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        setDescription("Houseblend");
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
