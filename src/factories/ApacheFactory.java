package factories;

import entities.plane.Apache;
import entities.plane.PlaneProduct;

public class ApacheFactory implements PlaneFactory {
    @Override
    public PlaneProduct produce(String name) {
        Apache Plane = new Apache();
        Plane.setName(name);
        return Plane;
    }
}
