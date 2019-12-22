package com.test.kafka.bean.service.impl;

import com.test.kafka.bean.service.BaseService;
import com.test.kafka.bean.service.SleepService;
import org.springframework.stereotype.Service;

/**
 * @author machao
 * @date 2019/12/19
 * @time 12:11
 * @description
 **/
@Service
public class SleepServiceImpl extends BaseService implements SleepService {
    @Override
    public void doIt(Integer i) {
        hahha("sleep",i);
        System.out.println(map);
    }
}
