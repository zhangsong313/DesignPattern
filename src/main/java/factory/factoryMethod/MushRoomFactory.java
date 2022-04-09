package factory.factoryMethod;

import factory.entity.food.Food;
import factory.entity.food.MushRoom;
// 蘑菇工厂
public class MushRoomFactory extends FoodFactory{
    @Override
    public Food createFood() {
        return new MushRoom(); // 生产蘑菇
    }
}
