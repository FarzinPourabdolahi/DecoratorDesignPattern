package decorator;

import abstractComponent.Beverage;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public float cost() {
        return beverage.cost()+0.15f;
    }

    public String getDescription(){
        return beverage.getDescription()+", Soy";
    }
}
