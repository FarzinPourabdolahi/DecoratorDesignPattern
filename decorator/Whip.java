package decorator;

import abstractComponent.Beverage;

public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public float cost() {
        return beverage.cost()+0.10f;
    }

    public String getDescription(){
        return beverage.getDescription()+", Whip";
    }
}
