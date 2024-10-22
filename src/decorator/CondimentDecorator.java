package decorator;
import component.Beverage;
import java.lang.Override;

public abstract class CondimentDecorator extends Beverage {
    Beverage wrappedBeverage;

    @Override
    public abstract String getDescription();
}
