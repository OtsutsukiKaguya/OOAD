package environment;

import entities.role.Observer;

import java.util.Vector;

public class Weather {
    private String curWea;
    private Vector<Observer> subs = new Vector<>();

    public void attach(Observer obs) {
        subs.add(obs);
    }

    public void detach(Observer obs) {
        subs.remove(obs);
    }

    public void notifyObservers() {
        for (Observer obs : subs) {
            obs.update(curWea);
        }
    }

    public void turnCold() {
        curWea = "Cold";
        notifyObservers();
        System.out.println("Turned Cold");
    }

    public void turnHot() {
        curWea = "Hot";
        notifyObservers();
        System.out.println("Turned Hot");
    }

    public void turnStorm() {
        curWea = "Storm";
        notifyObservers();
        System.out.println("Storm is coming!");
    }

    public void EnemyAppearance() {
        curWea = "EnemyDetected";
        System.out.println("\nEnemy appeared in the sky!");
        notifyObservers();
    }
}
