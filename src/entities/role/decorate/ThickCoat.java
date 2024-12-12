package entities.role.decorate;

import entities.role.Role;

import java.util.Vector;

public class ThickCoat extends RoleDecorator {
    public ThickCoat(Role role) {
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
        desc.add("Thick Coat");
        return desc;
    }
}
