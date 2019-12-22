package com.test.kafka.bean.service.impl;

import com.test.kafka.bean.service.BaseService;
import com.test.kafka.bean.service.FastService;
import org.springframework.stereotype.Service;

/**
 * @author machao
 * @date 2019/12/19
 * @time 12:11
 * @description
 **/

@Service
public class FastServiceImpl extends BaseService implements FastService {
    @Override
    public void doIt() {
        hahha("fast",1);
        System.out.println(map);
    }
}
