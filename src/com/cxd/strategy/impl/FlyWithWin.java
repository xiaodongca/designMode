package com.cxd.strategy.impl;

import com.cxd.strategy.FlyingStragety;

/**
 * Created by cai x d
 * on2017/4/27 0027.
 */
public class FlyWithWin implements FlyingStragety{
    @Override
    public void performFly() {
        System.out.println("振翅高飞");
    }
}
