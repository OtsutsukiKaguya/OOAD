package factories;

import entities.plane.Airbus;
import entities.plane.Apache;
import entities.plane.PlaneProduct;

public class AirbusFactory implements PlaneFactory {
    @Override
    public PlaneProduct produce(String name) {
        Airbus Plane = new Airbus();
        Plane.setName(name);
        return Plane;
    }
}
