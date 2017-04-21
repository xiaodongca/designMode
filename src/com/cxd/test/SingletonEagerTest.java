package com.cxd.test;


import com.cxd.singleton.SingletonEager;


/**
 * Created by cai x d
 * on2017/4/21 0021.
 */
public class SingletonEagerTest {
    public static void main(String[] args) {
        SingletonEager s1 = SingletonEager.getInstance();
        SingletonEager s2 = SingletonEager.getInstance();
        if (s1 == s2) {
            System.out.println("s1和s2是同一个实例");
        } else {
            System.out.println("s1和s2不是同一个实例");
        }
    }
}
