package factory.factoryMethod;

import factory.entity.food.Food;

// 食物工厂
public abstract class FoodFactory {
    public abstract Food createFood();
}
