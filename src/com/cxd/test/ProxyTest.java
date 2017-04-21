package com.cxd.test;

import com.cxd.proxy.*;

/**
 * 代理模式测试类
 * Created by cai x d
 * on2017/4/21 0021.
 */
public class ProxyTest {
    public static void main(String[] args) {
       /* Car car = new Car();
        car.move();*/

       //使用继承方式
      /*  Moveable m = new Car2();
        m.move();*/

      //使用聚合方式实现(推荐)
        /*Car car = new Car();
        Moveable m = new Car3(car);
        m.move();*/

        Car car = new Car();
        CarLogProxy clp = new CarLogProxy(car);
        CarTimeProxy ctp = new CarTimeProxy(clp);
        ctp.move();
    }
}
