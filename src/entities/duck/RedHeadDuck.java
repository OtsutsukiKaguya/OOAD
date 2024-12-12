package entities.duck;

import behaviors.fly.FlyWithWings;
import behaviors.quack.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super("RedHeadDuck");
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
