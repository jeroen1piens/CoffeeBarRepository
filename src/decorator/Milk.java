package decorator;

import component.Beverage;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        wrappedBeverage = beverage;
    }

    @Override
    public double cost() {
        return wrappedBeverage.cost() + 0.10;
    }

    @Override
    public String getDescription() {
        return wrappedBeverage.getDescription() + ", Milk";
    }
}
