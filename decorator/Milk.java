package decorator;

import abstractComponent.Beverage;

public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public float cost() {
        return beverage.cost()+0.10f;
    }

    public String getDescription(){
        return beverage.getDescription()+", Milk";
    }
}
