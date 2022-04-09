package factory;

import factory.abstractFactory.AbstractFactory;
import factory.abstractFactory.ModernFactory;
import factory.entity.food.Food;
import factory.entity.vehicle.Vehicle;
import factory.entity.weapon.Weapon;
import factory.factoryMethod.BreadFactory;
import factory.factoryMethod.FoodFactory;
import factory.factoryMethod.MushRoomFactory;

/**
 * 工厂模式
 * 1.抽象工厂:生产抽象产品族
 * 2.工厂方法:生产单一抽象产品
 */
public class 工厂模式 {
    public static void main(String[] args) {
        // 抽象工厂:方便在产品族方向扩展.但单一产品扩展麻烦.
//        AbstractFactory factory = new MagicFactory();
        AbstractFactory factory = new ModernFactory();
        Food food = factory.createFood();
        Vehicle vehicle = factory.createVehicle();
        Weapon weapon = factory.createWeapon();
        food.eat();
        vehicle.run();
        weapon.fire();

        System.out.println("--------------------------");
        // 工厂方法: 方便扩展产品,不方便扩展产品族.
//        FoodFactory foodFactory = new MushRoomFactory();
        FoodFactory foodFactory = new BreadFactory();
        Food food1 = foodFactory.createFood();
        food1.eat();

    }
}
