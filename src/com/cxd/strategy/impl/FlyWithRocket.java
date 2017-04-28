package com.cxd.strategy.impl;

import com.cxd.strategy.FlyingStragety;

/**
 * Created by cai x d
 * on2017/4/28 0028.
 */
public class FlyWithRocket implements FlyingStragety{

    @Override
    public void performFly() {
        System.out.println("用火箭在太空遨游");
    }
}
