package factory.entity.food;

/**
 * 面包
 */
public class Bread extends Food {
    @Override
    public void eat() {
        System.out.println("eating bread...");
    }
}
