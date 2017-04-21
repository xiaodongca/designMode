package com.cxd.abstractfactory;

/**
 * 圣诞系列工厂
 * Created by cai x d
 * on2017/4/21 0021.
 */
public class MCFacory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        return new MCGirl();
    }
}
