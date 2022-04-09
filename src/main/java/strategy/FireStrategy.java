package strategy;
// 如何开火的策略
public interface FireStrategy {
    void fire(Tank tank); // 子类需要实现如何开火,可以操作坦克发射的动作
}
