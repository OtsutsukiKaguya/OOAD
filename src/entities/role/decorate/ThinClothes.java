package entities.role.decorate;

import entities.role.Role;

import java.util.Vector;

public class ThinClothes extends RoleDecorator {
    public ThinClothes(Role role) {
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
        desc.add("Thin Clothes");
        return desc;
    }
}
