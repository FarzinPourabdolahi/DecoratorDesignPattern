package componenet;

import abstractComponent.Beverage;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        setDescription("Dark Roast Coffee");
    }
    @Override
    public float cost() {
        return 0.99f;
    }
}
