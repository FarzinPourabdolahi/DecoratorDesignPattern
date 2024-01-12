package decorator;

public class Soy extends CondimentDecorator{
    @Override
    public float cost() {
        return 0;
    }

    public String getDescription(){
        return super.getDescription();
    }
}
