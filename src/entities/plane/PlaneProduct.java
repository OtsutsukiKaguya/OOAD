package entities.plane;

import behaviors.fly.FlyBehavior;
import shoot.Shootable;
import java.util.Vector;


public abstract class PlaneProduct implements Shootable {
    protected FlyBehavior flyBehavior;
    protected String name;
    protected boolean isDeath;

    public abstract String performFly();

    @Override
    public Vector<String> shoot() {
        return new Vector<>();
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
