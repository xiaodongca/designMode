package com.cxd.singleton;

/**
 * Created by cai x d
 * on2017/4/21 0021.
 * 懒汉模式
 * 区别：饿汉模式特点是加载类时比较慢，但运行时获取对象的速度比较快，线程安全
 *       懒汉模式的特点是加载类时比较快，但运行时获取对象的速度比较慢，线程不安全
 */
public class SingletonSluggard {
    //1.将构造方法私有化，不允许外边直接创建对象
    private SingletonSluggard(){
    }

    //2.声明类的唯一实例，使用private static修饰
    private static SingletonSluggard instance;

    //3.提供一个用于获取实例的方法，使用public static修饰‘
    public  static SingletonSluggard getInstance(){
        if (instance == null){
            instance = new SingletonSluggard();
        }
        return instance;
    }
}
