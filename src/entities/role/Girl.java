package entities.role;

import java.util.Vector;

public class Girl extends Role {
    @Override
    public Vector<String> getDescription() {
        // Implement description logic
        return new Vector<>();
    }

    @Override
    public String walk() {
        return "Girl is walking";
    }

    @Override
    public String shoot() {
        return "Girl is shooting";
    }
}
