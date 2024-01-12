package componenet;

import abstractComponent.Beverage;

public class Decaf extends Beverage {

    public Decaf(){
        setDescription("Decaf Coffee");
    }
    @Override
    public float cost() {
        return 1.05f;
    }
}
