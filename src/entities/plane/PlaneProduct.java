package entities.plane;

import behaviors.fly.FlyBehavior;
import shoot.Shootable;


public abstract class PlaneProduct implements Shootable {
    protected FlyBehavior flyBehavior;
    protected String name;
    protected boolean isDeath;

    public abstract String performFly();

    public void shoot() {
        System.out.println(name + " shot the target!");
    }

    public void beHit() {
        isDeath = true;
        System.out.println(name + " has been hit and is destroyed!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsDeath(boolean isDeath) {
        this.isDeath = isDeath;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public String getName() {
        return name;
    }

    public boolean getIsDeath() {
        return isDeath;
    }
}
