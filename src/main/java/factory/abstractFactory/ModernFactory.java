package factory.abstractFactory;

import factory.entity.food.Bread;
import factory.entity.food.Food;
import factory.entity.vehicle.Car;
import factory.entity.vehicle.Vehicle;
import factory.entity.weapon.AK47;
import factory.entity.weapon.Weapon;

/**
 * 现代工厂
 */
public class ModernFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new Bread(); // 吃面包
    }

    @Override
    public Vehicle createVehicle() {
        return new Car(); // 开汽车
    }

    @Override
    public Weapon createWeapon() {
        return new AK47(); // 枪支
    }
}
