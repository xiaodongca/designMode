package com.cxd.test;

import com.cxd.template.Coffee;
import com.cxd.template.RefreshBeverage;
import com.cxd.template.Tea;

/**
 * Created by cai x d
 * on2017/4/28 0028.
 * 模板模式测试类
 */
public class RefreshBeverageTest {

    public static void main(String[] args){
        System.out.println("制备咖啡....");
        RefreshBeverage b1 = new Coffee();
        b1.prepareBeverageTemplate();

        System.out.println("咖啡好了！");

        System.out.println("\n**********************************\n");

        System.out.println("制备茶......");
        RefreshBeverage b2 = new Tea();
        b2.prepareBeverageTemplate();
        System.out.println("茶好了！");
    }
}
