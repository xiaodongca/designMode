package com.cxd.strategy;

import com.cxd.strategy.impl.FlyWithWin;

/**
 * Created by cai x d
 * on2017/4/27 0027.
 */
public class MallardDuck extends Duck {


    public MallardDuck(){
        super();
        super.setFlyingStragety(new FlyWithWin());
    }

    @Override
    public void display() {
        System.out.println("我的脖子是绿色的");
    }

}
