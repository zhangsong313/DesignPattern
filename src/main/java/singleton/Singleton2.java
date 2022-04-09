package singleton;

// 懒汉式
public class Singleton2 {
    private Singleton2(){}
    private static
    volatile // 在普通并发场景下难以出现
    Singleton2 INSTANCE;
    public static Singleton2 getInstance(){
        if(INSTANCE==null){
            synchronized(Singleton2.class){
                if(INSTANCE==null){
                    INSTANCE = new Singleton2();
                }
            }
        }
        return INSTANCE;
    }
}
