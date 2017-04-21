package com.cxd.test;


import com.cxd.abstractfactory.*;

/**
 * Created by cai x d
 * on2017/4/21 0021.
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
       /*PersonFactory factory = new MCFacory();
       Girl girl = factory.getGirl();
       girl.drawWomen();*/

       PersonFactory factory = new HNFacory();
        Boy boy = factory.getBoy();
        boy.drawMan();
    }

}
