package com.cxd.javabringobserver;

import java.util.Observable;

/**
 * Created by cai x d
 * on2017/4/27 0027.
 * 天气目标的具体实现类
 */
public class ConcreteWeatherSubject extends Observable{

    //天气情况的内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        //天气情况有了，就要通知所有的观察者
        //注意在通知之前，在用java中的Observe模式时候下面这句话必不可少
        this.setChanged();
        //然后主动通知，这里我先用推的方式
        this.notifyObservers(content);

        //如果是拉的方式，我们就调用
        //this.notifyObservers();
    }
}
