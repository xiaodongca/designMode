package com.cxd.chain;

/**
 * Created by cai x d
 * on2017/4/27 0027.
 * 销售，可以批准5%之内的折扣
 */
public class Sales extends PriceHandler{

    @Override
    public void processDiscount(float discount) {
        if(discount <= 0.05){
            System.out.format("%s批准了折扣：%.2f%n",this.getClass().getName(),discount);
        }else {
            successor.processDiscount(discount);
        }
    }
}
