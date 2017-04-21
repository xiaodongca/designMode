package com.cxd.test;

import com.cxd.jdkproxy.TiemHandler;
import com.cxd.proxy.Car;
import com.cxd.proxy.Moveable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理测试类
 * Created by cai x d
 * on2017/4/21 0021.
 */
public class JdkProxyTest {
    public static void main(String[] args) {
        Car car = new Car();
        InvocationHandler lh = new TiemHandler(car);
        Class<?> cls = car.getClass();
        /**
         * loader 类加载器
         * interfaces 实现接口
         * h InvocationHandler
         */

      Moveable m = (Moveable) Proxy.newProxyInstance(cls.getClassLoader(),cls.getInterfaces(),lh);
      m.move();
    }
}
