package entities.role;

import java.util.Vector;

public class Hunter extends Role {
    @Override
    public Vector<String> getDescription() {
        // Implement description logic
        return new Vector<>();
    }

    @Override
    public String walk() {
        return "Hunter is walking";
    }

    @Override
    public String shoot() {
        return "Hunter is shooting";
    }
}
