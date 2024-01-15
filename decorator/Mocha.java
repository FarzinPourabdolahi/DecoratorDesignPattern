package decorator;

import abstractComponent.Beverage;

public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public float cost() {
        float cost = beverage.cost();
        if(beverage.getSize()==Size.TALL)
            return cost + 0.20f;
        else if(beverage.getSize()==Size.GRANDE)
            return cost + 0.25f;
        else if(beverage.getSize()==Size.VENTI)
            return cost + 0.30f;
        return cost;
    }

    public String getDescription(){
        return beverage.getDescription()+", Mocha";
    }
}
