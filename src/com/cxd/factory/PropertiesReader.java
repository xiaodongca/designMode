package com.cxd.factory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * properties文件的读取工具
 * Created by cai x d
 * on2017/4/21 0021.
 */
public class PropertiesReader {
    public Map<String,String> getProperties(){
        Properties props = new Properties();
        Map<String,String> map = new HashMap<String,String>();
        try{
            InputStream in = getClass().getResourceAsStream("type.properties");
            props.load(in);
            Enumeration en = props.propertyNames();
            while(en.hasMoreElements()){
                String key = (String) en.nextElement();
                String property = props.getProperty(key);
                map.put(key,property);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return map;
    }
}
