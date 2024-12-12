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

    public String turnCold() {
        curWea = "Cold";
        notifyObservers();
        return "Turned Cold";
    }

    public String turnHot() {
        curWea = "Hot";
        notifyObservers();
        return "Turned Hot";
    }
}
