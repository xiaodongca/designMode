package com.cxd.strategy;

import com.cxd.strategy.impl.FlyWithRocket;

/**
 * Created by cai x d
 * on2017/4/28 0028.
 */
public class SpaceDuck extends Duck {

    public SpaceDuck(){
        super();
        super.setFlyingStragety(new FlyWithRocket());
    }

    @Override
    public void display() {
        System.out.println("我头戴宇航头盔");
    }


    public void quack() {
        System.out.println("我通过无线电与你联系");
    }
}
