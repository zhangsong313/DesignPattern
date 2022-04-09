package factory.factoryMethod;

import factory.entity.food.Bread;
import factory.entity.food.Food;
// 面包工厂
public class BreadFactory extends FoodFactory{
    @Override
    public Food createFood() {
        return new Bread(); // 创建面包
    }
}
