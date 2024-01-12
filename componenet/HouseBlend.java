package componenet;

import abstractComponent.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend(){
        setDescription("House Blend Coffee");
    }
    @Override
    public float cost() {
        return 0.89f;
    }
}
