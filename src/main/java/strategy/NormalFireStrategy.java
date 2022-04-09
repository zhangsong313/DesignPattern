package strategy;
// 普通开火模式
public class NormalFireStrategy implements FireStrategy{
    private NormalFireStrategy(){}
    private static final NormalFireStrategy INSTANCE = new NormalFireStrategy();
    public static NormalFireStrategy getInstance(){return INSTANCE;}
    @Override
    public void fire(Tank tank) {
        System.out.println("Normal Fire...");
    }
}
