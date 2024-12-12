package behaviors.fly;

public class FlyNoWay implements FlyBehavior{
    @Override
    public String performFly() {
        return "cannot fly";
    }
}
