package entities.role;

import java.util.Vector;

public class Boy extends Role {
    @Override
    public Vector<String> getDescription() {
        // Implement description logic
        return new Vector<>();
    }

    @Override
    public String walk() {
        return "Boy is walking";
    }

    @Override
    public String shoot() {
        return "Boy is shooting";
    }
}
