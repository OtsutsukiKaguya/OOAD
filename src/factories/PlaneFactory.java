package factories;

import entities.plane.PlaneProduct;

public interface PlaneFactory {
    PlaneProduct produce(String name);
}

