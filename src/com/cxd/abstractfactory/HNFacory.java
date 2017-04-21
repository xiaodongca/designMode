package com.cxd.abstractfactory;

/**
 * 新年系列工厂
 * Created by cai x d
 * on2017/4/21 0021.
 */
public class HNFacory implements PersonFactory {
    @Override
    public Boy getBoy() {
        return new HNBoy();
    }

    @Override
    public Girl getGirl() {
        return new HNGirl();
    }
}
