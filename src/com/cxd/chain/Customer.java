package com.cxd.chain;

import java.util.Random;

/**
 * Created by cai x d
 * on2017/4/27 0027.
 * 客户，请求折扣
 */
public class Customer {

    private PriceHandler priceHandler;

    public void setPriceHandler(PriceHandler priceHandler) {
        this.priceHandler = priceHandler;
    }

    public void requestDiscount(float discount){
        priceHandler.processDiscount(discount);
    }

    public static void main(String[] args){
        Customer customer = new Customer();
        customer.setPriceHandler(PriceHandlerFactory.createPriceHandler());

        Random random = new Random();
        for(int i = 1;i<=100;i++){
            System.out.println(i+":");
            customer.requestDiscount(random.nextFloat());
        }
    }

}
