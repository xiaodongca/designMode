package com.cxd.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by cai x d
 * on2017/4/21 0021.
 */
public class TiemHandler implements InvocationHandler {
    public TiemHandler(Object target) {
        super();
        this.target = target;
    }

    private Object target;

    /**
     *
     * @param proxy 被代理对象
     * @param method 被代理对象的方法
     * @param args 方法的参数
     * @return
     * @throws Throwable
     *
     * 返回值：
     * Obejct 方法的返回值
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        method.invoke(target);
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶...汽车行驶时间："+(endtime-starttime)+"毫秒！");
        return null;
    }
}
