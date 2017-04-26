package com.cxd.adapter;

/**
 * Created by cai x d
 * on2017/4/26 0026.
 * 采用继承方式的插座适配器
 */
public class TwoPlugAdapterExtends extends GBTwoPlug implements  ThreePlugIf{
    @Override
    public void powerWithThree() {
        System.out.println("借助继承适配器");
        this.powerWithTwo();
    }
}
