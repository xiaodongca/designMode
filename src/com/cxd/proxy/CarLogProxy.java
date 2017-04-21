package com.cxd.proxy;

/**
 * Created by cai x d
 * on2017/4/21 0021.
 */
public class CarLogProxy implements Moveable{
    public CarLogProxy(Moveable m){
        super();
        this.m = m;
    }
    private Moveable m;

    @Override
    public void move() {
        System.out.println("日志开始...");
        m.move();
        System.out.println("日志结束...");
    }
}
