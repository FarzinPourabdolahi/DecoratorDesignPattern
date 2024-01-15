package decorator;

import abstractComponent.Beverage;

public class Soy extends CondimentDecorator{

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public float cost() {
        float cost = beverage.cost();
        if(beverage.getSize()==Size.TALL)
            return cost + 0.15f;
        else if(beverage.getSize()==Size.GRANDE)
            return cost + 0.20f;
        else if(beverage.getSize()==Size.VENTI)
            return cost + 0.25f;
        return cost;
    }

    public String getDescription(){
        return beverage.getDescription()+", Soy";
    }
}
