import entities.duck.Duck;
import entities.duck.MallardDuck;
import entities.plane.EnemyPlane;
import entities.plane.PlaneProduct;
import entities.role.Boy;
import entities.role.Girl;
import entities.role.Hunter;
import entities.role.Role;
import entities.role.decorate.*;
import environment.Weather;
import factories.ApacheFactory;
import factories.BoeingFactory;
import factories.EnemyPlaneFactory;
import factories.PlaneFactory;

public class Main {
    public static void main(String[] args) {
        // 场景1
        System.out.println("场景1：天气变化");
        Weather weather = new Weather();
        // 创建Hunter并设置衣服
        Role hunter = new Hunter();
        weather.attach(hunter);
        hunter.addDecorator(new Shoes());
        hunter.addDecorator(new ThinClothes());
        hunter.addDecorator(new Shorts());
        System.out.println("Hunter's clothes: " + hunter.getDescription());
        // Hunter在外面打猎
        System.out.println(hunter.walk());
        // 创建鸭子并设置行为
        Duck mallardDuck = new MallardDuck();
        System.out.println(mallardDuck.swim());
        //暴风雨来袭，角色更换衣物
        weather.turnStorm();
        System.out.println("Hunter's clothes now: " + hunter.getDescription());
        System.out.println(mallardDuck.performFly());
        // Hunter开枪，MallardDuck中枪掉落
        System.out.println(hunter.shoot());
        mallardDuck.beHit();

        // 场景2
        System.out.println("\n\n场景2：鸭子的生态循环");
        mallardDuck.startRevive();
        weather.detach(hunter);

        // 场景3~4
        System.out.println("\n\n场景3~4：飞机的互动和室内避难");
        // 创建天气对象并设置为寒冷
        weather.turnCold();
        // 创建Boy和Girl并设置Cold场景下的衣服
        Role boy = new Boy();
        boy.addDecorator(new Shoes());
        boy.addDecorator(new ThickCoat());
        boy.addDecorator(new Pants());
        weather.attach(boy);
        Role girl = new Girl();
        girl.addDecorator(new Shoes());
        girl.addDecorator(new ThickCoat());
        girl.addDecorator(new Pants());
        weather.attach(girl);
        // Boy和Girl在地面走路
        System.out.println(boy.walk());
        System.out.println(girl.walk());
        // 创建飞机工厂并生产飞机
        PlaneFactory boeingFactory = new BoeingFactory();
        PlaneFactory apacheFactory = new ApacheFactory();
        PlaneProduct boeing = boeingFactory.produce("Boeing");
        PlaneProduct apache = apacheFactory.produce("Apache");
        // 飞机起飞并飞行
        System.out.println(boeing.performFly());
        System.out.println(apache.performFly());
        System.out.println("They are performing a flight show!");
        // 敌机出现
        EnemyPlaneFactory enemyFactory = new EnemyPlaneFactory();
        EnemyPlane enemyPlane = (EnemyPlane) enemyFactory.produce("Enemy Plane");
        weather.EnemyAppearance();
        System.out.println("\n" + enemyPlane.performFly());
        // apache将敌机击落
        apache.shoot();
        enemyPlane.beHit();

        // 场景5
        System.out.println("\n\n场景5：喷气背包的发明");
        // 大家发现了喷气背包
        System.out.println("Boy and Girl discover jetpacks indoors!");
        boy.equipJetpack();
        girl.equipJetpack();
    }
}
