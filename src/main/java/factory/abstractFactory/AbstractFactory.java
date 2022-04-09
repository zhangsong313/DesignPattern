package factory.abstractFactory;

import factory.entity.food.Food;
import factory.entity.vehicle.Vehicle;
import factory.entity.weapon.Weapon;

/**
 * 抽象工厂
 */
public abstract class AbstractFactory {
    /**
     * 生产食物
     * @return
     */
    public abstract Food createFood();

    /**
     * 生产交通工具
     * @return
     */
    public abstract Vehicle createVehicle();

    /**
     * 生产武器
     * @return
     */
    public abstract Weapon createWeapon();
}
