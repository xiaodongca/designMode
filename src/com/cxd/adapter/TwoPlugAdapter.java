package com.cxd.adapter;

/**
 * Created by cai x d
 * on2017/4/26 0026.
 * 二相转三相的插座适配器
 */
public class TwoPlugAdapter implements ThreePlugIf{

    private GBTwoPlug twoPlug;

    public TwoPlugAdapter(GBTwoPlug plug){
        this.twoPlug = plug;
    }
    @Override
    public void powerWithThree() {
        System.out.println("通过转换");
        twoPlug.powerWithTwo();
    }
}
