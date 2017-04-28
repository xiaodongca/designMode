package com.cxd.strategy;

import com.cxd.strategy.impl.FlyNoWay;

/**
 * Created by cai x d
 * on2017/4/28 0028.
 */
public class RubberDuck extends Duck{

    public RubberDuck(){
        super();
        super.setFlyingStragety(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("我全是发黄，嘴巴很红");
    }

    public void quack() {
        System.out.println("嘎~嘎~嘎~");
    }
}
