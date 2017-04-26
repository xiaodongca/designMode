package com.cxd.weatherobserver;

/**
 * 具体的目标对象，负责把有关状态存入到相应的的观察者对象中
 * Created by cai x d
 * on2017/4/26 0026.
 */
public class ConcreteWeatherSubject extends WeatherSubject {

    //获取天气的内容信息
    private String weatherContent;

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        //内容有了，说明天气更新了，通知所有的订阅的人
    }
}
