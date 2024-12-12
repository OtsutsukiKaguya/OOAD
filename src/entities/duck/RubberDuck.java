package entities.duck;

import behaviors.fly.FlyNoWay;
import behaviors.quack.Squick;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super("RubberDuck");
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squick();
    }
}
