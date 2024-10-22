package decorator;

import component.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        wrappedBeverage = beverage;
    }

    @Override
    public double cost() {
        return wrappedBeverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return wrappedBeverage.getDescription() + ", Mocha";
    }
}
