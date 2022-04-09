package factory.abstractFactory;

import factory.entity.food.Food;
import factory.entity.food.MushRoom;
import factory.entity.vehicle.Broom;
import factory.entity.vehicle.Vehicle;
import factory.entity.weapon.MagicStick;
import factory.entity.weapon.Weapon;

/**
 * 魔法世界的工厂
 */
public class MagicFactory extends AbstractFactory {
    @Override
    public Food createFood() {
        return new MushRoom(); // 吃蘑菇
    }

    @Override
    public Vehicle createVehicle() {
        return new Broom(); // 骑扫帚
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick(); // 魔法棒攻击
    }
}
