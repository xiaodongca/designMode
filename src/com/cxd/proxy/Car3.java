package com.cxd.proxy;

/**
 * Created by cai x d
 * on2017/4/21 0021.
 */
public class Car3 implements Moveable{
    public Car3(Car car){
        super();
        this.car = car;
    }
    private Car car;
    @Override
    public void move() {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");
        car.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶...汽车行驶时间："+(endtime-starttime)+"毫秒！");
    }
}
