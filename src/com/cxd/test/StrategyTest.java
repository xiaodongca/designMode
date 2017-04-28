package com.cxd.test;

import com.cxd.strategy.*;

/**
 * Created by cai x d
 * on2017/4/27 0027.
 */
public class StrategyTest {

    public static void main(String[] args){
        System.out.println("测试鸭子程序");
        Duck duck =null;
        //duck = new MallardDuck();
        //duck = new RedheadDuck();
        //duck = new RubberDuck();
        //duck = new BigYellowDuck();
        duck = new SpaceDuck();
        duck.display();
        duck.quack();
        duck.fly();

        System.out.println("测试完毕");
    }
}
