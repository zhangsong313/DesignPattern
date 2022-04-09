package strategy;

/**
 * 当方法需要根据参数判断大量case when进行不同类型的处理时,
 * 处理过程比较复杂且要求扩展性,
 * 可以考虑使用策略模式.
 * 将不同类型的操作封装为策略类.对象内部持有策略类或方法参数接收策略类.
 * 外部调用时通过传参,或修改对象内部策略来实现不同操作.
 *
 * java api中的Comparator就是常见的策略模式.
 */
public class 策略模式 {
    public static void main(String[] args) {
        Tank tank = new Tank();
        tank.fire();

        tank.fireStrategy = StarFireStrategy.getInstance();
        tank.fire();

        tank.fireStrategy = (t) -> {
            System.out.println("clear all...");
        };
        tank.fire();

        tank.fire((t) ->{
            System.out.println("temporary fire strategy...");
        });

        tank.fire();
    }
}
