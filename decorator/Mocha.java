package decorator;

import abstractComponent.Beverage;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public float cost() {
        return beverage.cost()+0.20f;
    }

    public String getDescription(){
        return beverage.getDescription()+", Mocha";
    }
}
