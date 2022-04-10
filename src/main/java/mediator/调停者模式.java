package mediator;

/**
 * 当系统中有很多对象需要交互时,互相访问会形成大量的调用关系,比较混乱.
 * 这种情况下可以创建一个调停者对象,系统内的对象都与这个对象交互即可.
 *
 * 常见的消息中间件的重要作用之一就是在系统中担任调停者达到解耦的作用.
 *
 * 例如:游戏中的物体进行碰撞检测,每种物体需要和其他所有物体交互.这时只需要一个调停者持有所有游戏对象,
 * 在调停者内部进行碰撞检测即可.
 */
public class 调停者模式 {
}
