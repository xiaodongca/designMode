package com.cxd.strategy;

import com.cxd.strategy.impl.FlyWithWin;

/**
 * Created by cai x d
 * on2017/4/27 0027.
 */
public class RedheadDuck extends Duck {

    public RedheadDuck(){
        super();
        super.setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的头是红色的");
    }

}
