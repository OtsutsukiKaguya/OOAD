package entities.role.decorate;

import java.util.Vector;

public class RoleDecorator {
    private String description;

    public RoleDecorator(String description) {
        this.description = description;
    }

    public void addDescription(Vector<String> descriptionList) {
        descriptionList.add(description); // 添加描述
    }
}
