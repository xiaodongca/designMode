package com.cxd.weatherobserver;

import com.cxd.observer.Subject;

/**
 * 这是一个观察者的接口，定义一个更新的接口给那些在目标发送改变的时候被通知的对象
 * Created by cai x d
 * on2017/4/26 0026.
 */
public interface Observer {

    /**
     * 更新的接口
     * @param subject 传入目标对象，方便获取相应的目标对象的状态
     */
    public void update(WeatherSubject subject);
}
