package decorator;

import abstractComponent.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public String getDescription(){
        return super.getDescription();
    }
}
