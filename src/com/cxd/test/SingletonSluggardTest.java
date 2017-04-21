package com.cxd.test;

import com.cxd.singleton.SingletonSluggard;

/**
 * Created by cai x d
 * on2017/4/21 0021.
 */
public class SingletonSluggardTest {
    public static void main(String[] args) {
        SingletonSluggard s1 = SingletonSluggard.getInstance();
        SingletonSluggard s2 = SingletonSluggard.getInstance();
        if (s1 == s2) {
            System.out.println("s1和s2是同一个实例");
        } else {
            System.out.println("s1和s2不是同一个实例");
        }
    }
}
