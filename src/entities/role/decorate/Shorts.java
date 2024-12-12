package entities.role.decorate;

import entities.role.Role;

import java.util.Vector;

public class Shorts extends RoleDecorator {
    public Shorts(Role role) {
        super(role);
    }
    @Override
    public String walk() {
        return role.walk();
    }
    @Override
    public String shoot() {
        return role.shoot();
    }
    @Override
    public Vector<String> getDescription() {
        Vector<String> desc = role.getDescription();
        desc.add("Shorts");
        return desc;
    }
}
