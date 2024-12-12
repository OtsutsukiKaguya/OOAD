package entities.duck;

import behaviors.fly.FlyBehavior;
import behaviors.quack.QuackBehavior;
import shoot.Shootable;
import java.util.Vector;

public abstract class Duck implements Shootable {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected String name;
    protected boolean isDeath;

    public Duck(String name) {
        this.name = name;
    }

    public String performFly() {
        return name + " is " + flyBehavior.performFly();
    }

    public String performQuack() {
        return quackBehavior.performQuack();
    }

    public String swim() {
        return name + " is swimming";
    }

    @Override
    public Vector<String> shoot() {
        return new Vector<>();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void setIsDeath(boolean isDeath) {
        this.isDeath = isDeath;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public boolean getIsDeath() {
        return isDeath;
    }

}