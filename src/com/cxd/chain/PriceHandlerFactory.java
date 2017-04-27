package com.cxd.chain;

/**
 * Created by cai x d
 * on2017/4/27 0027.
 * 创建PriceHandler的工厂方法
 */
public class PriceHandlerFactory {

    public static PriceHandler createPriceHandler(){

        PriceHandler sales = new Sales();
        PriceHandler lead = new Lead();
        PriceHandler man = new Manager();
        PriceHandler dir = new Director();
        PriceHandler vp = new VicePresident();
        PriceHandler ceo = new CEO();

        sales.setSuccessor(lead);
        lead.setSuccessor(man);
        man.setSuccessor(dir);
        dir.setSuccessor(vp);
        vp.setSuccessor(ceo);

        return sales;
    }
}
