package facade;

/**
 * 当系统中有很多对象需要和外部交互,可以定义一个对象持有这些对象.外部只与一个对象交互.
 * 这个对象就是系统的门面对象.
 *
 * 例如,游戏中有很多物体,都需要和游戏引擎交互,封装一个GameModel持有所有的游戏对象.游戏引擎只与这个对象交互.
 * 具体各物体的交互实现在GameModel内完成.
 */
public class 门面模式 {
    public static void main(String[] args) {
        // 游戏引擎持有各种对象
        Bullet bullet = new Bullet();
        Tank tank = new Tank();
        Wall wall = new Wall();

        // 调用各个对象的绘制方法
        bullet.paint();
        tank.paint();
        wall.paint();

        System.out.println("-------------");

        GameModel gameModel = new GameModel();// 游戏引擎仅需持有一个游戏模型对象.
        gameModel.paint(); // 模型对象持有所有游戏对象并绘制所有对象
    }
}
