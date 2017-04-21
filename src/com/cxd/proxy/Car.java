package com.cxd.proxy;

import java.util.Random;

/**
 * Created by cai x d
 * on2017/4/21 0021.
 */
public class Car implements Moveable {
    @Override
    public void move() {
        /*long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶...");*/
        //实现开车
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
      /*  long endtime = System.currentTimeMillis();
        System.out.println("汽车结束行驶...汽车行驶时间："+(endtime-starttime)+"毫秒！");*/

    }
}
