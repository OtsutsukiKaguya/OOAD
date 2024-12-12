package entities.role;

import java.util.Vector;

public abstract class Role implements Observer {
    protected String description;

    public abstract Vector<String> getDescription();
    public abstract String walk();
    public abstract String shoot();

    @Override
    public void update(String weather) {
        // Implement weather update logic
    }
}
