package factories;

import entities.plane.Boeing;
import entities.plane.PlaneProduct;

public class BoeingFactory implements PlaneFactory {
    @Override
    public PlaneProduct produce(String name) {
        Boeing Plane = new Boeing();
        Plane.setName(name);
        return Plane;
    }
}
