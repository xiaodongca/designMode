package com.cxd.test;

import com.cxd.factory.HairFactory;
import com.cxd.factory.HairInterface;

/**
 * 模拟实现
 * Created by cai x d
 * on2017/4/21 0021.
 */
public class factoryTest {
    public static void main(String[] args) {
     /*   HairInterface left = new LeftHair();
        left.draw();*/
     HairFactory factory = new HairFactory();
       /* HairInterface left = factory.getHair("left");
        left.draw();*/


        /*HairInterface left = factory.getHairByClass("com.cxd.factory.LeftHair");
        left.draw();*/
        HairInterface right = factory.getHairByClassKey("in");
        right.draw();

    }
}
