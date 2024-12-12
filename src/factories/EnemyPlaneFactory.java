package factories;

import entities.plane.EnemyPlane;
import entities.plane.PlaneProduct;

public class EnemyPlaneFactory implements PlaneFactory {
    @Override
    public PlaneProduct produce(String name) {
        EnemyPlane enemyPlane = new EnemyPlane();
        enemyPlane.setName(name);
        return enemyPlane;
    }
}
