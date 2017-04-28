package com.cxd.strategy;

import com.cxd.strategy.impl.FlyNoWay;

/**
 * Created by cai x d
 * on2017/4/28 0028.
 */
public class BigYellowDuck extends Duck {

    public BigYellowDuck(){
        super();
        super.setFlyingStragety(new FlyNoWay());
    }
    @Override
    public void display() {
        System.out.println("我是身体很大，全身黄黄");
    }
}
