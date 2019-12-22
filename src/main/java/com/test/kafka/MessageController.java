package com.test.kafka;

import com.alibaba.fastjson.JSON;
import com.test.kafka.bean.CertBean;
import com.test.kafka.bean.service.FastService;
import com.test.kafka.bean.service.SleepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author machao
 * @date 2019/12/19
 * @time 9:03
 * @description
 **/
@RestController
public class MessageController {
    private static final String TOPIC="zhengshutest";

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Autowired
    private SleepService sleepService;

    @Autowired
    private FastService fastService;

    @GetMapping("/send/{num}")
    private String sendMessage(@PathVariable Integer num){
        SimpleDateFormat sdf  = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String baseSni = "cert";
        String fingerprint = sdf.format(new Date());
        String tfe_op = "192.156.1.";

        for (int i = 0 ;i<num ;i++){
            CertBean certBean = new CertBean(baseSni+i,fingerprint+i,tfe_op+i,i);
            kafkaTemplate.send(TOPIC,"key"+i, JSON.toJSONString(certBean));
        }
        return "success";
    }


    @GetMapping("/fast")
    private String fast(){
        fastService.doIt();
        return "success";
    }
    int i = 1;


    @GetMapping("/sleep")
    private String sleep(){
        sleepService.doIt(++i);
        return "success";
    }

}
