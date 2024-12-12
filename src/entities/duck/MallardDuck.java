package entities.duck;

import behaviors.fly.FlyWithWings;
import behaviors.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        super("MallardDuck");
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
