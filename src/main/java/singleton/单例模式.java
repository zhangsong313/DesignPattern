package singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 1.饿汉式(推荐)
 *      构造函数私有化
 *      内部持有一个变量instance,指向new出的自身对象.
 *      提供公开方法返回instance.
 *      原理: jvm保证类只加载一次.
 * 2.懒汉式(双重检查)
 *      构造函数私有化
 *      内部持有一个volatile变量instance但不初始化
 *      提供公开方法返回instance,方法内先判断instance!=null,然后加锁,然后再判断instance!=null,然后初始化.
 *      原理: 双重检查和volatile保证只初始化一次.
 * 3.静态内部类
 *      构造方法私有化
 *      定义静态内部类,内部类中持有变量instance.
 *      提供公开方法返回静态内部类的成员变量instance.
 *      原理: 不访问内部类时不会加载内部类.由jvm保证类只加载一次.
 * 4.枚举法
 *      将类定义为枚举类型.内部持有一个变量instance
 *      原理: jvm保证类只加载一次.且枚举类无init方法,无法通过反射构建对象
 */
public class 单例模式 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {
        int last1 = Singleton1.getInstance().hashCode();
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                if(last1 != Singleton1.getInstance().hashCode()){
                    throw new RuntimeException("test 1 error ...");
                }
            }).start();
        }

        int last2 = Singleton2.getInstance().hashCode();
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                if(last2 != Singleton2.getInstance().hashCode()){
                    throw new RuntimeException("test 2 error ...");
                }
            }).start();
        }

        int last3 = Singleton3.getInstance().hashCode();
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                if(last3 != Singleton3.getInstance().hashCode()){
                    throw new RuntimeException("test 3 error ...");
                }
            }).start();
        }

        int last4 = Singleton4.INSTANCE.hashCode();
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                if(last4 != Singleton4.INSTANCE.hashCode()){
                    throw new RuntimeException("test 4 error ...");
                }
            }).start();
        }

        Constructor<Singleton3> constructor = Singleton3.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object o3 = constructor.newInstance();
        System.out.println(o3.hashCode());
        System.out.println(last3);

        Constructor<Singleton4> constructor2 = Singleton4.class.getDeclaredConstructor();
        constructor2.setAccessible(true); // java.lang.NoSuchMethodException: singleton.Singleton4.<init>()
        Object o4 = constructor2.newInstance();
        System.out.println(o4.hashCode());
        System.out.println(last3);
    }
}
