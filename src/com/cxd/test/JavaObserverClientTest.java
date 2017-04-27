package com.cxd.test;

import com.cxd.javabringobserver.ConcreteObserver;
import com.cxd.javabringobserver.ConcreteWeatherSubject;

/**
 * Created by cai x d
 * on2017/4/27 0027.
 * java自带观察者模式测试类
 */
public class JavaObserverClientTest {

    public static void main(String[] args) {
        //创建天气作为一个目标，也可以说是被观察者
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();

        //创建黄明的女朋友作为观察者
        ConcreteObserver girl = new ConcreteObserver();
        girl.setObserverName("黄明的女朋友");

        //创建黄明的老妈作为观察者
        ConcreteObserver mom = new ConcreteObserver();
        mom.setObserverName("黄明的老妈");

        //注册观察者
        subject.addObserver(girl);
        subject.addObserver(mom);

        //目标更新天气情况
        subject.setContent("天气晴，气温28度");
    }

}
