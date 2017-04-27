package com.cxd.test;

import com.cxd.weatherobserver.ConcreteObserver;
import com.cxd.weatherobserver.ConcreteWeatherSubject;

/**
 * Created by cai x d
 * on2017/4/27 0027.
 */
public class ObserverClientTest {
    public static void main(String[] args) {
        //1.创建目标
        ConcreteWeatherSubject weather = new ConcreteWeatherSubject();

        //2.创建观察者
        ConcreteObserver observerGirl = new ConcreteObserver();
        observerGirl.setObserverName("黄明女朋友");
        observerGirl.setRemindThing("使我们的第一次约会，地点：街心公园");

        ConcreteObserver observerMom = new ConcreteObserver();
        observerMom.setObserverName("黄明的老妈");
        observerMom.setRemindThing("是一个购物的好日子，明天去天虹扫货");

        //3.注册观察者
        weather.attach(observerGirl);
        weather.attach(observerMom);

        //4.目标发布天气
        weather.setWeatherContent("明天天气晴朗，蓝天白云，气温28度");
    }
}
