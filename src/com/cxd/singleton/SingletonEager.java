package com.cxd.singleton;

/**
 * Created by cai x d
 * on2017/4/21 0021.
 * 单例模式
 * 应用场合：有些对象只需要一个就足够了
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：恶汉模式、懒汉模式
 */
public class SingletonEager {
    //1.将构造方法私有化，不允许外部直接创建对象
    private SingletonEager(){
    }

    //2.创建类的唯一实例,使用privete static修饰
    private static SingletonEager instance =  new SingletonEager();

    //3.提供一个获取实例的方法，使用privete static修饰
    public static SingletonEager getInstance(){
        return instance;
    }
}
