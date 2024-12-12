package entities.role.decorate;

import entities.role.Role;

import java.util.Vector;

public abstract class RoleDecorator extends Role {
    protected Role role;

    public RoleDecorator(Role role) {
        this.role = role;
    }

    @Override
    public Vector<String> getDescription() {
        return role.getDescription();
    }
}
