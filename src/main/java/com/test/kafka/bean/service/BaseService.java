package com.test.kafka.bean.service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author machao
 * @date 2019/12/19
 * @time 12:10
 * @description
 **/
public class BaseService {
    public Map<String,String> map = new HashMap<>();

    public void hahha(String name,Integer i){
        if(name.equals("fast")){
            map.put("fast","hhh");
        }else{
            map.put("sleep"+i,name);
        }
    }

}
