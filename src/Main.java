import entities.duck.Duck;
import entities.duck.MallardDuck;
import entities.duck.RedHeadDuck;
import entities.duck.RubberDuck;
import entities.plane.PlaneProduct;
import entities.role.Boy;
import entities.role.Girl;
import entities.role.Hunter;
import entities.role.Role;
import entities.role.decorate.*;
import environment.Weather;
import factories.ApacheFactory;
import factories.BoeingFactory;
import factories.PlaneFactory;

public class Main {
    public static void main(String[] args) {
        // 场景1（Hot）
        System.out.println("场景1（Hot）：");

        // 创建天气对象并设置为炎热
        Weather weather = new Weather();
        weather.turnHot();

        // 创建Hunter并设置Hot场景下的衣服
        Role hunter = new Hunter();
        hunter = new Shoes(hunter);
        hunter = new ThinClothes(hunter);
        hunter = new Shorts(hunter);
        weather.attach(hunter);

        System.out.println("Hunter's clothes: " + hunter.getDescription());
        // Hunter在地面走路
        System.out.println(hunter.walk());

        // 创建鸭子并设置行为
        Duck mallardDuck = new MallardDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();

        // 鸭子在水面游动
        System.out.println(mallardDuck.swim());
        System.out.println(redHeadDuck.swim());
        System.out.println(rubberDuck.swim());

        // MallardDuck飞向空中
        System.out.println(mallardDuck.performFly());

        // Hunter开枪，MallardDuck中枪掉落死亡
        System.out.println(hunter.shoot());
        mallardDuck.setIsDeath(true);
        System.out.println("MallardDuck is dead.");

        // 场景2（Cold）
        System.out.println("\n场景2（Cold）：");

        // 创建天气对象并设置为寒冷
        weather.turnCold();

        // 创建Boy和Girl并设置Cold场景下的衣服
        Role boy = new Boy();
        boy = new Shoes(boy);
        boy = new ThickCoat(boy);
        boy = new Pants(boy);
        weather.attach(boy);

        Role girl = new Girl();
        girl = new Shoes(girl);
        girl = new ThickCoat(girl);
        girl = new Pants(girl);
        weather.attach(girl);

        System.out.println("Boy's clothes: " + boy.getDescription());
        System.out.println("Girl's clothes: " + girl.getDescription());
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
    }
}
