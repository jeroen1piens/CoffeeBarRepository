package decorator;

import component.Beverage;

public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        wrappedBeverage = beverage;
    }

    @Override
    public double cost() {
        return wrappedBeverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return wrappedBeverage.getDescription() + ", Whip";
    }
}
