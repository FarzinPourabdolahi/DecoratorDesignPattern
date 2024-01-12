package decorator;

public class Whip extends CondimentDecorator{
    @Override
    public float cost() {
        return 0;
    }

    public String getDescription(){
        return super.getDescription();
    }
}
