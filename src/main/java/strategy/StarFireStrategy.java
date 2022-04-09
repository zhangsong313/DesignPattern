package strategy;

// 散弹开火
public class StarFireStrategy implements FireStrategy{
    private StarFireStrategy(){}
    private static final StarFireStrategy INSTANCE = new StarFireStrategy();
    public static StarFireStrategy getInstance(){return INSTANCE;}
    @Override
    public void fire(Tank tank) {
        System.out.println("star fire...");
    }
}
