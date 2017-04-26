package com.cxd.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cai x d
 * on2017/4/26 0026.
 * 目标对象，它知道观察它的观察者，并提供注册（添加）和删除观察者的接口
 */
public class Subject {
    //用来保存注册的观察者对象
    private List<Observer> observers= new ArrayList<Observer>();

    //attach detach notifyObservers
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 删除集合中的指定观察者
     * @param observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * 通知所有注册的指定观察者
     */
    protected void notifyObservers(){
        for(Observer observer:observers){
            observer.update(this);
        }
    }
}
