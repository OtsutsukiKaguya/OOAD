package entities.role;

import entities.role.decorate.Jetpack;
import entities.role.decorate.RainBoots;
import entities.role.decorate.RainCoat;
import entities.role.decorate.RoleDecorator;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Role implements Observer {
    private String name;
    protected boolean indoors = false;
    private List<RoleDecorator> decorators = new ArrayList<>();

    public Role(String name) {
        this.name = name;
    }

    public void addDecorator(RoleDecorator decorator) {
        decorators.add(decorator);
    }

    public Vector<String> getDescription() {
        Vector<String> description = new Vector<>();
        for (RoleDecorator decorator : decorators) {
            decorator.addDescription(description);
        }
        return description;
    }

    public String walk() {
        return indoors ? name + " is indoors" : name + " is walking outside";
    }

    public String shoot() {
        return indoors ? name + " is indoors and not shooting" : name + " is shooting";
    }

    public void equipJetpack() {
        indoors = false;
        this.addDecorator(new Jetpack());
        System.out.println(name + " is flying between clouds and buildings with jetpack!");
    }

    public void update(String weather) {
        if ("Storm".equals(weather)) {
            this.addDecorator(new RainCoat());
            this.addDecorator(new RainBoots());
            System.out.println(name + " observed the storm forecast and changed clothes.");
        }
        else if ("EnemyDetected".equals(weather)) {
            indoors = true;
            System.out.println(name + " noticed the enemy and moved indoors!");
        }

    }
}
