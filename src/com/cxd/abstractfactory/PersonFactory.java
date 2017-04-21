package com.cxd.abstractfactory;

/**
 * 人物实现接口
 * Created by cai x d
 * on2017/4/21 0021.
 */
public interface PersonFactory {

    public Boy getBoy();

    public Girl getGirl();
}
