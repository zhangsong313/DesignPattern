package strategy;
// 坦克
public class Tank {
    FireStrategy fireStrategy = NormalFireStrategy.getInstance(); // 内部持有一个发射策略

    public void fire(){
        fireStrategy.fire(this); // 调用当前发射策略开火
    }

    public void fire(FireStrategy f){ // 也可以接收一个策略参数
        f.fire(this);
    }
}
