package decorator;

import component.Beverage;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        wrappedBeverage = beverage;
    }

    @Override
    public double cost() {
        return wrappedBeverage.cost() + 0.15;
    }

    @Override
    public String getDescription() {
        return wrappedBeverage.getDescription() + ", Soy";
    }
}
